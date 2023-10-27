public class policyHolderM
{
   private int age;
   private String firstN, lastN, smokingStatus;
   private double weight, bmi, height;
   
   public policyHolderM()
   {
      age = 0;
      firstN = "";
      lastN = "";
      smokingStatus = "";
      weight = 0;
      height = 0;
      bmi = 0;
   }
   
   public policyHolderM(String firstN, String lastN, int age, String smokingStatus, double height, double weight, double bmi)
   {
     this.firstN = firstN;
     this.lastN = lastN;
     this.age = age;
     this.smokingStatus = smokingStatus;
     this.height = height;
     this.weight = weight; 
     this.bmi = bmi;   
   }
   //even policyHolder's need setters and getters!
   //setters
   
  public void setFirstName(String firstN)
  {
   this.firstN = firstN;//this. is reserved for variables in methods that share the same name as variables from the main class.
  }
  public void setLastName(String lastN)
  {
   this.lastN = lastN;
  }
  public void setAge(int age)
  {
   this.age = age;
  }
  public void setSmokingStatus(String smokingStatus)
  {
  this.smokingStatus = smokingStatus;
  }
  public void setHeight(int height)
  {
   this.height = height;
  }
  public void setBMI(double bmi)
  {
   this.bmi = bmi;
  }
  public void setWeight(double weight)
  {
   this.weight = weight;
  }
  //that's it for setters
  //onto getters.
  
  public String getFirstName()
  {
   return firstN;
  }
  public String getLastName()
  {
  return lastN;
  }
  public int getAge()
  {
  return age;
  }
  public String getSmokingStatus()
  {
  return smokingStatus;
  }
  public double getHeight()
  {
  return height;
  }
  public double getWeight()
  {
  return weight;
  }
  public double getBMI()//inspired by the solution!
  {
   bmi = (weight * 703) / (height*height);
   return bmi;
  }




 public policyHolderM(policyHolderM obj2)//security purposes. Think of this as another constructor (because it pretty much is.)
 {
      this.firstN = obj2.getFirstName();
      this.lastN = obj2.getLastName();
      this.age = obj2.getAge();
      this.smokingStatus = obj2.getSmokingStatus();
      this.height = obj2.getHeight();
      this.weight = obj2.getWeight();
 }

  public String toString()
  {
   return String.format("\nPolicyHolder's First Name:" + firstN + "\nPolicyholder's Last Name:" + lastN + "\nPolicyholder's Age:" + age + "\nPolicyholder's Smoking Status:" + smokingStatus + "\nHeight:" + height + "\nWeight: " + weight + "\nBMI: %.2f" , getBMI());
}
}