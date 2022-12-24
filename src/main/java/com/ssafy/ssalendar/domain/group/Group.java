package com.ssafy.ssalendar.domain.group;

import com.ssafy.ssalendar.domain.calendar.Calendar;
import com.ssafy.ssalendar.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "group_def")
@Builder
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long defNo;

    // 캘린더 매핑
    @ManyToOne
    @JoinColumn(name = "calendar_no")
    private Calendar calendar;

    // 유저 매핑
    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;

    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Enumerated(EnumType.STRING)
    private GroupParticipationStatus groupParticipationStatus;

}
