import java.util.Scanner;
import java.util.*;
import java.io.*;//for printwriter, files, and throwIOExecption. THE PRINTRWITER OVERWRITES TEXT. IT DOES NOT WRITE TEXT.

public class PolicyProgramVersion2
{
public static void main(String[]args) throws IOException
   {
      
      File policyWriter = new File("PolicyInformation.Txt");//opening policyInformation file
      Scanner scan = new Scanner(policyWriter);
      String pNumber= "";
      String pName = "";
      String fName = "";
      String lName = "";
      int age;
      String smokingStatus = "";
      double height = 0;
      double weight = 0;
      double bmi = 0;
      double price = 0;
      String loopF = "Y";
      ArrayList<Policy> policies = new ArrayList<Policy>();
      int smokercount = 0;
      //borrowing this method of doing this from project2!
      
      while(scan.hasNext())//while scan, THE FILE, has another line, we'll do this.
      {       
         pNumber = scan.nextLine();
         pName = scan.nextLine();
         fName = scan.nextLine();
         lName = scan.nextLine();
         age = scan.nextInt();         
         scan.nextLine();
         smokingStatus = scan.nextLine();
         height = scan.nextDouble();
         weight = scan.nextDouble();
         
         //borrowing these lines, also from project2!
         if(scan.hasNext())
            scan.nextLine();
         if(scan.hasNext())
            scan.nextLine();
            if (smokingStatus.equalsIgnoreCase("smoker"))
            {
               smokercount = smokercount + 1;
            }
         //the text file divides each policy with empty spaced lines. if there is a line(which, in this case, is the empty line) after everything ran above, scan.NextLine();(which basically skips the empty line.
         
         policies.add(new Policy(pNumber, pName, new policyHolderM(fName, lName, age, smokingStatus, height, weight, bmi)));//we're using the policy constructor that requires a pNumber, pname, and policyHolder.
      }
         for (Policy policy: policies)//dunno what the "policy" deal is. outside of that, for every policy in the policies arraylist, do this.
         {
          System.out.println(policy);
          System.out.println();
         }
         System.out.println("The amount of policies is: " + policies.size());//returns 5... there are 5... but for somereason there are 6 in the solution
         System.out.println("There are " + smokercount + " smokers.");
         System.out.println("There are " + (policies.size() - smokercount) + " nonsmokers");
        
     

 }
}