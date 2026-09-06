public class code27_stringBuilderStringBuffer {
    public static void main(String[] args) throws Exception
    {
        StringBuilder sbl=new StringBuilder();
        StringBuffer sbf=new StringBuffer();

        Runnable r1=()->{
            for(int i=0; i<1000; i++)
            {
                sbl.append("x");
            }
        };

        Runnable r2=()->{
            for(int i=0; i<1000; i++)
            {
                sbf.append("x");
            }
        };

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r1);
        Thread t3=new Thread(r2);
        Thread t4=new Thread(r2);

        t1.start(); t2.start(); t3.start(); t4.start();
        t1.join(); t2.join(); t3.join(); t4.join();

        System.out.println("string builder length: "+sbl.length()); //not always 2000, bcoz stringbuilder is not thread safe
        System.out.println("string buffer length: "+sbf.length()); //always 2000, bcoz stringbuilder is thread safe
    }   
}
