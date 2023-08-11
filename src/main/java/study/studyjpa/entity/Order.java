package study.studyjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import study.studyjpa.type.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    private LocalDate orderDate;

    private OrderStatus orderStatus;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany
    @JoinColumn(name = "order_item_id")
    private List<OrderItem> orderItemList = new ArrayList<>();

}
