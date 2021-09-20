package Solution16;

import java.util.Scanner;

public class App16 {
    static Solver16 InputHandler(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        int Age = Integer.parseInt(Scanner.next());

        return new Solver16(Age);

    }

    public static void Printer(Solver16 Results){
        System.out.println(Results.Output);
    }

    public static void main(String[] args) {
        Solver16 Results = InputHandler();
        Printer(Results);
    }

}