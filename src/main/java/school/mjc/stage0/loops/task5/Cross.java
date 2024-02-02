package school.mjc.stage0.loops.task5;

import static java.lang.Math.round;

public class Cross {
    public void printCross(int sideLength) {
        int middle = (int) round((double) sideLength /2 + 0.5);

        if(sideLength>0 && sideLength%2!=0) {
            for (int i = 1; i <= sideLength; i++) {
                for (int j = 1; j <= sideLength; j++) {
                    if(j==middle || i==middle) System.out.print("8");

                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
