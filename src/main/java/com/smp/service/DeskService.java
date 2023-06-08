package com.smp.service;

import com.smp.repository.IContentRepository;
import com.smp.repository.IDeskRepository;
import com.smp.repository.entity.Content;
import com.smp.repository.entity.Desk;
import com.smp.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class DeskService extends ServiceManager<Desk,Long> {
    private final IDeskRepository deskRepository;
    public DeskService(IDeskRepository deskRepository) {
        super(deskRepository);
        this.deskRepository = deskRepository;
    }
}
