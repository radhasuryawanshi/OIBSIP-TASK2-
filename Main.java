import java.util.Scanner;
 class Number_Guessing {
    public static void guessingNumber()
    {
      Scanner s = new Scanner(System.in);

      int number = 1+ (int)(100 * Math.random());

      int ar = 5;

      int i,guess;

        System.out.println("A number is chosen " + "between 1 to 100," + "guess the number" + "within 5 trails!!!");
        for(i = 0;i < ar;i++){

            System.out.println("guess the number:");
            guess =s.nextInt();

            if(number == guess){

                System.out.println("Congratulations !!!" + "You guessed the number.");

            }
            else if(number > guess && i != ar - 1){

                System.out.println("The number is " + "greater than " +guess);

            }
            else if(number < guess && i != ar -1 ){

                System.out.println("The number is " + "less than " +guess);

            }
        }
        if(i == ar) {

            System.out.println("You have finished your" + "a trails.");
            System.out.printf("The number was" + number);

        }
        }
        public static void main(String arg[]){
        guessingNumber();
        }
    }
