class Patient {
   private int idNum;
   private int age;
   private BloodData bloodData;
   
   //default
   public Patient() {
      idNum = 0;  
      age = 0;      
      bloodData = new BloodData();
   }
   
   public Patient(int idNum, int age, String bloodType, String rhFactor) {
      idNum = idNum;
      this.age = age;
      this.bloodData = new BloodData(bloodType, rhFactor);     
   }
   
   public int getIdNumber() {
      return idNum;
   }

   public int getAge() {
      return age;
   }

   public BloodData getBloodData() {
      return bloodData;
   }
   
}