package business.concretes;

import business.abstracts.CategoryService;
import dataAccess.abstracts.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager implements CategoryService {
    private final CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    @Override
    public Category getByName(String name) {
        return categoryDao.getByName(name);
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }

    @Override
    public boolean add(Category category) {
        if (categoryDao.getByName(category.getCategoryName())!=null) {
            System.out.println("Kurs ismi mevcut!");
            return false;
        }
        categoryDao.add(category);
        return true;
    }

    @Override
    public boolean delete(String name) {
        Category category = getByName(name);
        if (category == null) {
            System.out.println("Kurs bulunamadı!");
            return false;
        }
        categoryDao.delete(category);
        return true;
    }
}
