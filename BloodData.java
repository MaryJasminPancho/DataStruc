class BloodData {
   private String bloodType;
   private String rhFactor;
   
   public BloodData(){     //    \
      bloodType = "O";     //    default constructor
      rhFactor = "+";      //    /
   }
   
   public BloodData(String blood, String rhFac){
      bloodType = blood;
      rhFactor = rhFac;
   }
   public void setBlood(String blood){
      bloodType = blood;
   }
   public String getBlood(){
      return bloodType;
   }
   
   public void setRhFactor(String rhFac){
      rhFactor = rhFac;
   }
   public String getRhFac(){
      return rhFactor;
   }
}