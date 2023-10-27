public class Policy
{
   private String policyNumber;
   private String providerName;
   private policyHolderM poH;
   public static int PolicyCount = 0;//also inspired from the solution, the policycounter.
   //at first, i figured i could've just gotten the size of the policy array and printed that instead,
   //WHICH WORKS, BY THE WAY, I JUST TESTED IT. i'll just do it my way for originality
   
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      poH = new policyHolderM(poH);

   }
   public Policy(String policyNumber, String providerName, policyHolderM poH)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.poH = new policyHolderM(poH);
   }
   //oohhh i get it now.
   //it's just like an ordinary constructor that makes new variables and assigns them to the original variables.
   
   //again... setters and getters.
   //setters
   public void setPolicyNumber(String policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   public void setPolicyHoler(policyHolderM poH)
   {
      this.poH = new policyHolderM(poH);//a 'deep copy'.
   }
   //getters
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   public String getProviderName()
   {
      return providerName;
   }
   public policyHolderM getPolicyHolder()
   {
      return new policyHolderM(poH);
   }
   //setters and getters end.
   
   //price time
   
   public double getPrice()
   {
      //okay, just to note.
      //since im done with the setters, getters thing, i can use the class's true policyHolder ref variable, poH, instead of creating a new policyholder object again
      final double bPrice = 600;//changed it to reflect the base price, just so that the value doesnt get stale
      double price = bPrice;//then we set price to bPrice for every iteration, just so that it's freshly set back every run.
      
      if (poH.getAge() > 50)
      {
         price = price + 75;
      }
      if (poH.getSmokingStatus().equalsIgnoreCase("smoker"))//hehe made this myself
      {
         price = price + 100;
      }
      if (poH.getBMI() > 35)
      {
         price = price + (poH.getBMI() - 35) * 20;
      }
      return price;
   }
   
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber + "\nProvider Name: " + providerName + poH + "\nPrice :$%.2f " , getPrice());
   }
   
   //finally... finished...
}