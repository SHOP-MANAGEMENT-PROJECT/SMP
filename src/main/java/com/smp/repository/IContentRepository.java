package com.smp.repository;

import com.smp.repository.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IContentRepository extends JpaRepository<Content,Long> {
    Optional<Content> findOptionalByName(String Name);
}
