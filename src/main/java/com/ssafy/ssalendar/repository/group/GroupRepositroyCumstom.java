package com.ssafy.ssalendar.repository.group;

import com.ssafy.ssalendar.dto.group.GroupUser;

import java.util.List;

public interface GroupRepositroyCumstom {
    List<GroupUser> findUserNoByCalendarNo(Long calendarNo);
}
