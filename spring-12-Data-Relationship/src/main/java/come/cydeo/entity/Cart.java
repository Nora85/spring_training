package come.cydeo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "cart item rel",
   joinColumns = @JoinColumn(name = "c_id"),
   inverseJoinColumns = @JoinColumn(name = "i_id"))
   private List<Item> itemList;

}
