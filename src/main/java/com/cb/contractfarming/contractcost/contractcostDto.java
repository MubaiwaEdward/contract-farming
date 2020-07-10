package com.cb.contractfarming.contractcost;

import com.cb.contractfarming.common.BaseDto;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
public class contractcostDto extends BaseDto implements Serializable {
    private String contractName;
    private String description;
    private String type;
    private  Double price;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
