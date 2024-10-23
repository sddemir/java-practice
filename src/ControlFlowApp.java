public class ControlFlowApp {

    public static void main(String[] args) {

        boolean isDamaged = false;
        String carColor = "green";
        char energyLevel = 'S';

        if(isDamaged){
            System.out.println("This car is damaged!");
        } else{
            System.out.println("This car is not damaged!");
        }
        if(carColor.equals("red")){
            System.out.println("The car is red!");
        } else if (carColor.equals("purple")) {
            System.out.println("The car is purple!");
        }else if (carColor.equals("yellow")){
            System.out.println("The car is yellow!");
        }else {
            System.out.println("I don't know what color this car is!");
        }

        switch(energyLevel){
            case 'G' :
                System.out.println("The energy level is G!");
                break;
                case 'H' :
                    System.out.println("The energy level is H!");
                    break;
                    case 'E' :
                        System.out.println("The energy level is E!");
                        break;
            default:
                System.out.println("I don't know what energy level this car is!");
        }



    }
}

