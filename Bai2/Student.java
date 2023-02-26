package Bai2;

public class Student {
    public String stID;
    public String stName;
    public String stClass;

    public Student(){
    
    }
    public Student( String stID,String stName, String stClass ){
        this.stID = stID;
        this.stName = stName;
        this.stClass = stClass;
    }
    public Student(String Student){

    }

    public String getStID(){
        return stID;
    }
    public String getStName(){
        return stName;
    }
    public String getStClass(){
        return stClass;
    
    }
    public void setStID(String id){
        this.stID = id ;
    }
    public void setStName(String name){
        this.stName = name ;
    }
    public void setStClass(String Class){
        this.stClass = Class ;
    }
    public String toString(){
        return "(" + " ID : " + this.stID + " Name: " + this.stName + "Class : "+ this.stClass + ")";
    }

}
