import java.util.*;

public class CountingPointsOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] centers = new int[n];
            int[] radii = new int[n];

            for (int i = 0; i < n; i++) {
                centers[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                radii[i] = sc.nextInt();
            }

            Set<String> coveredPoints = new HashSet<>();

            for (int i = 0; i < n; i++) {
                int centerX = centers[i], radius = radii[i];

                for (int y = -radius; y <= radius; y++) {
                    int maxXDist = (int) Math.sqrt(radius * radius - y * y);
                    for (int xOffset = -maxXDist; xOffset <= maxXDist; xOffset++) {
                        coveredPoints.add((centerX + xOffset) + "," + y);
                    }
                }
            }

            System.out.println(coveredPoints.size());
        }
        sc.close();
    }
}
