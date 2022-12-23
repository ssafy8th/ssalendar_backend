package com.ssafy.ssalendar.domain.calendar;

import java.util.List;

import javax.persistence.*;

import com.ssafy.ssalendar.domain.Schedule;
import com.ssafy.ssalendar.domain.alarm.Alarm;
import com.ssafy.ssalendar.domain.group.Group;
import com.ssafy.ssalendar.domain.user.User;

import lombok.*;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Calendar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "calendar_no")
	private Long calendarNo;
	private String calendarName;
	private String desc;

	@Column(columnDefinition = "ENUM('PRIVATE', 'ORIGINAL', 'COMMUNITY')")
	@Enumerated(EnumType.STRING)
	private CalendarStatus status;

	@OneToMany(mappedBy = "calendar")
	private List<Group> group;

	@ManyToOne
	@JoinColumn(name = "user_no")
	private User user;

	@OneToMany(mappedBy = "calendar")
	private List<Schedule> schedule;
}
