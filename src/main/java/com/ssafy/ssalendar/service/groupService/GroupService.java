package com.ssafy.ssalendar.service.groupService;

import com.ssafy.ssalendar.domain.user.User;

import java.util.List;

public interface GroupService {
    /**
     * 그룹 인원 등록
     *
     * @param users 등록할 그룹들
     */
    void saveGroupUsers(List<User> users, Long chalendarNo);

    /**
     * 그룹 인원 업데이트
     * 기존의 그룹들을 삭제하고 등록
     * @param users 등록할 그룹 인원들
     */
    void updateGroupUsers(List<User> users);


    /**
     * 그룹 인원 삭제
     *
     * @param userNo 삭제할 유저의 번호
     * @param chalendarNo 삭제할 유저가 속한 달력
     */
    void deleteGroupUsers(Long userNo, Long chalendarNo);

    /**
     * 그룹 유저 조회
     *
     * @param chalendarNo 그룹의 유저들을 달력
     * @return 그룹 유저
     */
    List<User> findByGroupUsers(Long chalendarNo);
}
