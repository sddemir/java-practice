public class FunctionApp {

    public static void main(String[] args) {
        sayHello();
        blackBoardPunishment(5);
        System.out.println("The price with %10 discount is: "+ getTenPercentDiscount(399) +"$");
        System.out.println("The price with %50 discount is: "+ getDiscountPrice(399.99, 50) +"$");
        System.out.println("The Energy Level is: " + energyLevel('B'));
        carDescription("Hondai",2010,"not damaged");

    }
    static void sayHello(){
        System.out.println("Hello!");
    }
    static void blackBoardPunishment(int repeatNumber){
        for(int i=1; i<=repeatNumber; i++){
            System.out.println("Black Board Punishment");
        }
    }
    static double getTenPercentDiscount(int price){
        return price * 0.9;
    }
    static double getDiscountPrice(int price, int percent){
        return price * percent / 100.0;
    }
    static double getDiscountPrice(double price, int percent){
        return price * percent / 100;
    }
    static String energyLevel(char letter){
        switch(letter){
            case 'A': return("Very Low");
            case 'B': return("Low");
            case 'C': return("Normal");
            case 'D': return("Above Normal");
            case 'E': return("High");
            case 'F': return("Very High");
            case 'G': return("Extremely High");
            default: return("Unknown");

        }
    }
    static void carDescription(String model, int year, String condition){
        System.out.println("This car is a "+ year+ " "+model+ " and it's "+condition );
    }
}
