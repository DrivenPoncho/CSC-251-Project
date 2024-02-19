public class newPolicyHolder
{
   //A policy !!HOLDER!! must contain:
   private String fName;// The First Name of the policyholder
   private String lName;// The last name of the policyholder
   private int age;// the age of the policyholder
   private String smoking;// whether the policyholder smokes or not
   private double height;// the height of the policyholder, in inches
   private double weight;// the weight of the policyholder, in pounds (double because pounds on scales use decimal points)
   private double bmi;//A NEW ONE, the BMI of the policyHolder.
   
   //A policyholder is meant to contain all of the data regarding the actual patient, which does not log anything such as
   //prices, policynumbers, or fees.
   //this is all personal information regarding the policyholder.
   
   public newPolicyHolder()
   {
      fName = "";
      lName = "";
      age = 0;
      smoking = "";
      height = 0;
      weight = 0;
      bmi = 0;
   }
   
   public newPolicyHolder(String fName, String lName, int age, String smoking, double height, double weight)
   {
      this.fName = fName;
      this.lName = lName;
      this.age = age;
      this.smoking = smoking;
      this.height = height;
      this.weight = weight;
   }
   
   
   //setters, 
   
   
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

//Getters,


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
   
   //the lengthy part, setters, getters.
   //i'll just copy and paste the relevant ones from the original policy class.
  
  //dont forget the bmi calculator!
  
   public double getBMI()
  {
   bmi = (weight * 703) / (Math.pow(height, 2));//height being the base, and 2 being the exponent.
   return bmi;
  }
  
  //finally, this is something new, since we're dealing with class aggregation
  
  //similar to my last version of this project, i want to consider this "another constructor".
  //creates a newPolicyHolder object, and, well, does what an arg construtor usually does.
  public newPolicyHolder(newPolicyHolder nPH)
  {
      this.fName = nPH.getFirstName();
      this.lName = nPH.getLastName();
      this.age = nPH.getAge();
      this.smoking = nPH.getSmokingStatus();
      this.height = nPH.getHeight();
      this.weight = nPH.getWeight();
      this.bmi = nPH.getBMI();   
  }
   
   
   
   public String toString()
   {
      return String.format("\nPolicyHolder's First Name:" + fName + "\nPolicyholder's Last Name:" + lName + "\nPolicyholder's Age:" + age + "\nPolicyholder's Smoking Status:" + smoking + "\nHeight:" + height + "\nWeight: " + weight + "\nBMI: %.2f" , getBMI());
   }

}