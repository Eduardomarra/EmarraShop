package com.emarra.EmarraShop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emarra.EmarraShop.services.ProductService;
import com.emarra.EmarraShop.to.ProdutoTO;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@GetMapping
	public ResponseEntity<Page<ProdutoTO>> getAll(Pageable pageable){
		Page<ProdutoTO> product = productService.getAll(pageable);
		return ResponseEntity.ok(product);
		
	}
}

