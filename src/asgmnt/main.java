/**
 * 
 */
package asgmnt;
import java.time.Instant;
import java.util.*;
/**
 * @author Abdi
 *
 */
public class main {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfOrderedItems = 0 ;
		
		System.out.println("Enter number of orders: ");
        numberOfOrderedItems = scanner.nextInt();
        
        //declaring variables
        
        String itemNames[] = new String[numberOfOrderedItems];
        int itemsnumber[] = new int[numberOfOrderedItems];
        double quantity[] = new double[numberOfOrderedItems];
        double price[] = new double[numberOfOrderedItems];
        double AmountDue[] = new double[numberOfOrderedItems];
        double AmountPaid[] = new double[numberOfOrderedItems];
        double Balance[] = new double[numberOfOrderedItems];
       // Date[] date;
        
        
        //Taking user input
        System.out.println("Sales Records");
        System.out.println("==================");
        
        
        for(int i = 0; i < numberOfOrderedItems; i++){
            //item number
            System.out.println("Enter item ID number "+(i+1));
            itemsnumber[i] = scanner.nextInt();
            
            //item name
            System.out.println("Enter item  Name ");
            itemNames[i] = scanner.next();
            
            //item quantity
            System.out.println("Enter quantity ");
            quantity[i] = scanner.nextDouble();
            
            //item price
            System.out.println("Enter item  price ");
            price[i] = scanner.nextDouble();
            
            //Amount Due
            double amountd = price[i]*quantity[i];
            System.out.println("Amount Due: "+amountd);
            AmountDue[i] = amountd;
            
            //Amount Paid
            System.out.println("Enter Amount Paid ");
            AmountPaid[i] =scanner.nextDouble();
            
            //Balance
            System.out.println("Enter Balance ");
            Balance[i] = scanner.nextDouble();
            
            //Date
            System.out.println("Date: "+Instant.now());
        }
        
        //Getting totals
        double tquantity,tamountpaid, tamountDue, tbalance;
        
        tquantity = tamountpaid = tamountDue = tbalance = 0;
        for(int i = 0; i < itemsnumber.length; i++){
            tquantity += quantity[i]; //Gets the total quantity
            tamountpaid += AmountPaid[i]; //Gets the total Amount Paid
            tamountDue += AmountDue[i]; //Gets the total Amount Due
            tbalance += Balance[i]; //Gets the total balance
        }
        
        
        System.out.println("\t\t\t\tSales reciet");
        System.out.println("\t\t\t=======================");
        
        System.out.println("item Number \t"+" Item name \t"+"Quantity \t"+" price \t \t"+" Amount Paid \t \t  "+" Amount Due \t\t"+" Balance" );
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < numberOfOrderedItems; i++){
           
           System.out.println( itemsnumber[i]+"\t \t "+itemNames[i]+"\t \t "+quantity[i]+"\t \t "+price[i]+"\t \t "+AmountPaid[i]+"\t \t \t \t" +AmountDue[i]+"\t \t\t"+Balance[i]);
        }
        System.out.println("\t \t \t \t -------------------------------------------------------------------------------------------------");
        System.out.println("\t \t \t \t "+ tquantity +"\t \t \t\t "+ tamountpaid+ "\t\t\t\t"+ tamountDue+"\t\t\t"+tbalance);
        System.out.println("\n");
        System.out.println("Sign: __________________________________");
        
        System.out.println("Waxaa Diyariyay Abdi Abdirizak Omar ID: CS0117001");

	}

}
