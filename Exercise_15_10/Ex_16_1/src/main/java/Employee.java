/*departmen
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kate
 */
public class Employee implements Person {

    private String name;
    private String email;
    private String department;

    Employee(String name, String email, String department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }

    @Override
    public String getEmail() {
        return name;
    }

    @Override
    public String getName() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String getDescription() {
        return (" Employee from department " + department);
    }
}
