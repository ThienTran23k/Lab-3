package Bai2;

public class Book {
    public String boCode ;
    public String boTitle;
    public String boAuthor;

    public Book(){

    }
    
    public Book(String boCode, String boTitle , String boAuthor ){
        this.boCode =boCode;
        this.boTitle =boTitle;
        this.boAuthor =boAuthor;
    }

    public Book(Boolean Book){

    }

    public String getBoCode(){
        return boCode;
    }
    public String getBoTitle(){
        return boTitle;
    }
    public String getBoAuthor(){
        return boAuthor;
    }
    public void setBoCode(String code){
        this.boCode = code;
    }
    public void setBoTitle(String title){
        this.boTitle = title;
    }
    public void setBoAuthor(String authorname){
        this.boAuthor = authorname;
    }
    public String toString(){
        return " Code : " + this.boCode + " Title : " + this.boTitle + " Author : "+ this.boAuthor ;
    }
}
