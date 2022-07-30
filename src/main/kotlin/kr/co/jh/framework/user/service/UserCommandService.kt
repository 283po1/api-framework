package kr.co.jh.framework.user.service

import kr.co.jh.framework.entity.user.domain.User
import kr.co.jh.framework.entity.user.repository.UserRepository
import kr.co.jh.framework.user.dto.UserIn
import org.springframework.stereotype.Service

@Service
class UserCommandService (private val userRepository: UserRepository) {


    fun findById(id: Long): User {
        return userRepository.getByPK(id)
    }

    fun findByList(): List<User> {
        return userRepository.findAll()
    }

    fun saveUser(user: UserIn) :User {

        return userRepository.save(User.toEntity(user))
    }

}