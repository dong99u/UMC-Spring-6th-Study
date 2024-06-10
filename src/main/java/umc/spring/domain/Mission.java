package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.mapping.MemberMission;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Mission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mission_id")
    private Long id;

    @ColumnDefault("0")
    private Integer reward;

    @Column(nullable = false)
    private LocalDate deadline;

    @Column(nullable = false, length = 500)
    private String missionSpec;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;

    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL)
    private List<MemberMission> memberMissionList = new ArrayList<>();

    /*
    * 연관 관계
    * 편의 메서드
    * */

    public void setStore(Store store) {
        this.store = store;
        store.getMissionList().add(this);
    }

    public void addMemberMissionList(MemberMission memberMission) {
        memberMissionList.add(memberMission);
        memberMission.setMission(this);
    }
}
