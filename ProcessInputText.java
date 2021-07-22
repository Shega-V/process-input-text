/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processinputtext;
import java.util.Scanner;
/**
 *
 * @author shegavala
 */
public class ProcessInputText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);// input stream for standard input
        Scanner inputSS = null;//input string stream
        
        String lineString;
        String firstName;
        String lastName;
        int userAge;
        boolean inputDone;
        
        inputDone = false;
        
        //Promt user for input
        System.out.println("Enter \"firstname lastname age\" on each line");
        System.out.println("(\"Exit\" as firstname exits).\n");
        
        //Grab data as long as "Exit" is not entered
        while (!inputDone){
        
        //Enter line into lineString
        lineString = input .nextLine();
        
        //Create new input string stream 
        inputSS = new Scanner (lineString);
        /*The statement inputSS = new Scanner(lineString); 
        uses the Scanner's constructor to initialize the stream's 
        buffer to the String lineString. Afterwards, the program extracts
        input from that stream using the next() methods.*/
        
        //Now process the line
        
        firstName = inputSS.next();
        
        //output analyse values
        if (firstName.equals("Exit")){
            System.out.println("     Exiting. ");
            
            inputDone = true;    
        }
        else{
        lastName = inputSS.next();
        userAge = inputSS.nextInt();
        
        System.out.println("   First name: " + firstName);
        System.out.println("   Last name: " +lastName);
        System.out.println("   Age: " +userAge);
        System.out.println();
        } 
      }
    }
    
}
