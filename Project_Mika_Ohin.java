import java.util.Scanner;
 
 
 public class Project_Mika_Ohin
 {
   public static void main (String[] args)
   {
      Policy policyProgram = new Policy();
      
      int inPolyNum;
      String inPolyName;
      String inPolyFirst;
      String inPolyLast;
      int inPolyAge;
      String inPolySmoke;
      double inPolyHeight;
      double inPolyWeight;
      double BMI;
      double price;
      
      int smokerCheck = 0;//self-explanatory.
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Please enter the Policy #: ");
      
      inPolyNum = scan.nextInt();
               
      System.out.println("Please enter the Provider Name: ");
      scan.nextLine();

      inPolyName = scan.nextLine();
         
      System.out.println("Please enter the Policyholder's First Name:");
      
      inPolyFirst = scan.nextLine();
      
      
      System.out.println("Please enter the Policyholder's Last Name:");
      
      inPolyLast = scan.nextLine();
            
      System.out.println("Please enter the Policyholder's Age: ");
      
      inPolyAge = scan.nextInt();
      
      System.out.println("Please enter the Policyholder's smoking status (smoker/non-smoker): ");
      scan.nextLine();
      inPolySmoke = scan.nextLine();
      if (inPolySmoke == "smoker" || inPolySmoke == "Smoker")
      {
         smokerCheck = smokerCheck + 1;
      }
      if (inPolySmoke == "nonsmoker" || inPolySmoke == "non-smoker" || inPolySmoke == "Non-Smoker")
      {
         smokerCheck = smokerCheck + 2;
      }
      
      System.out.println("Please enter the Policyholder's Height (In Inches): ");
      
      inPolyHeight = scan.nextInt();
      
      System.out.println("Please enter the Policyholder's Weight (In Pounds)");
      
      inPolyWeight = scan.nextDouble();
      
      
      BMI = policyProgram.BMI(inPolyHeight, inPolyWeight);
      
      price = policyProgram.price(inPolyAge, smokerCheck, BMI);
      
      policyProgram.results(inPolyNum, inPolyName, inPolyFirst, inPolyLast, inPolyAge, inPolySmoke, inPolyHeight, inPolyWeight, BMI, price);   
      
   }
 }