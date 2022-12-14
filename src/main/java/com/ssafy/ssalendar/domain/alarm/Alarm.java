package com.ssafy.ssalendar.domain.alarm;

import com.ssafy.ssalendar.domain.schedule.Schedule;
import com.ssafy.ssalendar.domain.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Alarm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alarmNo;
    private String alarmTime;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;

    @ManyToOne
    @JoinColumn(name = "schedule_no")
    private Schedule schedule;
}
