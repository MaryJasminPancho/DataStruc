class Student {
   int idNum;
   String firstName;
   String lastName;
   String course;
   int yearLevel;
   
   public int getIdNum(){
      return idNum;
   }
   public String getFirstName(){
      return firstName;
   }
   public String getLastName(){
      return lastName;
   }
   public String getCourse(){
      return course;
   }
   public int getYearLevel(){
      return yearLevel;
   }
   
   public void setIdNum(int id){
      idNum = id;
   }
   public void setFirstName(String fName){
      firstName = fName;
   }
   public void setLastName(String lName){
      lastName = lName;
   }
   public void setCourse(String course){
      this.course = course;
   }
   public void setYearLevel(int yearLvl){
      yearLevel = yearLvl;
   }
}  