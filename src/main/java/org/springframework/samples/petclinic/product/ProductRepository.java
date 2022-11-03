package org.springframework.samples.petclinic.product;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    
    public List<Product> findAll();
    public List<ProductType> findAllProductTypes();
    public Optional<Product> findById(int id);
    public Product findByName(String name);
    public Product save(Product p);
}
