/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kate
 */
public class EnchancedPersonViewer extends PersonViewer {

    public void viewPerson(Student person) {
        System.out.println("Grade: " + person.getGrade());
    }

    public void viewPerson(Lecturer person) {
        System.out.println("Subject: "+person.getSubject());
    }

    public void viewPerson(Employee person) {
        System.out.println("Person...");
        System.out.println("Name: " + person.getName());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Description: " + person.getDepartment());
        System.out.println("\n");
    }

    @Override
    public void view(Person person) {
        super.view(person);
        if (person instanceof Student) {
            viewPerson((Student) person);
        }
        if (person instanceof Lecturer) {
            viewPerson((Lecturer) person);
        }
        if (person instanceof Employee) {
            viewPerson((Employee) person);
        }
    }

}
