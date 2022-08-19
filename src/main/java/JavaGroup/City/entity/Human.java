package JavaGroup.City.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Human")
public class Human {
    @Id
    private Integer id;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "passport_id")
    private String passportId;

    @Column(name = "home_id")
    private Integer homeId;



//    @ManyToOne
//    @JoinColumn(name = "home_id",referencedColumnName = "id")
//    private Home home;
}
