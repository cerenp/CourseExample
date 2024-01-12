package entities;

public class Course {
    private String courseName;
    private Instructor instructor;
     private Category category;

    private int price;

    public Course(String courseName, Instructor instructor, int price,Category category) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.category = category;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}
