public class OperatorsApp {


    public static void main(String[] args) {
        String carModel = "Dodge Challanger SRT 392";
        int price = 14999;
        int moneyInTheBank = 100000;
        boolean isDamaged = true;

        System.out.println("Price of a" + carModel + ": $" + price);

        int increasedPrice = price + 1000;
        System.out.println("The increased price of a" + carModel + ": $" + increasedPrice);

        int decreasedPrice = price - 1000;
        System.out.println("The decreased price of a" + carModel + ": $" + decreasedPrice);

        int twoCarsPrice = price * 2;
        System.out.println("Two" + carModel + ": $" + twoCarsPrice);

        int dodgesYouCanBuy = moneyInTheBank/price;
        System.out.println("From the money we have in the bank we can buy " + dodgesYouCanBuy + " "+ carModel);

        int moneyRemaining = moneyInTheBank % price;
        System.out.println("Money remaining after buying " + dodgesYouCanBuy + " "+ carModel + ": $" + moneyRemaining);
        System.out.println();




    }
}
