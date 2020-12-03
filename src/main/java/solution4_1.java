public class solution4_1 {
    public static void main(String[] args) {
        int max = -10, min = 10;
        int maxi = 0, mini = 0;
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = -10 + (int) (Math.random() * 21);
            System.out.println("Элемент [" + i + "] = " + array[i]);
        }
        for (int i = 0; i < 20; i++) {
            if (array[i] < 0 && array[i] > max) {
                max = array[i];
                maxi = i;
            }
            else if (array[i] > 0 && array[i] < min) {
                min = array[i];
                mini = i;
            }
            else {
                continue;
            }
        }
        System.out.println("");
        System.out.println("min = " + min + " max = " + max);
        System.out.println("mini = " + mini + " maxi = " + maxi);
        array[mini] = max;
        array[maxi] = min;
        System.out.println("");

        for (int i = 0; i < 20; i++) {
            System.out.println("Элемент [" + i + "] = " + array[i]);
        }

    }
}