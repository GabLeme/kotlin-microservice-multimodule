package com.microservice.auth.usecases.service.impl

import com.microservice.auth.repository.repository.UserRepository
import com.microservice.auth.entities.dto.UserDTO
import org.springframework.beans.factory.annotation.Autowired
import com.microservice.auth.usecases.service.UserService
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
class UserServiceImpl(
        @Autowired
        private val userRepository: UserRepository
) : UserService{

    @Transactional
    override fun saveOrUpdate(u: UserDTO) : UserDTO {
        try {
            this.userRepository.save(u.convertToDomain())
        }
        catch(ex: Exception) {
            // handler
        }

        return u
    }
}