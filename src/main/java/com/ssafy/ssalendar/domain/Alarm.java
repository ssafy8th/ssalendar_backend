package com.ssafy.ssalendar.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alarm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alarmNo;
    private String alramTime;

    private Long calendarNo;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;
}
