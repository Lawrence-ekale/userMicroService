package com.lawrence.user.service;

import com.lawrence.ValueObject.Department;
import com.lawrence.ValueObject.ResponseTemplateVO;
import com.lawrence.user.entity.Usero;
import com.lawrence.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;
    Logger logger = LoggerFactory.getLogger(UserService.class);
    
    @Autowired
    private RestTemplate restTemplate;

    public Usero saveUser(Usero user) {
        logger.info("Inside saveUser of User service");
        return userRepository.save(user);
    }

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		logger.info("Inside getUserWithDepartment of User service");
		
		ResponseTemplateVO responseTemplate = new ResponseTemplateVO();
		Usero user = userRepository.findByUserId(userId);
		
		String url = "http://DEPARTMENTSERVICE/departments/"+user.getDepartmentId();
		Department department = restTemplate.
				getForObject(url, Department.class);		
		responseTemplate.setUser(user);
		responseTemplate.setDepartment(department);
		return responseTemplate;
	}
}
