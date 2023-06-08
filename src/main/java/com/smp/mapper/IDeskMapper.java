package com.smp.mapper;

import com.smp.dto.request.NewCreateDeskRequest;
import com.smp.repository.entity.Desk;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IDeskMapper {
    IDeskMapper INSTANCE = Mappers.getMapper(IDeskMapper.class);
    Desk toDesk(final NewCreateDeskRequest dto);
}
