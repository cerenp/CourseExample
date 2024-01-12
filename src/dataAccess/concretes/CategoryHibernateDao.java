package dataAccess.concretes;

import dataAccess.abstracts.CategoryDao;
import dataAccess.databases.Database;
import entities.Category;

import java.util.List;


public class CategoryHibernateDao implements CategoryDao {

    private final Database database = new Database();

    @Override
    public List<Category> getAll() {
        return database.categories;
    }

    @Override
    public Category getByName(String name) {
        return database.categories.stream().filter(category -> category.getCategoryName().equals(name)).findFirst().orElse(null);
    }

    @Override
    public void add(Category category) {
        database.categories.add(category);
        System.out.println("Category added with Hibernate: " + category.getCategoryName());
    }

    @Override
    public void delete(Category category) {
        database.categories.remove(category);
        System.out.println("Category deleted with Hibernate: " + category.getCategoryName());

    }

}
