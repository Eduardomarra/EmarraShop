package com.emarra.EmarraShop.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.emarra.EmarraShop.entities.Produto;

public interface ProductRepository extends JpaRepository<Produto, Long> {

}
