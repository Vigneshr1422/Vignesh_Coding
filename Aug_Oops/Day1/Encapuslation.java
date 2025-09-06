package Aug_Oops.Day1;

 class Encapuslation {
    private String name;
    private int age;

    public void setName(String n)
    {
        name=n;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int n)
    {
        age=n;
    }

    public int getAge()
    {
        return age;
    }
}

class Mainnn{
    public static void main(String[] args) {
        Encapuslation ob1=new Encapuslation();
        ob1.setName("Vignesh");
        System.out.println(ob1.getName());

        ob1.setAge(22);
        System.out.println(ob1.getAge());
    }

}
