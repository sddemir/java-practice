public class LoopsApp {

    public static void main(String[] args) {
        int i =1;
        while(i<=5){
            System.out.println("BEING RIGHT SUCKS.");
            i++;
        }
        System.out.println(i);

        int a = 1;
        do {
            System.out.println(a+"BEING RIGHT SUCKS.");
            a++;
        } while(a<=5);

        for(int j = 1;j<=5;j++){
            if(j==3){
                break;
            }
            System.out.println(j+ ".BEING RIGHT SUCKS.");
        }
    }
}
