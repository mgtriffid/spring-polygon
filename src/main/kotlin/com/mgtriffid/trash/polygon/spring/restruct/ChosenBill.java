package com.mgtriffid.trash.polygon.spring.restruct;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class ChosenBill {
    @Id
    long id;
    @OneToOne BillBaseInfo billBaseInfo;
    @OneToMany List<BillDetail> billDetails;
}
