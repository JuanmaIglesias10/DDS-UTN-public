package segundoParcial2022;

import javax.persistence.*;

@Entity
@Table(name = "contactable")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Contactable {
    @Id
    @GeneratedValue
    private Long id;
}
