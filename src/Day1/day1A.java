package Day1;

import com.sun.jdi.Value;

import java.io.*;
import java.util.Scanner;

public class day1A {
    private static int[] massSum;


    private int[] Readfile() {
        try {
            System.out.println("attempting to read file");
            BufferedReader massReader = new BufferedReader(new FileReader("/Users/trym/go/src/github.com/Nosp1/AoC2019/src/Day1/input.txt"));
            int lenFile = 0;
            while (massReader.readLine() != null) {
                lenFile++;
            }
            massSum = new int[lenFile];
            int y = 0;
            massReader.close();
            Scanner scanner = new Scanner(new FileReader("/Users/trym/go/src/github.com/Nosp1/AoC2019/src/Day1/input.txt"));
            while (scanner.hasNextInt()) {
                massSum[y] = scanner.nextInt();
                y++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return massSum;
    }

    private int[]CalculateMassPerModule(int[] mass) {

       for(int i = 0; i < mass.length; i++) {
           mass[i] = (int) (Math.floor(mass[i]/3) - 2);
           System.out.println("mass per module is :" + mass[i]);
       }
       return mass;
    }
    private int CalculateTotalFuel(int[] mass){
        int totalFuel = 0;
        for (int i : mass) {
            totalFuel += i;
        }
        System.out.println("The total fuel mass needed is: " + totalFuel);
            return totalFuel;
    }


    public static void main(String[] args) {
        day1A day1A = new day1A();
           day1A.Readfile();
           day1A.CalculateMassPerModule(massSum);
           day1A.CalculateTotalFuel(massSum);



    }
}


