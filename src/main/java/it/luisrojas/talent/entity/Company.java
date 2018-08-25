package it.kalfu.dantho.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter @Setter @EqualsAndHashCode
@Entity
public class Company {
    @Id
    private long companyId;
    private long accountId;
    private String homeURL;
    private long logoId;
    private boolean active;
}
