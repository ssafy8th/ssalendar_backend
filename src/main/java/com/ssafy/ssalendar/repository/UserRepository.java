package com.ssafy.ssalendar.repository;

import com.ssafy.ssalendar.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserNo(Long userNo);
//    @Query(name = "")
//    Optional<User> findUserAlarmByUserNo(Long userNo);
}
