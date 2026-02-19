import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        //Запрос от бухгалтерии: «Входной массив — выплаты авторам контента. Рассчитайте сумму,
        // максимальную, минимальную и среднюю выплату за месяц. Запишите результаты в
        //outputArray в таком порядке: [сумма, максимум, минимум, среднее]».
        // Создайте массив inputArray1 с пятью элементами с целыми числами и задайте каждому элементу значение.
        // Тип outputArray1 определите самостоятельно. В конце каждой задачи выведите
        //inputArray1 и outputArray1.
        int[] inputArray1 = {32_000, 61_000, 29_800, 47_350, 50_000};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        float average = 0;

        for (int money: inputArray1) {
            sum += money;
            if (min > money) {
                min = money;
            } else if (max < money) {
                max = money;
            }
            average += money;
            average = average / inputArray1.length;
        }
        float[] outputArray1 = {sum, max, min, average};
        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));
        //    System.out.println("Минимальная сумма трат за месяц составила = " + min + " рублей");
        //   System.out.println("Максимальная сумма трат за месяц составила = " + max + " рублей");
        //    System.out.println("Средняя сумма трат за месяц составила = " + average + " рублей");

        System.out.println("Task 2");
        //Запрос от налогового отдела: «Входной массив — выплаты сотрудникам, трудоустроенным по ТК РФ.
        // Посчитайте налог 13% для каждой выплаты. Результаты запишите в outputArray».
        //Создайте массив inputArray2 с пятью элементами с целыми числами и задайте каждому элементу значение. Тип
        //outputArray2 определите самостоятельно. В конце каждой задачи выведите inputArray2 и outputArray2.
        int[] inputArray2 = {12_754, 24_261, 15_366, 19_972, 22_003};
        float[] outputArray2 = new float[inputArray2.length];
        double taxes = 0.13;
        for(int i = 0; i < inputArray2.length; i++){
            outputArray2[i] = (float) (inputArray2[i] * taxes);
        }
        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));

        System.out.println("Task 3");
        //Запрос от HR: «Входной массив — бонусы сотрудников отдела продаж за январь.
        // Найдите все бонусы выше 5000 ₽. Запишите в outputArray массив флагов true, где
        // условие выполняется, и false — где не выполняется». Создайте массив
        //inputArray3 с пятью элементами с целыми числами и задайте каждому элементу значение. Тип
        //outputArray3 определите самостоятельно. В конце каждой задачи выведите inputArray3 и outputArray3.
        int[] inputArray3 = {5128, 7500, 3200, 1450, 5015};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int bonus = 5000;
        int calc = 0;
        for (int i = 0; i < inputArray3.length; i++){
            outputArray3[i] = bonus < inputArray3[i];
        }
        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outputArray3));

        System.out.println("Task 4");
        //Запрос от кредитного отдела: «Входной массив — остаток на кредитном счете клиента в начале
        // каждого месяца. Проверьте, есть ли у клиента просрочки платежей за кредит. Если остаток на
        // счете всегда был положительным, верните true. Если баланс хотя бы раз был отрицательным, верните
        //false. Проверка должна выполняться максимально быстро, поэтому не проверяйте все месяцы, если хотя
        // бы раз попался отрицательный элемент». Создайте массив inputArray4 с пятью элементами с целыми
        // числами и задайте каждому элементу значение. Тип outputArray4 определите самостоятельно. В конце
        // каждой задачи выведите inputArray4 и  outputArray4
        //.
        int[] inputArray4 = {130, 150, 0, 0, 1};
        boolean[] outputArray4 = {true};
        for (int credit: inputArray4){
            if (credit < 0){
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + Arrays.toString(outputArray4));

        System.out.println("Task 5");
        //Запрос от CEO: «Входной массив — чистая прибыль компании за месяц. Посчитайте, сколько месяцев
        // были рентабельными (прибыль > 0)». Создайте массив inputArray5 с пятью элементами с целыми числами
        // и задайте каждому элементу значение. Тип outputArray5 определите самостоятельно. В конце каждой
        // задачи выведите inputArray5 и outputArray5.
        int[] inputArray5 = {130_000, 150_000, 0, 0, -100_000};
        int[] outputArray5 = {0};
        for (int profit: inputArray5){
            if (profit > 0){
                outputArray5[0]++;
            }
        }
        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5: " + Arrays.toString(outputArray5));
        }
    }