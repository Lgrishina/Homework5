
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] newArray = {56, 25, 23, 67, 1};
        System.out.println(Arrays.toString(newArray));

        for (int out = newArray.length - 1; out >= 1; out--){  //Внешний цикл
            for (int in = 0; in < out; in++){       //Внутренний цикл
                if(newArray[in] > newArray[in + 1]) // Если порядок сравниваемых переменных нарушен
                   {int d = newArray[in];      //во временную переменную помещаем первый элемент
                    newArray[in] = newArray[in+1];       //на место первого ставим второй элемент
                    newArray[in+1] = d;}
                }
        }
        System.out.println(Arrays.toString(newArray) + "- отсортированный массив");
    }
}