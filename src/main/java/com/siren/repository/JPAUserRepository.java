package com.siren.repository;

import com.siren.entity.JpaUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 22-1-23.
 */
public interface JpaUserRepository extends JpaRepository<JpaUser, Integer> {
}
