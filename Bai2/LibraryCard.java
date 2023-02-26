package Bai2;

public class LibraryCard {
    public long lbCode;
    public String owner;
    public int borrowCount;

    public LibraryCard(){

    }
    public LibraryCard(long lbCode, String owner ,int borrowCount ) {
        this.lbCode = lbCode;
        this.owner = owner;
        this.borrowCount = borrowCount;
    }
    public long getLbCode(){
        return lbCode;
    }
    public String getOwner(){
        return owner;
    }
    public int getBorrowCount(){
        return borrowCount;
    }
    public void setLbCode (long code ){
        this.lbCode = code;
    }
    public void setOwner( String owner){
        this.owner = owner;
    }
    public void checkOut(int num){
        this.borrowCount = num ;
    }
    public String toString(){
        return " Lbcode : " + this.lbCode + " Owner : " + this.owner + " Count : "+ this.borrowCount ;
    }
}
