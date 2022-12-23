package com.ssafy.ssalendar.repository.group;

import com.querydsl.jpa.impl.JPAQueryFactory;
import static com.ssafy.ssalendar.domain.user.QUser.user;
import javax.persistence.EntityManager;
import java.util.List;

public class GroupRepositoryImpl implements GroupRepositroyCumstom{

    private final JPAQueryFactory queryFactory;
    public GroupRepositoryImpl(EntityManager em){
        this.queryFactory = new JPAQueryFactory(em);
    }

    @Override
    public List<Long> go(){
        return  queryFactory.select(user.userNo)
                .from(user)
//                .join()
                .fetch();
    }
}
