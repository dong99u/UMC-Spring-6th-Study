package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import umc.spring.domain.common.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Review extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "review_id")
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(nullable = false)
    @ColumnDefault("0")
    private Float score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "store_id", nullable = false)
    private Store store;

    @OneToMany(mappedBy = "review", cascade = CascadeType.ALL)
    private List<ReviewImage> reviewImageList = new ArrayList<>();

    /*
    * 편의 메서드
    * */

    public static Review createReview(String title, String content, Float score, Member member, Store store) {
        return Review.builder()
                .title(title)
                .content(content)
                .score(score)
                .member(member)
                .store(store)
                .build();
    }

    /*
    * 연관 관계
    * 편의 메서드
    * */

    public void setMember(Member member) {
        this.member = member;
        member.getReviewList().add(this);
    }

    public void setStore(Store store) {
        this.store = store;
        store.getReviewList().add(this);
    }
}
