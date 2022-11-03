package org.springframework.samples.petclinic.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {

    @Id
    private Integer id;

    @NotEmpty
    @Size(min = 3, max = 50)
    private String name;

    @NotEmpty
    @PositiveOrZero
    private double price;

    private ProductType productType;
}
