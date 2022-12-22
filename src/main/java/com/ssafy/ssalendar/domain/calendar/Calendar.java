package com.ssafy.ssalendar.domain.calendar;

import java.util.List;

import javax.persistence.*;

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
//  @JoinColumn(name = "alarm_no")
//	private List<Schedule> schedules;
	private List<Group> groups;

	@ManyToOne
	@JoinColumn(name = "calendar_no")
	private Calendar calendar;

}
