package Cafe.cafeshop.repository;


import Cafe.cafeshop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findOne(Long id) { //회원 단건 조회
        return em.find(Member.class, id);
    }

    public List<Member> findAll() { //회원 전체 조회
        return em.createQuery("select m from Member m",Member.class)         // (jpql , 반환타입)
                .getResultList();
    }

    public List<Member> findByName(String name){ //회원 이름으로 조회
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name",name)
                .getResultList();
    }
}
