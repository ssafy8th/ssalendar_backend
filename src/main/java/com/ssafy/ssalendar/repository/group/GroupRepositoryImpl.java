package com.ssafy.ssalendar.repository.group;

import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.EntityManager;

public class GroupRepositoryImpl implements GroupRepositroyCumstom{

    private final JPAQueryFactory queryFactory;
    public GroupRepositoryImpl(EntityManager em){
        this.queryFactory = new JPAQueryFactory(em);
    }

}
