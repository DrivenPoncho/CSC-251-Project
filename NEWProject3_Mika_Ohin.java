import java.util.Scanner;
import java.util.*;
import java.io.*;

public class NEWProject3_Mika_Ohin
{
public static void main(String[]args)throws IOException
   {
      ArrayList<Policy2> policies = new ArrayList<Policy2>();
      
      File file = new File("PolicyInformation.txt");
      
      Scanner scan = new Scanner(file);
      
      int policyNumber;
      String policyProvider;
      String fName;
      String lName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      
      while (scan.hasNext())
      {
         policyNumber = scan.nextInt();
         scan.nextLine();//buffer
         policyProvider = scan.nextLine();
         fName = scan.nextLine();
         lName = scan.nextLine();
         age = scan.nextInt();
         scan.nextLine();//buffer
         smokingStatus = scan.nextLine();
         height = scan.nextDouble();
         weight = scan.nextDouble();
         scan.nextLine();//skipping the blank line inbetween policies in the text file.
         
         policies.add(new Policy2(policyNumber, policyProvider, new newPolicyHolder(fName, lName, age, smokingStatus, height, weight))); //adding the policyHolder 
      }
      int smokerCount = 0;
      
      for (Policy2 policy : policies)
      {
         System.out.println(policy);
         System.out.println();
       
         if (policy.getNewPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
         {
           smokerCount = smokerCount + 1;
         }
       
      }
      System.out.println("The total number of policies is: " + policies.size());
            
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + (policies.size() - smokerCount)); 
      
      scan.close();
      
      
      
      
   }
}