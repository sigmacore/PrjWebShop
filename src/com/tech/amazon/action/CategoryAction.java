package com.tech.amazon.action;

import com.tech.amazon.dao.CategoryDao;
import com.tech.amazon.dao.CategoryDaoImpl;
import com.tech.amazon.model.Category;

public class CategoryAction {

	private CategoryDao categoryDao = new CategoryDaoImpl();

	public boolean createNewCategory(String name, String desc, String status) {

		// do business processing here

		Category category = new Category(name, desc, status);
		return this.categoryDao.save(category);

	}
}
