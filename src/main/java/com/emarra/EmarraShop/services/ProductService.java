package com.emarra.EmarraShop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.emarra.EmarraShop.entities.Product;
import com.emarra.EmarraShop.repositories.ProductRepository;
import com.emarra.EmarraShop.to.ProductTO;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Page<ProductTO> getAll(Pageable pageable) {
		Page<Product> product = productRepository.findAll(pageable);
		
		return product.map(ProductTO::new);
	}

}