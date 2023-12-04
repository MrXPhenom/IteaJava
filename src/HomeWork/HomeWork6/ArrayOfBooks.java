package HomeWork.HomeWork6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayOfBooks {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("ReWork");
        books.add("Відьмак. Останнє бажання");
        books.add("Тореадори з Васюківки");
        books.add("Захар Беркут");
        books.add("Відьмак. Меч призначення");

        Map<Integer, String> map = convertListToMap(books);
        System.out.println(map);
    }

    public static Map<Integer, String> convertListToMap(List<String> bookList) {
        Map<Integer, String> bookMap = new HashMap<>();
        for (int i = 0; i < bookList.size(); i++) {
            bookMap.put(i, bookList.get(i));
        }
        return bookMap;
    }
}
