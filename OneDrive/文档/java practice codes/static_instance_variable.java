class vehicle
{
    static int s_var=10; // static variable or class variable
    int i_var=20; // instance variable   
}

class static_instance_variable
{
    public static void main(String[] args) {
        
        vehicle v1=new vehicle();
        v1.s_var=20;
        v1.i_var=30;
        System.out.println(v1.s_var+" "+v1.i_var); // printing modified by v1

        vehicle v2=new vehicle();
        v2.s_var=40;
        v2.i_var=50;
        System.out.println(v2.s_var+" "+v2.i_var); // printing modified by v2
        System.out.println(v1.s_var+" "+v1.i_var); // printing by v1 back

        // int i;
        // System.out.println(i); // will throw error because local variable dont have default values
    }
}