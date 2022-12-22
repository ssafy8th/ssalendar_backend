package com.ssafy.ssalendar.repository.group;

import com.ssafy.ssalendar.domain.group.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
