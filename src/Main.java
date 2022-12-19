public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        BedenKitleIndex bedenKitleIndex = new BedenKitleIndex();
        FindMax findMax = new FindMax();
        GradeCalculation calculation = new GradeCalculation();
        calculation.calculation();
        calculator.calculator();
        bedenKitleIndex.bedenKitleIndexHesaplama();
        findMax.max();
    }
}

