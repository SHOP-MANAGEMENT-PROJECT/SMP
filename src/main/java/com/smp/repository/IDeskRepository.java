package com.smp.repository;

import com.smp.repository.entity.Desk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeskRepository extends JpaRepository<Desk,Long> {

}
