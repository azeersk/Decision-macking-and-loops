import java.util.Arrays;
import java.util.Scanner;

public class calculatorClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //a Simple Calculator Using switch...case
        Double number1, number2, result;
        System.out.println("         +, -, *, /, %");
        System.out.println("        ================");

        System.out.print("Choose the operator: ");
        String Operator = input.next();

        System.out.print("Enter your first value: ");
        number1 = input.nextDouble();
        System.out.print("Enter your second value: ");
        number2 = input.nextDouble();

        switch (Operator){
            case "+":
                result = number1 + number2;
                System.out.println(number1 +" + "+ number2 +" = "+result);
                break;
            case "-":
                result = number1-number2;
                System.out.println(number1 +" - "+ number2 +" = "+result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println(number1 +" * "+ number2 +" = "+result);
                break;
            case "/":
                result = number1 / number2;
                System.out.println(number1 +" / "+ number2 +" = "+result);
                break;
            case "%":
                result = number1 % number2;
                System.out.println(number1 +" % "+ number2 +" = "+result);
                break;
            default:
                System.out.println("invalid inputs!!");
                break;
        }

        //Count the Number of Vowels and Consonants in a Sentence digits, and spaces
        String sentence = "java8 programming language is aw3som3";
        int vowels=0, consonants=0, digits=0, spaces=0;
        char c;
        System.out.println(sentence.length());
        for(int i=0; i<sentence.length(); i++){
            c = sentence.charAt(i);
            if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
                ++vowels;
            else if(c>='a' && c<='z')
                ++consonants;
            else if(c>='0' && c<='9')
                ++digits;
            else if(c==' ')
                ++spaces;
        }
        System.out.println("number of vowels: "+vowels);
        System.out.println("number of vowels: "+consonants);
        System.out.println("number of vowels: "+digits);
        System.out.println("number of vowels: "+spaces);

        //Sort Elements in Lexicographical Order
        String[] arr ={"C", "C++", "Python", "Ruby", "Java"};
        Arrays.stream(arr).sorted();
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
