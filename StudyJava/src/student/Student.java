/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author ADMIN
 */
public abstract class Student {
    private String id;
    private String name;
    private String semester;
    private String course;

    public Student() {
    }

    public Student(String id, String name, String semester, String course) {
        this.id = id;
        this.name = name;
        this.semester = semester;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void input(){
        System.out.println("ID: ");
        setId(Utils.getStr());
        System.out.println("Student name: ");
        setName(Utils.getStr());
        System.out.println("Semester: ");
        setCourse(Utils.getStr());
        System.out.println("Course Name: ");
        setCourse(Utils.getCourse());
    }
    
    @Override
    public String toString() {
        return "\nID: " + this.id + "\nStudent Name: "+ this.name
                + "\nSemester: " + this.semester +"\nCourse name: " + this.course;
    }
    
}
