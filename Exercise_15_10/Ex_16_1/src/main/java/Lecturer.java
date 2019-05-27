/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kate
 */
public class Lecturer implements Person {

    private String name;
    private String email;
    private String subject;

    Lecturer(String name, String email, String subject) {
        this.name = name;
        this.email = email;
        this.subject = subject;
    }

    @Override
    public String getEmail() {
        return name;
    }

    @Override
    public String getName() {
        return email;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getDescription() {
        return ("Teaches " + subject);
    }
}
