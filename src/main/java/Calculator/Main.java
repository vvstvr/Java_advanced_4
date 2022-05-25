package Calculator;

/**
* Реализовать калькулятор в стиле ООП
* Архитектуру приложения продумать самостоятельно
 */

public class Main {
    public static void main(String args[]){

        System.out.print("Введите первое число: ");
        double a = Input.doubleNum();

        System.out.print("Введите второе число: ");
        double b = Input.doubleNum();

        System.out.print("Выберите операцию (+,-,*,/): ");
        char oper = Input.operation();

        System.out.println("Вывод:");
        Operation calc;

        switch (oper){
            case '+': calc = new Addition();
                System.out.printf("%.4f %s %.4f %s %.4f",a,oper,b," = ",calc.getResult(a,b));
                break;
            case '-': calc = new Subtraction();
                System.out.printf("%.4f %s %.4f %s %.4f",a,oper,b," = ",calc.getResult(a,b));
                break;
            case '*': calc = new Multiplication();
                System.out.printf("%.4f %s %.4f %s %.4f",a,oper,b," = ",calc.getResult(a,b));
                break;
            case '/': calc = new Division();
                System.out.printf("%.4f %s %.4f %s %.4f",a,oper,b," = ",calc.getResult(a,b));
                break;
        }
    }
}
