package Day1;

public class SolutionDay1 {
     static int[] massSum;


    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        fileReader.Readfile();
        massSum = FileReader.getMassSum();
        day1A day1A = new day1A();
        day1A.CalculateMassPerModule(massSum);
        day1A.CalculateTotalFuel();
        day1B day1B = new day1B();
        day1B.calcTotalFuel();
    }
}
