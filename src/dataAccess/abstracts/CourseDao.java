package dataAccess.abstracts;

import entities.Category;
import entities.Course;

import java.util.List;

public interface CourseDao {

    void add(Course course);

    void delete(Course course);

    List<Course> getAll();
    Course getByName(String name);

}
