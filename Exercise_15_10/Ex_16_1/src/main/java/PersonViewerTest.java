/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kate
 */
public class PersonViewerTest {
    public static void main (String[] args){
        PersonViewer person = new PersonViewer();
        Person person1 = new Lecturer("Nicolae", "nicolaesirbu@gmail.com", "Java");
        Person person2 = new Employee("Ivanov", "ivanov@gmail.com", "Production");
        Person person3 = new Student("Kate", "lazarevkat@gmail.com", "C");
        
        person.view(person1);
        person.view(person2);
        person.view(person3);
    }
    
}
