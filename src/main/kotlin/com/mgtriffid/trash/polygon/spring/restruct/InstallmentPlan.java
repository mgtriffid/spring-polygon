package com.mgtriffid.trash.polygon.spring.restruct;

import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.Date;

@Entity @Audited
public class InstallmentPlan extends Restructuration {
    @OneToOne StageDetailInfo initialPayment;
    int initialNumberOfStages;
    BigDecimal initialStageAmount;
    Date initialFirstPaymentDate;
}
