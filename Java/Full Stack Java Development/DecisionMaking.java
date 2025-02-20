public class DecisionMaking {
    public static void main(String[] args) {
        int x = 6;
        if ( x != 6) {
            System.out.println("X is not 6");
        }else {
            System.out.println("X is 6");
        }

        int y = 5;

        if ( y >= 5) {
            System.out.println("X is greater or equal to 5");
        }else {
            System.out.println("X is lower than 5");
        }

        boolean a = true;
        boolean b = false;

        if ( a || b ) {
            System.out.println("Condition is true");
        }else {
            System.out.println("Condition is false");
        }

        int ageOfBoy = 28;
        int ageOfGirl = 25;

        if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) {
            System.out.println("Eligible for marriage");
        } else {
            System.out.println("Not Eligible");
        }

    }
}
