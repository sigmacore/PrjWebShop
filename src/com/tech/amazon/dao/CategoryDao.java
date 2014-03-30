package com.tech.amazon.dao;

import com.tech.amazon.model.Category;

public interface CategoryDao {

	boolean save(Category category);

	boolean update(Category category);

	boolean delete(int cId);

	Category findById(int cId);

	Category findByName(String name);
}
