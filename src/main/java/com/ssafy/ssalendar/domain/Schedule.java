package com.ssafy.ssalendar.domain;


import com.ssafy.ssalendar.domain.alarm.Alarm;
import com.ssafy.ssalendar.domain.calendar.Calendar;
import com.ssafy.ssalendar.domain.participant.Participant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@AllArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long scheduleNo;
    private String title;
    private String location;
    private String start_date;
    private String end_date;
    private String desc;

    @ManyToOne
    @JoinColumn(name = "calendar_no")
    private Calendar calendar;

    @OneToMany(mappedBy = "schedule")
    List<Alarm> alarm;

    @OneToMany(mappedBy = "schedule")
    List<Participant> participant;
}
