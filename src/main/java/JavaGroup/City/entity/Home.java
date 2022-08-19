package JavaGroup.City.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Home")
public class Home {
    @Id
    private Integer id;
    private String name;
//    @ManyToOne
//    @JoinColumn(name = "district_id")
//    private District district;
    @Column(name = "district_id")
    private Integer districtId;

    @OneToMany(mappedBy = "homeId")
    private List<Human> humanList;

}
