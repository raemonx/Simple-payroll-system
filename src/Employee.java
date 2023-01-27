
//............................................................
// Assignment 1 , SOEN 6441
// ©Himangshu Shekhar Baruah
// Written by: Himangshu Shekhar BARUAH , Student ID 40229774
//............................................................
/***
 * @author Himangshu Shekhar Baruah
 * Employee class which contains employee details and implements Cheque interface
 */
import java.util.Random;

public class Employee implements Cheque{
    // employee attributes
    public String firstName;
    public String lastName;
    public int age;
    public int ID;
    public double salary;
    // parameterized constructor to fill employee details
    public Employee(String firstName, String lastName, int age, int ID, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ID = ID;
        this.salary = salary;
    }

    /***
     * issueCheque method overriden from Cheque interface
     */
    @Override
    public void issueCheque() {
        String check = "Pay to the order of: " + firstName+" "+lastName+ "\n" + "Amount: " + salary + "\n";
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        Random rand = new Random();
        System.out.println("Cheque No: "+ rand.nextInt(100000));
        System.out.println(check);
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");


    }
}
