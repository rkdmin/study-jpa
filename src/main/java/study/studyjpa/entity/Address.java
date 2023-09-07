package study.studyjpa.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
// @Embeddable 값 타입 사용 x
@Entity// 엔티티로 승격해서 사용
public class Address {

    @Id
    @GeneratedValue
    private Long Id;

    private String city;

    private String street;

    public Address () {};

}
