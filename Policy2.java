public class Policy2
{
   //A policy must contain:
   int pNum;//a Policy Number
   String provider;//provider name
   //this is the 3rd project's version of the policy program.
   //for this version of the policy program, i will only need to use policyHolder in order to get info such as
   //name, age, bmi, weight, and height.
   //for that reason, i am now including the policyHolder class.
   private newPolicyHolder nPH;
   
   

   
   //Must inlcude a No-Arg constructor
   
   public Policy2()
   {
      pNum = 0;
      provider = "";
      nPH = new newPolicyHolder(nPH);
      //remember the new constructor i made in the newPolicyHolder?
      //we're calling that!
   }
   
   
   
   //as well as a constructor that accepts ALL arguments
   public Policy2(int pNum, String provider, newPolicyHolder nPH)
   {
      this.pNum = pNum;
      this.provider = provider;
      this.nPH = new newPolicyHolder(nPH);        
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
   
   //i forgot, i needed a setter for the policy holder, too.
   
   public void setNewPolicyHolder(newPolicyHolder nPH)
   {
      this.nPH = new newPolicyHolder(nPH);
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
   
   public newPolicyHolder getNewPolicyHolder()
   {
      return new newPolicyHolder(nPH);
   }
   //The policy requires a method that calculates BMI.
   //BMI is calculated using the policyHolder's height and weight.
   // BMI = (Weight * 703 ) / (Height^2)
   

  //Finally, the class demands a method that calculates and returns the price.
  //This requires the BMI obtained, as well as the age and smoking status of the policyHolder.
  
  public double getPrice()
  {
     double bmi = nPH.getBMI();
     String smoking = nPH.getSmokingStatus();
     int age = nPH.getAge();
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
     if (bmi > 35)
     {
      double additionalFee = (bmi - 35) * 20;
      totalFee = totalFee + additionalFee;//rewrote. only if bmi > 35, add an additional fee.
     }
     return totalFee;       
  }
  
  public String toString()
  {
      return String.format("Policy Number: " + pNum + "\nProvider Name: " + provider + nPH + "\nPrice :$%.2f " , getPrice());
  }


}