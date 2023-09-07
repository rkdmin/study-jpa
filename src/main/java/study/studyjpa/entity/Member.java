package study.studyjpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

//    값 타입 사용하지 않는다.
//    @ElementCollection
//    @CollectionTable(name = "ADDRESS_HISTORY", joinColumns = @JoinColumn(name = "member_id"))
//    private List<Address> addressHistory = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)// 생명주기를 Member에서 다루면 값 타입과 비슷하게 됨
    @JoinColumn(name = "member_id")
    private List<Address> adddressHistory = new ArrayList<>();

}
