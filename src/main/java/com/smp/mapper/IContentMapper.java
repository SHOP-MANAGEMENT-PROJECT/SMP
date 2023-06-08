package com.smp.mapper;

import com.smp.dto.request.NewCreateContentRequest;
import com.smp.repository.entity.Content;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IContentMapper {
    IContentMapper INSTANCE = Mappers.getMapper(IContentMapper.class);
    Content toContent(final NewCreateContentRequest dto);
}
