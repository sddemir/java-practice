public class MyFirstJavaApp {


    public static void main(String[] args){
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;

        short power =362;
        short horsePower =492;
        short co2Emission =333;
        short cubicCapacity =6417;

        int price = 29999;
        int mileage= 14999;

        long registrationNumber = 946263576576325263L;

        float fuelConsumption = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;


        double fuelSomething = 152.3456787654345e-1;


        boolean isDamaged=true;

        char energy = '6';

        System.out.println("2018 Dodge Challanger SRT3");
        System.out.println("Price: $" + price + "dollars");
        System.out.println("Mileage: " + mileage);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Fuel Consumption: " + fuelConsumption);
        System.out.println("the car is damaged: " + isDamaged);
        System.out.println("cubic capacity: " + cubicCapacity);
        System.out.println("power: " + power);
        System.out.println("horse power: " + horsePower);
        System.out.println("co2emission: " + co2Emission);
        System.out.println("energy: " + energy);
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban);
        System.out.println("Number of seats: " + numberOfSeats);

        System.out.println("Conversion");
        short newNumberOfSeats = numberOfSeats;
        System.out.println("The values of new number of seats: " + newNumberOfSeats);
        double newFuelConsumption = fuelConsumption;
        System.out.println("The new fuel consumption: " + newFuelConsumption);
        byte newPower = (byte) power;
        System.out.println("The new power: " + newPower);
    }
}
