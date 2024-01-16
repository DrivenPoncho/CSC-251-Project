import java.util.Scanner;
import java.util.*;

public class Project_Mika_Ohin
{
public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      
      int pNum = 0;
      String provider = "";
      String fName = "";
      String lName = "";
      int age = 0;
      String smoking = "";
      double height = 0;
      double weight = 0;
      
      System.out.println("Please enter the Policy Number: ");
      pNum = scan.nextInt();
      System.out.println("Please enter the Provider Name: ");
      scan.nextLine();
      provider = scan.nextLine();
      System.out.println("Please enter the Policyholder’s First Name: ");
      fName = scan.nextLine();
      System.out.println("Please enter the Policyholder’s Last Name: ");
      lName = scan.nextLine();
      System.out.println("Please enter the Policyholder’s Age: ");
      age = scan.nextInt();
      System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      scan.nextLine();
      smoking = scan.nextLine();
      System.out.println("Please enter the Policyholder’s Height (in inches): ");
      height = scan.nextDouble();
      System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
      weight = scan.nextDouble();
      
      Policy policy = new Policy(pNum, provider, fName, lName, age, smoking, height, weight);
      
      System.out.println("Policy Number: " + pNum + "\nProvider Name : " + provider + "\nPolicyholder’s First Name: " + fName + "\nPolicyholder’s Last Name: " + lName + "\nPolicyholder’s Age: " + age + "\nPolicyholder’s Smoking Status: " + smoking + "\nPolicyholder’s Height: " + height + "\nPolicyholder’s Weight: " + weight + "\nPolicyholder’s BMI: " + String.format("%.2f", policy.getBMI()) + "\nPolicy Price : $" + String.format("%.2f", policy.getPrice()));
   }
}