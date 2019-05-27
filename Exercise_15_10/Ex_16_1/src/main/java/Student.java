/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kate
 */
public class Student implements Person {

    private String name;
    private String email;
    private String grade;

    Student(String name, String email, String grade) {
        this.email = email;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String getEmail() {
        return name;
    }

    @Override
    public String getName() {
        return email;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String getDescription() {
return ("A "+grade+" grade student");
}
}