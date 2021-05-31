package lambda;

public class Main {
    public static void main(String[] args) {
        Calc calc = (a, b) -> a*b;
        int c = calc.operation(7,6);
        System.out.println(c);
        Tax tax = (tax1 -> tax1*1.20);
        printEurWithTax(20,tax);
    }



    private static void print(int a, int b, Calc calc){
        System.out.println(calc.operation(a, b));
    }

    private static void printEurWithTax(double value, Tax tax){
        System.out.println(tax.calcTax(value) + " €");
    }
}
