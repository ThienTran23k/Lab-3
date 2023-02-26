package Bai1;

public class Triangle {
    public float width ;
    public float hegth;

    public Triangle(){
        this.width = 0;
        this.hegth = 0;
    }
    public Triangle(float width,float hegth){
        this.width = width;
        this.hegth = hegth;
    }
    public float getWidht() {
        return width;
    }
    public float getHeight(){
        return hegth;
    }
    public void setwidth(float width){
        this.width = width;
    }
    public void setheight(float hegth){
        this.hegth = hegth;
    }
    public String toString(){
        return "(" + " width : " + this.width + " and height : " + this.hegth + ")";
    }
}
