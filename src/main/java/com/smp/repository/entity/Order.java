package com.smp.repository.entity;

import com.smp.repository.entity.enums.EOrderStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.persistence.Table;
import java.util.List;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "tbl_order")
@Entity
public class Order extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long tableId;
    @ElementCollection
    private List<Long> contentId;
    private Long userId;
    private double totalPrice;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    private EOrderStatus orderStatus=EOrderStatus.ACTIVE;


}
