package JavaGroup.City.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

//    @ManyToOne
//    @JoinColumn(name = "city_id",referencedColumnName = "id")
//    private City city;
    @Column(name = "city_id")
    private Integer cityId;

    @OneToMany(mappedBy = "regionId")
    private List<District> districts;
}
