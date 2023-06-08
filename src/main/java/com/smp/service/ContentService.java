package com.smp.service;

import com.smp.dto.request.NewCreateContentRequest;
import com.smp.dto.request.UpdateContentRequestDto;
import com.smp.dto.request.UpdateUserRequestDto;
import com.smp.exception.ErrorType;
import com.smp.exception.SmpServiceException;
import com.smp.mapper.IContentMapper;
import com.smp.repository.IContentRepository;
import com.smp.repository.entity.Content;
import com.smp.repository.entity.User;
import com.smp.repository.entity.enums.ERole;
import com.smp.repository.entity.enums.EStatus;
import com.smp.utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContentService extends ServiceManager<Content,Long> {
    private final IContentRepository contentRepository;
    public ContentService(IContentRepository contentRepository) {
        super(contentRepository);
        this.contentRepository = contentRepository;
    }

    /**
     * Dto ile content oluşturma.
     * @param dto
     * @return
     */
    public Boolean createContent(NewCreateContentRequest dto){
        if (contentRepository.findOptionalByName(dto.getName()).isPresent())
            throw new SmpServiceException(ErrorType.NAME_DUPLICATE);
        Content content = IContentMapper.INSTANCE.toContent(dto);
        save(content);
        return true;
    }

    /**
     * Icerık sılmek için kullanılır.Icerıgın statu durumunu pasif cekilir.
     * @param id
     * @return
     */
    public Boolean deleteContent(Long id){
        Optional<Content> content = findById(id);
        if(content.isEmpty())
            throw new SmpServiceException(ErrorType.NAME_DUPLICATE);
        content.get().setStatus(EStatus.PASSIVE);
        update(content.get());
        return true;
    }

    /**
     * Isım , ıcerıgın tipi ve fiyatı bu metot ıle degıstırebılırız.
     * @param dto
     * @return
     */
    public Boolean updateContent(UpdateContentRequestDto dto) {
        Optional<Content> content = contentRepository.findOptionalByName(dto.getName());
        if (content.isEmpty()) {
            throw new SmpServiceException(ErrorType.NAME_DUPLICATE);
        }
        content.get().setName(dto.getName());
        content.get().setType(dto.getType());
        content.get().setPrice(dto.getPrice());
        update(content.get());
        return true;
    }
}
