public class Break {
    public static void main(String[] args) {

        // break exit from loop and switch
/*
        int i = 0;

        while (i < 3){
            System.out.println("Hi!");
            i++;
            break;
        }

 */

/*
        // Array
        int[] numbers = {10, 20, 30, 40, 50}; // деклариране

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 30){
                break;
            }
            System.out.println(numbers[i]);
        }

 */


/*
        int i = 1;
        switch (i){
            case 0:
                System.out.println("Zero!");
                break;
            case 1:
                System.out.println("One!");
                break;
            default:
                System.out.println("WTF man?");
                break;
        }

 */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + ", " + j);
                break;
            }
        }
    }
}
