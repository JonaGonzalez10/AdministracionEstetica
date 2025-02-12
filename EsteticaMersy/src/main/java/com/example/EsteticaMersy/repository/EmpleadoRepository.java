package com.example.EsteticaMersy.repository;

import com.example.EsteticaMersy.entity.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<users, Long> {

}
