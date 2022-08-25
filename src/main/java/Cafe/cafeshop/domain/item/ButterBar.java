package Cafe.cafeshop.domain.item;

import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@DiscriminatorValue("BTB")
public class ButterBar extends Item{

    private String ButterBarkind;
}
