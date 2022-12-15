package com.lawrence.user.controller;

import com.lawrence.ValueObject.ResponseTemplateVO;
import com.lawrence.user.entity.Usero;
import com.lawrence.user.service.UserService;
import lombok.extern.slf4j.Slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;
    Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/")
    public Usero saveUser(@RequestBody Usero user) {
        logger.info("Inside saveUser of User controller");
       return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
    	logger.info("Inside getUserWithDepartment of User controller");
    	
    	return userService.getUserWithDepartment(userId);
    }
}
