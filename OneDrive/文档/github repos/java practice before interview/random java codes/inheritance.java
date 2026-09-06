class Car
{
    Car()
    {
        System.out.println("this is no args constructor of car.....");
    }
    Car(String test)
    {
        System.out.println("car constructor with args....");
    }
}

class bmw extends Car
{
    bmw()
    {
        System.out.println("bmw constructor.....");
    }
    bmw(String test)
    {
        super("test");
        System.out.println("bmw constructor with args....");
    }
}


public class inheritance {
    public static void main(String[] args) {
        bmw obj=new bmw();
        bmw obj_new=new bmw("test");
    }
    
}
