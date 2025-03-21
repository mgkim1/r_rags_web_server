package com.github.mgkim1.r_rags_web_server.repository;

import com.github.mgkim1.r_rags_web_server.entity.Radcheck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RadcheckRepository extends JpaRepository<Radcheck, Integer> {

    boolean existsByUsername(String username); // 사용자 이름 중복 여부 확인을 위해 사용
}
