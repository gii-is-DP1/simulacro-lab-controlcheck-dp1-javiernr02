package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProductType {

    @Id
    private Integer id;

    @NotEmpty
    @Size(min = 3, max = 50)
    @Column(unique = true)
    private String name;
}
