package supportbank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static List<String> readFileToList(File file) throws FileNotFoundException {
        try (Scanner sc = new Scanner(file)) {
            ArrayList<String> data = new ArrayList<>();
            while (sc.hasNext()) {
                data.add(sc.nextLine());
            }

            return data;
        }
    }
}
