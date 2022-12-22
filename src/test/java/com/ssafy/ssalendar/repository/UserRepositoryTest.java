package com.ssafy.ssalendar.repository;

import com.ssafy.ssalendar.domain.alarm.Alarm;
import com.ssafy.ssalendar.domain.user.User;
import com.ssafy.ssalendar.repository.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository ur;

    @Test
     void userTest() {
        Optional<User> find = ur.findById(1L);

        find.ifPresent(seleceted -> {
            List<Alarm> li = seleceted.getAlarm();
            for (Alarm al: li) {
                al.setAlarmTime("dddd");
            }
        });
    }
}