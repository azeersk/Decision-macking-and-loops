public class fiboClass {
    public static void main(String[] args){
        //Display Fibonacci Series
        int fibo = 7;
        int first = 0;
        int second = 1;
        int fiboNum = 0;
        if (fibo>=0)
            System.out.println(first);
        else
            System.out.println("Enter valid number!");
        for(int i=1; i<=fibo; i++){
            fiboNum = first + second;
            System.out.println(fiboNum);
            second = first;
            first = fiboNum;

        }

        //Find GCD of two Numbers
        int firstG = 56;
        int secondG = 100;
        int gcd = 1;
        for(int i=1; i<=firstG && i<=secondG; i++){
            if(firstG%i==0 && secondG%i==0)
                gcd = i;
        }
        System.out.println("GCD of "+ firstG + " and "+ secondG +" is: "+ gcd);

        //Find LCM of two Numbers
        int firstL = 72;
        int secondL = 120;
        int gcdOne = 1;
        for(int i=1; i<=firstL && i<=secondL; i++){
            if(firstL%i==0 && secondL%i==0)
                gcdOne = i;
        }

        int lcm = (firstL * secondL)/gcdOne;
        System.out.println("GCD of "+ firstL + " and "+ secondL +" is: "+ lcm);
    }
}
