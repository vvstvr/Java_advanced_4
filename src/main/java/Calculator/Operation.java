package Calculator;

/**
 * Абстрактный класс по которому далее будут создаваны дочерние классы.
 */
abstract class Operation {
    double getResult(double a,double b){
        return a+b;
    }
}
