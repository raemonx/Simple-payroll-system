//............................................................
// Assignment 1 , SOEN 6441
// ©Himangshu Shekhar Baruah
// Written by: Himangshu Shekhar BARUAH , Student ID 40229774
//............................................................
/***
 * @author Himangshu Shekhar Baruah
 * Bill class which contains bill details and implements Cheque interface
 */
import java.util.Random;

public class Bill implements Cheque{
    // Attributes of Bill class
    private String billName;
    private String company;
    private int amount;
    private Dates date;
    //parameterized constructor to fill the bill details
    public Bill(String billName, String company, int amount, Dates date) {
        this.billName = billName;
        this.company = company;
        this.amount = amount;
        this.date = date;
    }

    /***
     * issueCheque method overriden from Cheque interface
     */
    @Override
    public void issueCheque() {
        String check = "Pay to the order of: " + company + "\n" + "Amount: " + amount;
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        Random rand = new Random();
        System.out.println("Cheque No: "+ rand.nextInt(100000));
        System.out.println(check);
        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    }
}
