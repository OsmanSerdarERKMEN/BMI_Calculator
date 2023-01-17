import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double length, weight, bmi;
        System.out.println("How tall are you(meter) ?: ");
        length = input.nextDouble();
        System.out.println("How many kg are you ?: ");
        weight = input.nextDouble();
        bmi = weight / (length * length);
        System.out.println("Your BMI is: " + bmi);
        if(bmi <= 24.9 && bmi >= 18.5){
            System.out.println("Congrats! You are healty!");

        } else if (bmi <= 18.5) {
            System.out.println("This is unhealty, you should gain weight.");
        } else if(bmi >= 24.9) {
            System.out.println("This is unhealty, you should lose weight.");
        }

    }
}