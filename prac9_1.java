import java.lang.Math.*;

class cylinder{
   private int radius;
    private int height;

    public cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

public  int getHeight(){
    return height;
}
public void setHeight(int h){
    height = h;
}
public int getRadius(){
    return radius;
}
public void setRadius(int r){
    radius = r;
}

public double surfacearea(){
    return 2*Math.PI*radius*height+2*Math.PI*radius*radius;

}
public double volume(){
    return Math.PI*radius*radius*height;
}

//volume = pi*r*r*h
//surface area = 2*pi*r*h+2pi*r*r
}
 
class rectangle
{
  private  int length;
    private int breadth;


public rectangle(){
    this.length = 4;
    this.breadth = 5;

}
public rectangle(int length, int breadth){
    this.length = length;
    this.breadth= breadth;
}

public void setLength(int l){
    length = l;

}
public int getLength(){
    return length;
}
public void setBreadth(int b){
    breadth = b;
}
public int getBreadth(){
    return breadth;
}
}


class prac9_1{
    public static void main(String [] args){
        cylinder cy = new cylinder(8,12);
        rectangle rc = new rectangle(4,8);
      //  cy.setHeight(12);
     //   cy.setRadius(8);
        System.out.println(cy.getHeight());
        System.out.println(cy.getRadius());
        System.out.println(cy.surfacearea());
        System.out.println(cy.volume());
        System.out.println(rc.getBreadth());
        System.out.println(rc.getLength());


    }

}