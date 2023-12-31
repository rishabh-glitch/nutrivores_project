package com.cg.ofda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.ofda.dto.CategoryDto;

@Repository
public interface ICategoryRepository extends JpaRepository<CategoryDto, Long> {
	

}

