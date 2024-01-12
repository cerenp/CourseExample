package dataAccess.databases;

import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public final List<Category> categories = new ArrayList<Category>();

    public final List<Course> courses = new ArrayList<Course>();

    public final List<Instructor> instructors = new ArrayList<Instructor>();
}
