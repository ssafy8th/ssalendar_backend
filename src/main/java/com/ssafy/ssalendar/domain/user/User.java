package com.ssafy.ssalendar.domain.user;

import com.ssafy.ssalendar.domain.alarm.Alarm;
import com.ssafy.ssalendar.domain.calendar.Calendar;
import com.ssafy.ssalendar.domain.group.Group;
import com.ssafy.ssalendar.domain.participant.Participant;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_no")
    private Long userNo;
    private String password;
    private String userName;
    private String phone;
    private String email;
    private String birth;

    @OneToMany(mappedBy = "user")
//    @JoinColumn(name = "alarm_no")
    private List<Alarm> alarm;

    //participant
    @OneToMany(mappedBy = "user")
    private List<Participant> participant;

    //groupdef
    @OneToMany(mappedBy = "user")
    private List<Group> group;

    //calendar
    @OneToMany(mappedBy = "user")
    private List<Calendar> calendar;

}

