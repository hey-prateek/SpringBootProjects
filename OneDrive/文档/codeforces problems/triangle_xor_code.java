// import java.util.Scanner;

// public class triangle_xor_code {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int testCases = scanner.nextInt();
        
//         while (testCases-- > 0) {
//             long xValue = scanner.nextLong();
//             long bestY = -1;
            
//             if (xValue <= 10) {
//                 if (xValue == 5) {
//                     long candidateY = 3;
//                     long zValue = xValue ^ candidateY;
//                     if (xValue + candidateY > zValue && xValue + zValue > candidateY && candidateY + zValue > xValue) {
//                         bestY = candidateY;
//                     }
//                 } else {
//                     if (xValue - 1 >= 1) {
//                         long candidateY = xValue - 1;
//                         long zValue = xValue ^ candidateY;
//                         if (xValue + candidateY > zValue && xValue + zValue > candidateY && candidateY + zValue > xValue) {
//                             bestY = candidateY;
//                         }
//                     }
//                 }
//             } else if (xValue <= 100) {
//                 if (xValue - 3 >= 1) {
//                     long candidateY = xValue - 3;
//                     long zValue = xValue ^ candidateY;
//                     if (xValue + candidateY > zValue && xValue + zValue > candidateY && candidateY + zValue > xValue) {
//                         bestY = candidateY;
//                     }
//                 }
//             } else {
//                 if (xValue - 100 >= 1) {
//                     long candidateY = xValue - 100;
//                     long zValue = xValue ^ candidateY;
//                     if (xValue + candidateY > zValue && xValue + zValue > candidateY && candidateY + zValue > xValue) {
//                         bestY = candidateY;
//                     }
//                 }
//             }
            
//             if (bestY == -1) {
//                 if (xValue - 1 >= 1) {
//                     long candidateY = xValue - 1;
//                     long zValue = xValue ^ candidateY;
//                     if (xValue + candidateY > zValue && xValue + zValue > candidateY && candidateY + zValue > xValue) {
//                         bestY = candidateY;
//                     }
//                 }
//                 if (bestY == -1 && xValue - 3 >= 1) {
//                     long candidateY = xValue - 3;
//                     long zValue = xValue ^ candidateY;
//                     if (xValue + candidateY > zValue && xValue + zValue > candidateY && candidateY + zValue > xValue) {
//                         bestY = candidateY;
//                     }
//                 }
//                 if (bestY == -1 && xValue - 100 >= 1) {
//                     long candidateY = xValue - 100;
//                     long zValue = xValue ^ candidateY;
//                     if (xValue + candidateY > zValue && xValue + zValue > candidateY && candidateY + zValue > xValue) {
//                         bestY = candidateY;
//                     }
//                 }
//                 if (bestY == -1) {
//                     for (long candidateY = 1; candidateY < xValue; candidateY++) {
//                         long zValue = xValue ^ candidateY;
//                         if (xValue + candidateY > zValue && xValue + zValue > candidateY && candidateY + zValue > xValue) {
//                             bestY = candidateY;
//                             break;
//                         }
//                     }
//                 }
//             }
            
//             System.out.println(bestY);
//         }
        
//         scanner.close();
//     }
// }


import java.util.Scanner;

public class triangle_xor_code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        while (testCases-- > 0) {
            long xValue = scanner.nextLong();
            long bestY = -1;
            
            for (long candidateY = xValue - 1; candidateY >= 1; candidateY--) {
                long zValue = xValue ^ candidateY;
                if (zValue > 0 && zValue < xValue && xValue + candidateY > zValue 
                    && xValue + zValue > candidateY && candidateY + zValue > xValue) {
                    bestY = candidateY;
                    break;  
                }
            }
            
            System.out.println(bestY);
        }
        
        scanner.close();
    }
}
