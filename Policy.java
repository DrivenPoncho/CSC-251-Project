public class Policy
{
   //A policy must contain:
   int pNum;//a Policy Number
   String provider;//The name of the policy provider, e.g, StateFarm
   String fName;// The First Name of the policyholder
   String lName;// The last name of the policyholder
   int age;// the age of the policyholder
   String smoking;// whether the policyholder smokes or not
   double height;// the height of the policyholder, in inches
   double weight;// the weight of the policyholder, in pounds (double because pounds on scales use decimal points)
   
   //Must inlcude a No-Arg constructor
   
   public Policy()
   {
      pNum = 0;
      provider = "";
      fName = "";
      lName = "";
      age = 0;
      smoking = "";
      height = 0;
      weight = 0;
   }
   
   //as well as a constructor that accepts ALL arguments
   public Policy(int pNum, String provider, String fName, String lName, int age, String smoking, double height, double weight)
   {
      this.pNum = pNum;
      this.provider = provider;
      this.fName = fName;
      this.lName = lName;
      this.age = age;
      this.smoking = smoking;
      this.height = height;
      this.weight = weight;
   }
   
   //the program must also include applicable setters
   
   public void setPolicyNumber(int pNum)
   {
      this.pNum = pNum;
   }
   public void setProvider(String provider)
   {
      this.provider = provider;
   }
   public void setFirstName(String fName)
   {
      this.fName = fName;
   }
   public void setLastName(String lName)
   {
      this.lName = lName;
   }
   public void setAge(int age)
   {
      this.age = age;
   }
   public void setSmokingStatus(String smoking)
   {
      this.smoking = smoking;
   }
   public void setHeight(int height)
   {
      this.height = height;
   }
   public void setWeight(double weight)
   {
     this.weight = weight; 
   }
   
   //as well as getters.
   
   public int getPolicyNumber()
   {
      return pNum;
   }
   public String getProvider()
   {
      return provider;
   }
   public String getFirstName()
   {
      return fName;
   }
   public String getLastName()
   {
      return lName;
   }
   public int getAge()
   {
      return age;
   }
   public String getSmokingStatus()
   {
      return smoking;
   }
   public double getHeight()
   {
      return height;
   }
   public double getWeight()
   {
      return weight;
   }

   //The policy requires a method that calculates BMI.
   //BMI is calculated using the policyHolder's height and weight.
   // BMI = (Weight * 703 ) / (Height^2)
   
  public double getBMI()
  {
   double bmi = (weight * 703) / (Math.pow(height, 2));//height being the base, and 2 being the exponent.
   return bmi;
  }
  //Finally, the class demands a method that calculates and returns the price.
  //This requires the BMI obtained, as well as the age and smoking status of the policyHolder.
  public double getPrice()
  {
     double bmi = getBMI();
     final int baseFee = 600;
     final int ageFee = 75;
     final int smokingFee = 100;
     
     double totalFee = baseFee;
    
     if (age > 50)
     {
      totalFee = totalFee + ageFee;
     }
     if (smoking.equalsIgnoreCase("smoker"))
     {
      totalFee = totalFee + smokingFee;
     }
     
     double additionalFee = (bmi - 35) * 20;
     
     return totalFee + additionalFee;        
  }


}