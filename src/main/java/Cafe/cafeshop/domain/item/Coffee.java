package Cafe.cafeshop.domain.item;


import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@DiscriminatorValue("C")
public class Coffee extends Item{

    private String Coffeekind;
}
