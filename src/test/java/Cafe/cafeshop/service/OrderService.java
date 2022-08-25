package Cafe.cafeshop.service;

import Cafe.cafeshop.domain.Address;
import Cafe.cafeshop.domain.Member;
import Cafe.cafeshop.domain.item.Bread;
import Cafe.cafeshop.domain.item.Item;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class OrderService {

    @Autowired
    EntityManager em;

    @Test
    public void 상품주문() throws Exception {
        //given
        Member member = new Member();
        member.setName("회원1");
        member.setAddress(new Address("서울","강가","123-123"));
        em.persist(member);

        Bread bread = new Bread();
        bread.setName("밤빵");
        bread.setPrice(3400);
        bread.setStockQuantity(5);
        em.persist(bread);

        int orderCount = 2;
        //when

        //then

      }

      @Test
      public void 주문취소() throws Exception {
          //given

          //when

          //then

        }

        @Test
        public void 상품주문_재고수량초과() throws Exception {
            //given

            //when

            //then

          }
}
