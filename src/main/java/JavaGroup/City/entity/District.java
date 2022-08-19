package JavaGroup.City.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "District")
public class District {
    @Id
    private Integer id;
    private String name;
//    @ManyToOne
//    @JoinColumn(name = "region_id",referencedColumnName = "id")

//    private Region region;
    @Column(name = "region_id")
    private Integer regionId;

    @OneToMany(mappedBy = "districtId")
    private List<Home> homes;

}
