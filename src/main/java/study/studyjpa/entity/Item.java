package study.studyjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public class Item {

    @Id
    @Column(name = "item_id")
    private Long id;

    private String name;

    private int price;

    private int stockQuantity;

}
