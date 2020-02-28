package com.adb.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adb.demo.entity.GroupEntity;

@Repository
public interface GroupRepository extends JpaRepository<GroupEntity, String> {

}
