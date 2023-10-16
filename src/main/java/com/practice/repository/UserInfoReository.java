package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.model.UserInfo;

public interface UserInfoReository extends JpaRepository<UserInfo, Integer> {

}
