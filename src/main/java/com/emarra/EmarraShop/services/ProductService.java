package com.emarra.EmarraShop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emarra.EmarraShop.entities.Product;
import com.emarra.EmarraShop.repositories.ProductRepository;
import com.emarra.EmarraShop.to.ProductTO;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional
	public Page<ProductTO> getAll(Pageable pageable) {
		
		Page<Product> productTO = productRepository.findAll(pageable);
		
		return productTO.map(x -> new ProductTO(x));
		
	}

}
