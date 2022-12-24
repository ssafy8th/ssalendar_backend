package com.ssafy.ssalendar.repository.group;

import com.ssafy.ssalendar.domain.group.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group, Long>, GroupRepositroyCumstom {
    Optional<Group> findByUserUserNoAndCalendarCalendarNo(Long userNo, Long calendarNo);
    Optional<Group> findByUserUserName(String userName);
//    List<Long> findByCalendarCalendarNo(Long calendarNo);
}
