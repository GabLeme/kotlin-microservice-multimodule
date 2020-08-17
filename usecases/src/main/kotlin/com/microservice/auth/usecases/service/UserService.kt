package com.microservice.auth.usecases.service

import com.microservice.auth.entities.dto.UserDTO

interface UserService {
    fun saveOrUpdate(u : UserDTO) : UserDTO
}