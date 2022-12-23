package com.ssafy.ssalendar.domain.participant;

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
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long participantNo;

    @ManyToOne
    @JoinColumn(name = "schedule_no")
    private Schedule schedule;

    @Enumerated(EnumType.STRING)
    private ScheduleParticipationStatus scheduleParticipationStatus;

    @ManyToOne
    @JoinColumn(name = "user_no")
    private User user;
}
