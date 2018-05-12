package com.springbootdev.examples.security.swagger.controller;

import com.springbootdev.examples.swagger.exception.ModelNotFoundException;
import com.springbootdev.examples.swagger.exception.PersistentException;
import com.springbootdev.examples.swagger.model.dto.request.AddUserRequest;
import com.springbootdev.examples.swagger.model.dto.response.AddUserResponse;
import com.springbootdev.examples.swagger.model.dto.response.FindUserResponse;
import com.springbootdev.examples.swagger.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Api(value = "user-controller", description = "Endpoints for handling and managing user related operations", tags = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "creating new user")
    @PostMapping("/users")
    public AddUserResponse createUser(@Valid @RequestBody AddUserRequest addUserRequest, BindingResult bindingResult) throws PersistentException {
        if (bindingResult.hasErrors()) {
            throw new PersistentException(bindingResult.getAllErrors().get(0).getDefaultMessage());
        }
        return userService.create(addUserRequest);
    }

    @ApiOperation(value = "finding the user by id")
    @GetMapping("/users/{id}")
    public FindUserResponse findUserById(@PathVariable("id") Integer id) throws ModelNotFoundException {
        return userService.findUserById(id);
    }
}
