package com.smp.service;

import com.smp.dto.request.NewCreateDeskRequest;
import com.smp.dto.request.UpdateDeskRequestDto;
import com.smp.dto.request.UpdateUserRequestDto;
import com.smp.exception.ErrorType;
import com.smp.exception.SmpServiceException;
import com.smp.mapper.IContentMapper;
import com.smp.mapper.IDeskMapper;
import com.smp.repository.IContentRepository;
import com.smp.repository.IDeskRepository;
import com.smp.repository.entity.Content;
import com.smp.repository.entity.Desk;
import com.smp.repository.entity.User;
import com.smp.repository.entity.enums.EStatus;
import com.smp.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeskService extends ServiceManager<Desk,Long> {
    private final IDeskRepository deskRepository;
    public DeskService(IDeskRepository deskRepository) {
        super(deskRepository);
        this.deskRepository = deskRepository;
    }
    public Boolean createDesk(NewCreateDeskRequest dto){
        if (deskRepository.findOptionalByTableName(dto.getTableName()).isPresent())
            throw new SmpServiceException(ErrorType.TABLE_DUPLICATE);
        Desk desk = IDeskMapper.INSTANCE.toDesk(dto);
        save(desk);
        return true;
    }

    public Boolean updateDesk(UpdateDeskRequestDto dto) {
        Optional<Desk> desk = deskRepository.findOptionalByTableName(dto.getTableName());
        if (desk.isEmpty()) {
            throw new SmpServiceException(ErrorType.TABLE_NOT_FOUND);
        }
        desk.get().setTableName(dto.getTableName());
        desk.get().setTableStatus(dto.getStatus());
        update(desk.get());
        return true;
    }



}
