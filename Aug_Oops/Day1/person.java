package Aug_Oops.Day1;

public class person {

    String name;
    int age;

    person(String n,int x)
    {
        name=n;
        age=x;
    }

    void display()
    {
        System.out.println("Name : "+name+" Age"+age);

    }


}

class Main{
    public static void main(String[] args) {
        person ob1=new person("Vignesh" ,22);
        ob1.display();

    }
}



