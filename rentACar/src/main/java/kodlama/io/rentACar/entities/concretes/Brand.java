package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "brands")
//@Data //Getter ve Setter ikisini getirir. @Getter ya da @Setter ile degistirilebilir
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
