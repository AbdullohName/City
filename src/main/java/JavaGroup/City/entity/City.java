package JavaGroup.City.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.List;

import static org.hibernate.id.SequenceGenerator.SEQUENCE;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "City")
public class City {
    @GeneratedValue(generator = "cityId")
    @SequenceGenerator(name = "cityId", sequenceName = "city_id_seq",allocationSize = 1)
    @Id
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "cityId")
    private List<Region> regions;
}
