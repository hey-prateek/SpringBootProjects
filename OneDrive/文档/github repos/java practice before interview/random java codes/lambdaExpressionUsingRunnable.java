import java.io.IOException;

public class lambdaExpressionUsingRunnable extends Thread implements Runnable{
    public static void main(String[] args) throws IOException{
        
        // Runnablee r=new Runnablee();
        // Thread t=new Thread(r);
        // t.start();
        Runnable r=()->System.out.println("inside run method...."); // this represents run method inside Runnable interface
        //r.run(); // either by this or by below one we can call run method
        new Thread(r).start();
    }
}

// class Runnablee implements Runnable
// {
//     public void run()
//     {
//         System.out.println("inside run method....");
//     }
// }
