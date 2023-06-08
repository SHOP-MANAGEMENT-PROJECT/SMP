package com.smp.repository;

import com.smp.repository.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContentRepository extends JpaRepository<Content,Long> {
}
