package com.ssafy.ssalendar.service.groupService;

import com.ssafy.ssalendar.domain.group.Authority;
import com.ssafy.ssalendar.domain.group.Group;
import com.ssafy.ssalendar.domain.group.GroupParticipationStatus;
import com.ssafy.ssalendar.domain.user.User;
import com.ssafy.ssalendar.dto.group.GroupUser;
import com.ssafy.ssalendar.repository.calendar.CalendarRepository;
import com.ssafy.ssalendar.repository.group.GroupRepository;
import com.ssafy.ssalendar.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GroupServiceImp implements GroupService {

    @Autowired
    private GroupRepository gr;

    @Autowired
    private CalendarRepository cr;

    @Override
    public void saveGroupUsers(List<User> users, Long calendarNo) {
        for (User user : users) {
            cr.findById(calendarNo).ifPresent(
                    selected -> {
                        gr.save(Group.builder()
                                .calendar(selected)
                                .authority(selected.getUser().getUserNo().equals(user.getUserNo()) ? Authority.MASTER : Authority.ONLY_VIEW)
                                .user(user)
                                .groupParticipationStatus(GroupParticipationStatus.WAITING)
                                .build());
                    }
            );
        }
    }

    @Override
    public void updateGroupUsers(List<User> users) {
    }

    @Override
    public void deleteGroupUsers(Long userNo, Long chalendarNo) {

    }

    @Override
    public List<GroupUser> findByGroupUsers(Long chalendarNo) {
//        List<Long>
        return gr.findUserNoByCalendarNo(chalendarNo);
    }
}
