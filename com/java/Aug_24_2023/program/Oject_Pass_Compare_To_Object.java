package com.java.Aug_24_2023.program;

class StudentObject {
    @Override
    public boolean equals(Object obj) {

      if(obj==null) {
          return false;
      }else if (obj==this){
          return true;
      }
            return ((StudentObject)obj).getRoll()==this.getRoll();
    }

    private int Roll;
    private String StName;

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public String getStName() {
        return StName;
    }

    public void setStName(String stName) {
        StName = stName;
    }
}


public class Oject_Pass_Compare_To_Object {
    public static void main(String[] args) {
        StudentObject ob = new StudentObject();
        ob.setRoll(234);
        ob.setStName("Mohd salman");
        StudentObject ob1 = new StudentObject();
        ob1.setRoll(234);
        ob1.setStName("Mohd salman");
        System.out.println(ob.equals(ob1));
        System.out.println(ob.equals(ob));
    }
}
