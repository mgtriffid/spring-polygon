package com.mgtriffid.trash.polygon.spring.restruct;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class BillDetail {
    @Id
    long id;
    BigDecimal charged;
    BigDecimal currentAmount;
    Long matchObjectId;
    BigDecimal chosenAmount;
    String name;
}
