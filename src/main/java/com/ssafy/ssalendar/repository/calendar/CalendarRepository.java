package com.ssafy.ssalendar.repository.calendar;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssafy.ssalendar.domain.calendar.Calendar;

public interface CalendarRepository extends JpaRepository<Calendar, Long> {

	Optional<Calendar> findByCalendarNo(Long calendarNo);
}
