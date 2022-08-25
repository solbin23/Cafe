package Cafe.cafeshop.domain.item;

import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("B")
@Getter
public class Bread extends Item{

    private String Breadkind;


}
