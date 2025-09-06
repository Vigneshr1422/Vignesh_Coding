package Aug_Oops.Day1;

public class circle {
    double radius;

    circle(double r)
    {
        radius=r;
    }

    double Area()
    {
        return 3.14*3.14*radius;
    }

    double circumtence()
    {
        return 2*3.14*radius;
    }

}

class  Mainn{
    public static void main(String[] args) {
        circle ob1=new circle(2.4);
        System.out.println(ob1.Area());
    }

}
