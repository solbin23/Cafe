package Cafe.cafeshop.domain.item;


import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@DiscriminatorValue("M")
public class Madeleine extends Item{

    private String Madeleinekind;
}
