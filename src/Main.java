import business.concretes.CategoryManager;
import dataAccess.concretes.CategoryHibernateDao;
import entities.Category;

public class Main {
    public static void main(String[] args) {
        CategoryManager categoryManager = new CategoryManager(new CategoryHibernateDao());
        categoryManager.add(new Category("Sayisal",1));
        categoryManager.add(new Category("Sayisal",2));
        categoryManager.delete("Sayisal");
        categoryManager.getAll().forEach(System.out::println);

    }
}