import java.util.Scanner;
import java.util.*;
import java.io.*;

public class NEWProject2_Mika_Ohin
{
public static void main(String[]args)throws IOException
   {
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
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
         policies.add(new Policy(policyNumber, policyProvider, fName, lName, age, smokingStatus, height, weight));  
      }
      int smokerCount = 0;
      for (Policy policy : policies)
      {
       System.out.println("Policy Number: " + policy.getPolicyNumber() + "\nProvider Name : " + policy.getProvider() + "\nPolicyholder’s First Name: " + policy.getFirstName() + "\nPolicyholder’s Last Name: " + policy.getLastName() + "\nPolicyholder’s Age: " + policy.getAge() + "\nPolicyholder’s Smoking Status: " + policy.getSmokingStatus() + "\nPolicyholder’s Height: " + policy.getHeight() + "\nPolicyholder’s Weight: " + policy.getWeight() + "\nPolicyholder’s BMI: " + String.format("%.2f", policy.getBMI()) + "\nPolicy Price : $" + String.format("%.2f", policy.getPrice()));
       System.out.println();
       
       if (policy.getSmokingStatus().equalsIgnoreCase("smoker"))
       {
         smokerCount = smokerCount + 1;
       }
       
      }
      
      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + (policies.size() - smokerCount)); 
      
      scan.close();
      
      
      
      
   }
}