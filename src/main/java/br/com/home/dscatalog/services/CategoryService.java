package br.com.home.dscatalog.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.home.dscatalog.dto.CategoryDTO;
import br.com.home.dscatalog.entities.Category;
import br.com.home.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public CategoryDTO findById(Long id) {
		Optional<Category> result = repository.findById(id);
		Category entity = result.get();
		return new CategoryDTO(entity);
	}
}
