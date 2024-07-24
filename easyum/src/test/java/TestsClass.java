import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

public class TestsClass {
    @org.junit.Test
    @DisplayName("Посчитать сумму чисел")
    public void calcSumm(){
        int a = 5;
        int b = 15;
        int summ = a + b;
        System.out.println(summ);
    }

    @org.junit.Test
    @DisplayName("Посчитать умножение чисел")
    public void calcMultiplication(){
        int a = 5;
        int b = 15;
        int summ = a * b;
        System.out.println(summ);
    }

    @org.junit.Test
    @DisplayName("Создать массив чисел и вывести с конца")
    public void createArray(){
        String[] numbers = {"1", "2", "3", "4", "5"};
        for (int i = 4; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

    @org.junit.Test
    @DisplayName("Посчитать вычитание чисел")
    public void calcDivision(){
        int a = 20;
        int b = 10;
        int summ = a - b;
        System.out.println(summ);
    }

    @org.junit.Test
    @DisplayName("Посчитать деление вычитание чисел")
    public void calcSubtraction (){
        float a = 20.0f;
        float b = 2.0f;
        float summ = a / b;
        System.out.println(summ);
    }

    @org.junit.Test
    @DisplayName("Создать массив через коллекцию")
    public void createArrayLis(){
        List<String> numbers = new ArrayList<>();

        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");

        for (String number : numbers) {
            System.out.printf(number);
        }
    }

    @org.junit.Test
    @DisplayName("Создать оператора Boolean")
    public void createBoolean(){
        int a = 10;
        int b = 50;
        int c = 0;
        int d = 100;

        boolean e = a < b;
        boolean f = c++==d;

        System.out.println(e);
        System.out.println(c);

    }
}
