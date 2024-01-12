package dataAccess.abstracts;

import entities.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> getAll();
    Category getByName(String name);
    void add(Category category);
    void delete(Category category);
}
