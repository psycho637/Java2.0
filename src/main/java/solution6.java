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
                System.out.println("Слова из файла: ");
                while ((str = bf.readLine()) != null) {
                    ++x;
                    System.out.println(str);
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



        ArrayList<String>words = new ArrayList<>();


        try {
            BufferedReader bf = new BufferedReader(new FileReader("test.txt"));
            while ((str = bf.readLine()) != null) {
                line = str;
                words.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Массив слов: ");
        System.out.println(words);

        Collections.sort(words);
        
        System.out.println("Отсортированный массив слов: ");
        System.out.println(words);
//        }
    }
}