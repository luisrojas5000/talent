package it.kalfu.dantho.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Getter @Setter @EqualsAndHashCode
@Entity
public class Account {
    @Id
    private long accountId;
    private long userId;
    private boolean male;
    private Date birthday;

}
