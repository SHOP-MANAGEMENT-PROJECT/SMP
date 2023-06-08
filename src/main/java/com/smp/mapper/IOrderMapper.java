package com.smp.mapper;

import com.smp.dto.request.NewCreateOrderRequest;
import com.smp.repository.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IOrderMapper {
    IOrderMapper INSTANCE = Mappers.getMapper(IOrderMapper.class);
    Order toOrder (final NewCreateOrderRequest dto);
}
