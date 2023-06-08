package com.smp.repository.entity;

import com.smp.repository.entity.enums.ETableStatus;
import lombok.*;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="tbl_desk")
@Entity
public class Desk extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tableName;
    private ETableStatus tableStatus;

}
