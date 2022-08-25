package Cafe.cafeshop.domain.item;

import lombok.Getter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Getter
@DiscriminatorValue("Cookie")
public class Cookie extends Item{
    private String Cookiekind;
}
