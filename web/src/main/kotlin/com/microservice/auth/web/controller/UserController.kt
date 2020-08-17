package com.microservice.auth.web.controller

import com.microservice.auth.entities.dto.UserDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.microservice.auth.usecases.service.UserService
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("/api/user")
class UserController(
        @Autowired
        val userService : UserService
) {

    @PostMapping
    fun saveUser(@RequestBody user : UserDTO) : ResponseEntity<UserDTO> {
        return ResponseEntity.ok(userService.saveOrUpdate(user));
    }
}