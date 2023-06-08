package com.smp.repository.entity;

import com.smp.repository.entity.enums.EOrderStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.persistence.Table;

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
    private Long contentId;
    private Long userId;
    private double totalPrice;
    private EOrderStatus orderStatus;


}
