package dataAccess.concretes;

import dataAccess.abstracts.InstructorDao;
import dataAccess.databases.Database;
import entities.Course;
import entities.Instructor;

import java.util.List;

public class InstructorHibernateDao implements InstructorDao {
    Database database = new Database();

    @Override
    public void add(Instructor instructor) {
        database.instructors.add(instructor);
        System.out.println("Instructor added with Hibernate: " + instructor.getName());
    }

    @Override
    public void delete(Instructor instructor) {
        database.instructors.remove(instructor);
        System.out.println("Instructor deleted with Hibernate: " + instructor.getName());
    }

    @Override
    public List<Instructor> getAll() {
        return database.instructors;
    }

    @Override
    public Instructor getByName(String name) {
        return database.instructors.stream().filter(instructor -> instructor.getName().equals(name)).findFirst().orElse(null);
    }


}