class PhoneDirectory {
   private String firstName;
   private String phoneNum;
   
   public PhoneDirectory(String firstName, String phoneNum){
      this.firstName = firstName;
      this.phoneNum = phoneNum;
   }
   
   public String getFirstName(){
      return firstName;
   }
   public String getPhoneNum(){
      return phoneNum;
   }
   
   public void setFirstName(String name){
      firstName = name;
   }
   public void setPhoneNum(String num){
      phoneNum = num;
   }
}