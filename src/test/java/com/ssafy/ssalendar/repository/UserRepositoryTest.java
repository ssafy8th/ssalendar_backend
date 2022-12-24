package com.ssafy.ssalendar.repository;

import com.ssafy.ssalendar.domain.alarm.Alarm;
import com.ssafy.ssalendar.domain.group.Group;
import com.ssafy.ssalendar.domain.user.User;
import com.ssafy.ssalendar.dto.group.GroupUser;
import com.ssafy.ssalendar.repository.calendar.CalendarRepository;
import com.ssafy.ssalendar.repository.group.GroupRepository;
import com.ssafy.ssalendar.repository.user.UserRepository;
import com.ssafy.ssalendar.service.groupService.GroupService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
//@Transactional
class UserRepositoryTest {
    @Autowired
    private UserRepository ur;

    @Autowired
    private CalendarRepository cr;
    @Autowired
    private GroupService gs;

    @Autowired
    private GroupRepository gr;
    @Test
     void userTest() {
        Optional<User> find = ur.findById(1L);
        find.ifPresent(seleceted -> {
            List<Alarm> li = seleceted.getAlarm();
//            System.out.println(li.size());
//            for (Alarm al: li) {
//                System.out.println("======================================조회 여러번?");
//                al.getAlarmNo();
//            }
        });
    }
    @Test
    void serviceTest(){
        List<User> user = new ArrayList<>();
        user.add(ur.findByUserName("jehyuck").get());
        user.add(ur.findById(1L).get());

        System.out.println("유저 넣기 시도합니다=====================================");
        gs.saveGroupUsers(user, 1L);

        Optional<Group> find = gr.findByUserUserName("jehyuck");
        System.out.println(find.get().getAuthority());
    }

    @Test
    void serviceGetUserNos(){
        List<GroupUser> userNos = gr.findUserNoByCalendarNo(1L);
        for (GroupUser i: userNos
             ) {
            System.out.println(i);
        }
    }
}