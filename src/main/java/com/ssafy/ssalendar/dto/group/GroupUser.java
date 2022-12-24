package com.ssafy.ssalendar.dto.group;

import com.querydsl.core.annotations.QueryProjection;
import com.ssafy.ssalendar.domain.group.Authority;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GroupUser {
    String userName;
    String email;
    Authority authority;

    @QueryProjection
    public GroupUser(String userName, String email, Authority authority) {
        this.userName = userName;
        this.email = email;
        this.authority = authority;
    }
}
