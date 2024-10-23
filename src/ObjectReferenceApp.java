public class ObjectReferenceApp {

    public static void main(String[] args) {
        Byte numberOfSeats=5;
        Short horsePower = 392;
        Integer price = 14999;
        Long registrationNumber = 123456789L;

        Float fuelConsumption = 15.5f;
        Double fuelConsumptonPrecise = 15.12345543234;

        Boolean isDamaged = true;
        Character energyEfficiencyCategory = '6';

        String carModel = "DodgeChallanger SRT 392";
        String carModelNew = new String("DodgeChallanger SRT 392");

        System.out.println("Number of seats:" + numberOfSeats);
        System.out.println("Horse Power:" + horsePower);
        System.out.println("Price:" + price.floatValue());
        System.out.println("Registration Number:" + registrationNumber);
        System.out.println("Fuel consumption:" + fuelConsumption);
        System.out.println("Fuel consumption Precise:" + fuelConsumptonPrecise.intValue());
        System.out.println("Is damaged:" + isDamaged);
        System.out.println("Energy Efficiency Category:" + energyEfficiencyCategory);
        System.out.println("Car Model:" + carModel.toUpperCase());
        System.out.println("Car Model lower case:" + carModel.toLowerCase());
        System.out.println("Car Model new keyword equal:" + carModel.equals(carModelNew));
        System.out.println("Car Model New:" + carModelNew);


    }
}
