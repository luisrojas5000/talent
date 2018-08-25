package it.kalfu.dantho.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter @Setter @EqualsAndHashCode
@Entity
public class Team {
    @Id
    private long teamId;
    private long companyId;
    private long createUserId;
    private String userName;
    private Date createDate;
    private Date modifiedDate;
    private String name;
    private String description;
    private Date lastPublishDate;
}
