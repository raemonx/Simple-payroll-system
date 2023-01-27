//............................................................
// Assignment 1 , SOEN 6441
// ©Himangshu Shekhar Baruah
// Written by: Himangshu Shekhar BARUAH , Student ID 40229774
//............................................................
/***
 * @author Himangshu Shekhar Baruah
 * Driver class for showing the main menu and performing the tasks
 */

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Driver {

    // Scanner class to read input from the user
    private static Scanner sc = new Scanner(System.in);
    // Arraylist of type Cheque to add objects of bill and employee
    private static ArrayList<Cheque> chequeList = new ArrayList<>();

    public static void main(String[] args) {
        // infinite loop to re-display the menu unless exit is selected
        while(true){
            System.out.println("Welcome to Payroll System");
            System.out.println("1. Add an employee");
            System.out.println("2. Add a bill");
            System.out.println("3. Issue cheques");
            System.out.println("4. Exit");
            int choice =Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    addEmployee();
                    break;
                case 2:
                    addBill();
                    break;
                case 3:
                    issueCheque();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice, Please try again");
            }
        }
    }

    /***
     * issueCheque method to issue the cheques using the objects from the arraylist
     */
    private static void issueCheque() {
        System.out.println("Printing Cheques.......");
        for (int i = 0; i < chequeList.size(); i++) {
            chequeList.get(i).issueCheque();
        }
    }

    /***
     * addEmployee method to add a new employee (part-time/full time)
     */
    private static void addEmployee() {
        System.out.println("Is the employee part-time? please type (Y/N)");
        String input = sc.nextLine();
        System.out.println("Please enter employee first name");
        String firstName=sc.nextLine();
        System.out.println("Please enter employee last name");
        String lastName=sc.nextLine();
        System.out.println("Please enter employee ID");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter employee age");
        int age = Integer.parseInt(sc.nextLine());
        // if the employee is part time create an employee object upcasting PartTimeEmp class
        if (input.equals("Y")){
            System.out.println("Please enter echelon (1/2/3/4/5)");
            int echelon = Integer.parseInt(sc.nextLine());
            System.out.println("Please enter number of hours worked");
            int hoursWorked = Integer.parseInt(sc.nextLine());
            Employee emp = new PartTimeEmp(firstName,lastName,id,age,echelon,hourlyRate(echelon),hoursWorked);
            chequeList.add(emp);
        }
        //if the employee is full time create an employee object upcasting FullTimeEmp class
        else if (input.equals("N")) {
            System.out.println("please enter monthly salary");
            int salary= Integer.parseInt(sc.nextLine());
            Employee emp = new FullTimeEmp(firstName,lastName,id,age,salary);
            chequeList.add(emp);
        }

    }

    /***
     * addBill method to add a bill to the chequeList arraylist
     */
    private static void addBill() {
        System.out.println("Please enter the bill name: ");
        String billName = sc.nextLine();
        System.out.println("Please enter the service provider: ");
        String company = sc.nextLine();
        System.out.println("Please enter amount");
        int amount = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter the due date in format(DD.MM.YYYY)");
        String dueDate = sc.nextLine();
        String[] dateComponents = dueDate.split("\\.");

        String month = dateComponents[1];
        int day = Integer.parseInt(dateComponents[0]);
        int year = Integer.parseInt(dateComponents[2]);

        Dates date = new Dates(day,month,year);
        Bill bill = new Bill(billName,company,amount,date);
        chequeList.add(bill);

    }

    /***
     * Method to return the hourly rate based on the echelon
     * @param echelon refers to the hard coded hourly rates according to it
     * @return hourly rate of part-time employee
     */
    private static int hourlyRate(int echelon) {
        if(echelon==1)
            return 15;
        else if(echelon==2)
            return 20;
        else if(echelon==3)
            return 25;
        else if(echelon==4)
            return 30;
        else if(echelon==4)
            return 40;
        else
            throw new NoSuchElementException();
    }
}