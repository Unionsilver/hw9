import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int sum = 0;
        int[] expenses = generateRandomArray();
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
//        Arrays.sort(expenses);
//        System.out.println("Минимальная сумма трат за день составила " + expenses[0] + " рублей. Максимальная сумма трат за день составила " + expenses[expenses.length -1] + " рублей");
//        одно из коротких решений моих, но затраты писец больше видимо как глеб обьяснил и потеря  в каком месяце какая трата)
        int[] expenses = generateRandomArray();
        int min = expenses[0];
        int max = expenses[0];
        for (int expens : expenses) {
            if (expens < min) {
                min = expens;
            } else if (expens < max) {
                max = expens;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. \nМаксимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        int[] expenses = generateRandomArray();
        double sum = 0;
        double days = 30.0;
        for (int i = 0; i < expenses.length; i++) {
            sum += expenses[i];
        }
        sum /= expenses.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", sum);
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
