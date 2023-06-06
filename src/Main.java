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
        int[] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
//        Arrays.sort(arr);
//        System.out.println("Минимальная сумма трат за день составила " + arr[0] + " рублей. Максимальная сумма трат за день составила " + arr[arr.length -1] + " рублей");
//        одно из коротких решений моих, но затраты писец больше видимо как глеб обьянил и потеря в каком месяце какая трата)
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        double days = 30.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum /= days;
        System.out.println("Средняя сумма трат за месяц составила " +sum+ " рублей");
    }

    public static void task4() {
        int[] arr = generateRandomArray();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1 ; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}