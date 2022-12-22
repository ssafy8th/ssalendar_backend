package com.ssafy.ssalendar.domain.participant;

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
    private Long userNo;
    private Long scheduleNo;

    @Enumerated(EnumType.STRING)
    private ScheduleParticipationStatus scheduleParticipationStatus;

    @OneToOne
    @JoinColumn(name = "user_no")
    private User user;
}
