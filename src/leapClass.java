import java.util.Scanner;

public class leapClass {
    public static void main(String[] args){
        //Java Program to Check a Leap Year
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean leap = false;
        if(year%4 == 0){
            if(year%100 == 0){
                if (year%400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else{
            leap = false;
        }
        if(leap)
            System.out.println(year+" is leap year!");
        else
            System.out.println(year+" is not leap year!");

        double integ = -21;
        if (integ>0.0)
            System.out.println(integ+" is a positive number!");
        else if (integ == 0.0)
            System.out.println(integ+" is a zero!");
        else
            System.out.println(integ+" is a negative number!");

        //Check Whether a Character is Alphabet or Not
        char checkChar = 'a';
        if ((checkChar>='a' && checkChar<='z') || (checkChar>='A' && checkChar<='Z'))
            System.out.println(checkChar + " is a alphabet!");
        else
            System.out.println(checkChar + " is not a alphabet!");

        int a = 100;
        int sumOf = 0;
        for(int i=1; i<=a; i++)
            sumOf = sumOf + i;
        System.out.println("sum of natural numbers: "+ sumOf);

        // Factorial of a Number
        int fact = 5;
        int factSum = 1;
        for(int i=1; i<=fact; i++){
            factSum = i*factSum;
        }
        System.out.println("factorial Of "+fact+" is: "+factSum);



    }
}
