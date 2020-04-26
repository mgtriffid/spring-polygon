package com.mgtriffid.trash.polygon.spring.restruct;

import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Entity
@Audited
public class StageDetailInfo {
    @Id
    long id;
    Date stageDate;
    @OneToMany @NotAudited
    List <BillDetail> amountDetails;
}
