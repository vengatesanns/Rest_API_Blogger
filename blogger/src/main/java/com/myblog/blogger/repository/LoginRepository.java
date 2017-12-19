package com.myblog.blogger.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myblog.blogger.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {

}
