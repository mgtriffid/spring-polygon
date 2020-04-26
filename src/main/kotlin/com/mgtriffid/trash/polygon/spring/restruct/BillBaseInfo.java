package com.mgtriffid.trash.polygon.spring.restruct;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BillBaseInfo {
    @Id long id;
    Long billId;
    String billNum;
    Date billDate;
}
