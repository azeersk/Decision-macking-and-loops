public class displayClass {
    public static void main(String[] args){
        //Display English Alphabets using loop
        char U;
        System.out.print("Uppercase Alphabets: ");
        for(U ='A'; U<='Z'; U++){
            System.out.print(U+" ");
        }

        char l;
        System.out.println();
        System.out.print("Lowercase Alphabets: ");
        for(l='a'; l<='z'; l++){
            System.out.print(l+" ");
        }

        //Count Number of Digits in an Integer
        int count = 0;
        int num = 2123123;
        for(;num!=0; num/=10 , count++){
        }
        System.out.println();
        System.out.println("Number of Digits: "+count);

        //Reverse a Number
        int reverse = 0, value = 123456789;
        for(; value!=0; value/=10, reverse++){
            int digit = value%10;
            reverse = reverse*10 + digit-1;
        }
        System.out.println("Reversed Number: "+ reverse);

        //Calculate the Power of a Number
        int base = 12,power = 2;
        double calculateOf = Math.pow(base,power);
        System.out.println(calculateOf);

        //string palindrome check
        String Polin = "ranar";
        String empty = "";
        for(int i=0; i<Polin.length(); i++){
            empty = empty+Polin.charAt((Polin.length()-1)-i);
        }

        if (empty.equals(Polin)){
            System.out.println(Polin + " is a palindrome");
        }
        else{
            System.out.println(Polin + " is not palindrome");
        }

        int number = 12121;
        String numberToString = Integer.toString(number);
        String numEmpty = "";
        for(int i=0; i<numberToString.length(); i++){
            numEmpty = numEmpty + numberToString.charAt((numberToString.length()-1)-i);
        }
        if (numEmpty.equals(numberToString)){
            System.out.println(number + " is a palindrome Number!");
        }
        else{
            System.out.println(number + " is not a palindrome Number!");
        }

        //Check Whether a Number is Prime or Not
        int a = 23;
        boolean prime = false;

        for(int i =2; i<a; i++){
            if(a%i==0)
                prime = true;
        }

        if (prime){
            System.out.println(a + " is not a prime number!!");
        }
        else{
            System.out.println(a+" is a prime number!!" );
        }

        // Prime Numbers Between two Intervals
        int firstP, secondP = 52;
        System.out.print("Prime numbers: ");
        for(firstP=20; firstP<=secondP; firstP++){
            boolean primeCheck = false;
            for(int j=2; j<firstP; j++) {
                if (firstP % j == 0) {
                    primeCheck = true;
                    break;
                }
            }
            if(!primeCheck){
                System.out.print(firstP + " ");
            }
        }
        System.out.println();
        //Check Armstrong Number
        int Am = 153;
        String AmS = Integer.toString(Am);
        Double FinalAm = 0.0;
        for(int i=0; i<AmS.length(); i++){
            FinalAm = FinalAm + Math.pow(Integer.parseInt(String.valueOf(AmS.charAt(i))),AmS.length());
        }
        if(FinalAm == Am)
            System.out.println(Am + " is a ArmStrong Number!!");
        else
            System.out.println(Am + " is not a ArmStrong Number!!");

        //Display Armstrong Number Between Two Intervals
        int ArmFirst = 999;
        int ArmSecond = 99999;
        for(int i = ArmFirst; i<ArmSecond; i++){
            String ArmS = Integer.toString(i);
            Double FinalArm = 0.0;
            for(int j=0; j<ArmS.length(); j++){
                FinalArm = FinalArm + Math.pow(Integer.parseInt(String.valueOf(ArmS.charAt(j))),ArmS.length());
            }
            if(FinalArm == ArmFirst)
                System.out.println(ArmFirst);
            ArmFirst = ArmFirst + 1;

        }

    }
}
