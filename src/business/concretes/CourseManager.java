package business.concretes;

import business.abstracts.CourseService;
import dataAccess.abstracts.CategoryDao;
import dataAccess.abstracts.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager implements CourseService {

    private final CourseDao courseDao;

    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public Course getByName(String name) {
        return courseDao.getByName(name);
    }

    @Override
    public List<Course> getAll()
    {
        return courseDao.getAll();
    }

    @Override
    public boolean add(Course course) {
        if (courseDao.getByName(course.getCourseName()) != null) {
            System.out.println("Kurs ismi mevcut!");
            return false;
        }
        if (course.getPrice()<0){
            System.out.println("Kurs ismi sıfırdan kucuk olamaz!");
            return false;
        }
        courseDao.add(course);
        return true;
    }


    @Override
    public boolean delete(String name) {
        Course course = courseDao.getByName(name);
        if (course == null) {
            System.out.println("Kurs mevcut degil!");
            return false;
        }
        courseDao.add(course);
        return true;

    }
}
