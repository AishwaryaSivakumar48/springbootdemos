package com.exmaple.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
