public class Policy
   {
      private int policyNumber;
      private String policyName;
      private String policyFirst;
      private String policyLast;
      private int policyAge;
      private int smokeStatus;
      private int policyHeight;
      private int policyWeight;

      public int setPolNum (int polNum)
      {
         polNum = policyNumber;
         return polNum;         
      }
      public String setPolName (String polyname)
      {
         polyname = policyName;
         return polyname;
      }
      public String setPolFirst (String polFirst)
      {
         polFirst = policyFirst;
         return polFirst;
      }
      public String setPolLast (String polLast)
      {
         polLast = policyLast;
         return polLast;
      }
      public int setPolAge (int polAge)
      {
         polAge = policyAge;
         return polAge;
      }
      public int setSmoke (int polSmoke)
      {
         polSmoke = smokeStatus;
         return polSmoke;
      }
      public double setPolHeight (double polHeight)
      {
         polHeight = policyHeight;
         return polHeight;
      }
      public double setPolWeight (double polWeight)
      {
         polWeight = policyWeight;
         return polWeight;
      }




      
      public double BMI (double holderHeight, double holderWeight)
      {  
         int bythepowerof = 2;
         
         double BMI = (holderWeight * 703) / (Math.pow(holderHeight, bythepowerof));
         
         return BMI;
      }
      
      public double price (int age, int smoker, double bmi)
      {
      
         double totalFee = 600;
         
         if (age > 50)
         {
            totalFee = totalFee + 75;
         }
         if (smoker == 1)//placeholder. 1 means smoker, 2 means nonsmoker.
         {
            totalFee = totalFee + 100;
         }
         if (bmi > 35)
         {
            totalFee = ((bmi - 35) * 20) +totalFee;
         }
         
         return totalFee;
         
      }
      
      public void results (int polnum, String polprov, String polFirst, String polLast, int polAge, String polSmoke, double polHeight, double polWeight, double polBMI, double price)
      
      {
      System.out.println("Policy Number: " + polnum);
      System.out.println("Provider Name: " + polprov);
      System.out.println("Policyholder’s First Name: " + polFirst);
      System.out.println("Policyholder’s Last Name: " + polLast);
      System.out.println("Policyholder’s Age: " + polAge);
      System.out.println("Policyholder’s Smoking Status (1= Smoker, 2= Non-Smoker, 3= N/A): " + polSmoke);
      System.out.println("Policyholder’s Height: " + polHeight);
      System.out.println("Policyholder’s Weight: " + polWeight);
      System.out.println("Policyholder’s BMI: " + String.format("%.2f", polBMI));
      System.out.println("Policy Price: $" + String.format("%.2f", price));
      }      
      
   }