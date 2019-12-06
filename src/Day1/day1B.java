package Day1;

import java.io.File;

public class day1B {
    static int[] massSum;
  public   day1B() {
        this.massSum = FileReader.getMassSum();
    }




    public int calcFuelRedundancy(int mass) {
        int moduleAndFuelTotal = 0;
        int tempResult = (int) (Math.floor(mass/3) -2);
        if (tempResult <= 0)
        {
            return 0;
        }else {
            moduleAndFuelTotal += tempResult;
            moduleAndFuelTotal += calcFuelRedundancy(tempResult);
        }
        return moduleAndFuelTotal;
    }
    public int calcTotalFuel() {

            int totalFuel = 0;
            for (int i : massSum) {
                totalFuel += i;
                totalFuel += calcFuelRedundancy(i);
            }
            System.out.println(" Day1B: The total fuel mass needed is: " + totalFuel);
            return totalFuel;
        }
    }


