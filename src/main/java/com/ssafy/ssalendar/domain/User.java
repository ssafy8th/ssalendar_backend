package com.ssafy.ssalendar.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
//@RequiredArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pass;
    private String name;
    private String phone;
    private String email;
    private String birth;

    @OneToMany
    private List<Alarm> alarm;
}
