package com.cb.contractfarming.contractcost;
import com.cb.contractfarming.common.BaseEntity;
import com.cb.contractfarming.farmer.model.Farmer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "contractcost", indexes = {@Index(name = "indx_contcts", columnList = "id", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class contractcost extends BaseEntity {

    @Column(name = "contract_name", nullable = false, length = 45)
    private String contractName;

    @Column(name = "contarct_description",nullable = false,length = 225)
    private String description;

    @Column(name = "contract_type", nullable = false, length = 45)
    private String type;
    @Column(name = "price",nullable = false ,length = 10)
    private  Double price;

    @Column(name = "contract_start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name = "contract_end_date", nullable = false)
    private LocalDateTime endDate;

}

