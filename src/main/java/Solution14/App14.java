package Solution14;

import java.util.Scanner;

public class App14 {
    static Solver14 InputHandler(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double Order = Double.parseDouble(Scanner.next());

        System.out.print("What is the state? ");
        String State = Scanner.next();

        return new Solver14(Order,State);

    }

    public static void Printer(Solver14 Results){
        if(Results.State.equals("WI")){
            System.out.println("The subtotal is $" + Results.Subtotal + "\nThe Tax is $"
                    + Results.Tax + "\n The total is $" + Results.Total);
        }

    }

    public static void main(String[] args) {
        Solver14 Results = InputHandler();
        Printer(Results);
    }

}