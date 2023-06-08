package com.smp.dto.request;

import lombok.*;

import java.util.List;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class NewCreateOrderRequest {
    private Long tableId;
    private List<Long> contentId;
    private Long userId;
    private double totalPrice;
}
