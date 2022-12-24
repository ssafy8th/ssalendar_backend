package com.ssafy.ssalendar.repository.group;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.ssafy.ssalendar.domain.group.Group;
import com.ssafy.ssalendar.dto.group.GroupUser;
import com.ssafy.ssalendar.dto.group.QGroupUser;

import static com.ssafy.ssalendar.domain.user.QUser.user;
import static com.ssafy.ssalendar.domain.group.QGroup.group;
import javax.persistence.EntityManager;
import java.util.List;

public class GroupRepositoryImpl implements GroupRepositroyCumstom{

    private final JPAQueryFactory queryFactory;
    public GroupRepositoryImpl(EntityManager em){
        this.queryFactory = new JPAQueryFactory(em);
    }


    @Override
    public List<GroupUser> findUserNoByCalendarNo(Long calendarNo) {
        return queryFactory.select(new QGroupUser(user.userName, user.email, group.authority))
                .from(group)
                .join(user)
                .on(user.userNo.eq(group.user.userNo))
                .where(group.calendar.calendarNo.eq(calendarNo))
                .fetch();
    }
}
