package supportbank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
//    public static List<String> readFileToList(File file) throws FileNotFoundException {
//        try (Scanner sc = new Scanner(file)) {
//            ArrayList<String> data = new ArrayList<>();
//            while (sc.hasNext()) {
//                data.add(sc.nextLine());
//            }
//
//            return data;
//        }
//    }

    public static List<String> readFileToList(File file) throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            ArrayList<String> data = new ArrayList<>();

            while (br.ready()) {
                data.add(br.readLine());
            }

            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
