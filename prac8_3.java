import java.lang.Math.*;


class squre{
    int side;
    int length;
    int breadth;
    int radius;
    double pi;


    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }

    public int rectangle(){
        return length * breadth;
    }
    public double cirlce(){
        return  Math.PI*radius*radius;

    }
}


class prac8_3{
    public static void main(String [] args){

        squre sq = new squre();
        sq.side = 3;
        sq.length = 4;
        sq.breadth = 6;
        sq.radius = 4;
        sq.pi = 3.14;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        System.out.println(sq.rectangle());
        System.out.println(sq.cirlce());

    }
}  