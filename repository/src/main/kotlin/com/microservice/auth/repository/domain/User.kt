package com.microservice.auth.repository.domain

import lombok.Getter
import lombok.NoArgsConstructor
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@NoArgsConstructor
data class User constructor(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long? = null,

        @Column(nullable = false)
        var email: String,

        @Column(nullable = false)
        var password: String,

        @Column(nullable = false)
        var dateCreated: LocalDateTime
) {
        constructor(email: String, password: String) : this(null, email, password, LocalDateTime.now()) {
                this.email = email
                this.password = password
        }
}