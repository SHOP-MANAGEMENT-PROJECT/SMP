package com.smp.service;

import com.smp.repository.IContentRepository;
import com.smp.repository.entity.Content;
import com.smp.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ContentService extends ServiceManager<Content,Long> {
    private final IContentRepository contentRepository;
    public ContentService(IContentRepository contentRepository) {
        super(contentRepository);
        this.contentRepository = contentRepository;
    }
}
