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
}
