package dataAccess.concretes;

import dataAccess.abstracts.CourseDao;

import dataAccess.databases.Database;
import entities.Category;
import entities.Course;

import java.util.List;

public class CourseHibernateDao implements CourseDao {
    private final Database database = new Database();

    @Override
    public void add(Course course) {
        database.courses.add(course);
        System.out.println("Courses added with Hibernate: " + course.getCourseName());
    }

    @Override
    public void delete(Course course) {
        database.courses.remove(course);
        System.out.println("Courses deleted with Hibernate: " + course.getCourseName());

    }

    @Override
    public List<Course> getAll() {
        return database.courses;
    }

    @Override
    public Course getByName(String name) {
        return database.courses.stream().filter(course -> course.getCourseName().equals(name)).findFirst().orElse(null);
    }


}
