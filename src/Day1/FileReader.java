package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
static int[] massSum;
   public int[] Readfile() {
        try {
            System.out.println("attempting to read file");
            BufferedReader massReader = new BufferedReader(new java.io.FileReader("/Users/trym/go/src/github.com/Nosp1/AoC2019/src/Day1/input.txt"));
            int lenFile = 0;
            while (massReader.readLine() != null) {
                lenFile++;
            }
            massSum = new int[lenFile];
            int y = 0;
            massReader.close();
            Scanner scanner = new Scanner(new java.io.FileReader("/Users/trym/go/src/github.com/Nosp1/AoC2019/src/Day1/input.txt"));
            while (scanner.hasNextInt()) {
                massSum[y] = scanner.nextInt();
                y++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return massSum;
    }

    public static int[] getMassSum() {
        return massSum;
    }
}
