package com.jsp.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.crud.dao.Product;

public interface ProductRepository extends JpaRepository<Product,Long>
{
	
}
