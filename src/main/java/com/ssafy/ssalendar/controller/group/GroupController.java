package com.ssafy.ssalendar.controller.group;

import com.ssafy.ssalendar.dto.group.GroupUser;
import com.ssafy.ssalendar.service.groupService.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService gr;
    @GetMapping("/list/{calendarNo}")
    public ResponseEntity<List<GroupUser>> go(@PathVariable Long calendarNo){
        List<GroupUser> users = gr.findByGroupUsers(calendarNo);
        return new ResponseEntity(users, HttpStatus.OK);
    }
}
