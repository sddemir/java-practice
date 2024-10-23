public class ArraysApp {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[5];

        lotteryNumbers[0] = 10;
        lotteryNumbers[1] = 20;
        lotteryNumbers[2] = 30;
        lotteryNumbers[3] = 40;
        lotteryNumbers[4] = 50;

        for (int lotteryNumber : lotteryNumbers) {
            System.out.println(lotteryNumber);
        }
    }
}
