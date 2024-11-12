package com.emarra.EmarraShop.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.emarra.EmarraShop.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
