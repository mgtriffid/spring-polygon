package com.mgtriffid.trash.polygon.spring.restruct;

import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Audited
@Entity
public class Postponement extends Restructuration{
    Date dueDate;
}
