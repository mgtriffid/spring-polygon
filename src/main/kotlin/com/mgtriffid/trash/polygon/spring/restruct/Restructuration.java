package com.mgtriffid.trash.polygon.spring.restruct;

import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import java.util.List;

@Audited
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Restructuration {
    @Id
    long id;
    Long customerId;
    String contractNumber;
    Long extOrderId;
    @OneToMany @NotAudited
    List<ChosenBill> chosenBill;
}
