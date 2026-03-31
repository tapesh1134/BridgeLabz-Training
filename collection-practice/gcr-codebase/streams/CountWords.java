
import java.io.*;
import java.util.*;

public class CountWords {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\s+");

                for (String w : words) {
                    w = w.replaceAll("[^a-z]", "");
                    if (w.length() == 0) {
                        continue;
                    }

                    if (map.containsKey(w)) {
                        map.put(w, map.get(w) + 1);
                    } else {
                        map.put(w, 1);
                    }
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error reading file");
            return;
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getValue() > list.get(i).getValue()) {
                    Map.Entry<String, Integer> temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println("Top 5 words: ");
        for (int i = 0; i < 5 && i < list.size(); i++) {
            System.out.println(list.get(i).getKey() + " = " + list.get(i).getValue());
        }
    }
}
