//............................................................
// Assignment 1 , SOEN 6441
// ©Himangshu Shekhar Baruah
// Written by: Himangshu Shekhar BARUAH , Student ID 40229774
//............................................................
/***
 * @author Himangshu Shekhar Baruah
 * PartTimeEmp class which inherits employee class
 */
public class PartTimeEmp extends Employee{
    // part time employee specific attributes
    public int echelon;
    public int hourlyRate;
    public int numberOfHours;

    //parameterized constructor to fill the employee details by using super constructor and salary based on echelon
    public PartTimeEmp(String firstName, String lastName, int id, int age, int echelon, int hourlyRate, int hoursWorked) {
        super(firstName,lastName,age,id,hourlyRate*hoursWorked);
        this.echelon = echelon;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = hoursWorked;
    }
}
