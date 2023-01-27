
//............................................................
// Assignment 1 , SOEN 6441
// ©Himangshu Shekhar Baruah
// Written by: Himangshu Shekhar BARUAH , Student ID 40229774
//............................................................
/***
 * @author Himangshu Shekhar Baruah
 * FullTimeEmp class which inherits employee class
 */
public class FullTimeEmp extends Employee {
    // parameterized constructor to fill employee details and call the super constructor
    public FullTimeEmp(String firstName, String lastName, int id, int age, int salary) {
        super(firstName,lastName,id,age,salary);
    }
}
