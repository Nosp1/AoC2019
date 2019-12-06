package Day1;

import com.sun.jdi.Value;

import java.io.*;
import java.util.Scanner;

public class day1A {
     static int[] massSum;
public day1A() {
    massSum = FileReader.getMassSum();

}





    public int[] CalculateMassPerModule(int[] mass) {

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.floor(mass[i] / 3) - 2);
            System.out.println("fuel per module is :" + mass[i]);

        }
        return mass;
    }

    public int CalculateTotalFuel() {
        int totalFuel = 0;
        for (int i : massSum) {
            totalFuel += i;
        }
        System.out.println("The total fuel mass needed is: " + totalFuel);
        return totalFuel;
    }





}


