package it.kalfu.dantho.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter @Setter @EqualsAndHashCode
@Entity
public class Role {
    @Id
    private long _roleId;
    private long _companyId;
    private long _userId;
    private Date _createDate;
    private Date _modifiedDate;
    private long _classNameId;
    private long _classPK;
    private String _name;
    private String _title;
    private String _description;
    private int _type;
    private String _subtype;
}
