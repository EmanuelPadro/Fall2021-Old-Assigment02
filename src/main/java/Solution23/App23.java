package Solution23;

import java.util.Scanner;

public class App23 {
    static Solver23 InputHandler(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("");
        int Num1 = Integer.parseInt(Scanner.next());

        System.out.print("");
        int Num2 = Integer.parseInt(Scanner.next());

        return new Solver23(Num1,Num2);

    }

    public static void Printer(Solver23 Results){
        System.out.println(" " + Results);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Solver23 Results = InputHandler();
        Printer(Results);
    }

}
//ex06 getCalendar.
//lots of exercises to solve division between ints issue just put (double) also works with (int)
//Noteworthy stuff learned ex 11 how to round to nearest cent ((int)(100*euros*rate))/(double)100;