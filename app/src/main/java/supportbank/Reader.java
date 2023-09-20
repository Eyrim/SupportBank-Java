package supportbank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    /**
     * <pre>
     *     Reads a given File to a List&lt;String&gt;
     * </pre>
     * @param file The file
     * @return List&lt;String&gt; where each element is a line from the input file
     */
    public static List<String> readFileToList(File file)  {
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
