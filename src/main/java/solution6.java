import java.io.*;
import java.util.*;

public class solution6 {

    public static void main(String[] args) {
        int x = 0;
        String line;
        BufferedReader nf = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try {
            BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
            try {
                while ((str = bf.readLine()) != null) {
                    ++x;
                }
            } catch (Throwable var12) {
                try {
                    bf.close();
                } catch (Throwable var9) {
                    var12.addSuppressed(var9);
                }
                throw var12;
            }
            bf.close();
        } catch (IOException var13) {
            System.out.println("Ошибка ввода-вывода: " + var13);
        }


        List<String> words = new ArrayList<>();


        try {
            BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
            while ((str = bf.readLine()) != null) {
                String[] wordsInLineArray = str.split(" ");
                final List<String> wordsInLineList = Arrays.asList(wordsInLineArray);
                words.addAll(wordsInLineList);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Неотсортированный массив:");
        System.out.println(words);

        Collections.sort(words);

        System.out.println("Отсортированный массив:");
        System.out.println(words);

        HashMap<String, Integer> hm = new HashMap<>();
        Integer counter;
        String maxKey = null;
        for (String i : words) {
            counter = hm.get(i);
            hm.put(i, counter == null ? 1 : counter + 1);
        }
        System.out.println("Статистика:");
        System.out.println(hm + "\n");

        for (String i : words) {
            if (hm.get(i).equals(Collections.max(hm.values()))) {
                maxKey=i;
            }
        }
        System.out.println("Элемент встречающийся чаще всех:");
        System.out.println(maxKey + " = " + Collections.max(hm.values()));
    }
}