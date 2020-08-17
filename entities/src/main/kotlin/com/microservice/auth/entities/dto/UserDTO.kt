package com.microservice.auth.entities.dto

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.microservice.auth.repository.domain.User
import lombok.*
import java.time.LocalDateTime

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
class UserDTO(
        var email: String,
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        var password: String
) {
        fun convertToDomain() : User {
                return User(this.email, this.password)
        }
}
