package HomeworkBook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books=new ArrayList<>();

        books.add(new Book("BOOK 1",120,"A","22.04.2022"));
        books.add(new Book("BOOK 2",70,"B","22.04.2022"));
        books.add(new Book("BOOK 3",340,"C","22.04.2022"));
        books.add(new Book("BOOK 4",120,"D","22.04.2022"));
        books.add(new Book("BOOK 5",90,"E","22.04.2022"));
        books.add(new Book("BOOK 6",200,"F","22.04.2022"));
        books.add(new Book("BOOK 7",150,"G","22.04.2022"));
        books.add(new Book("BOOK 8",250,"H","22.04.2022"));
        books.add(new Book("BOOK 9",50,"I","22.04.2022"));
        books.add(new Book("BOOK 10",20,"J","22.04.2022"));

        Map<String,String> mappedList=new TreeMap<String,String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        books.forEach(i->{
            mappedList.put(i.getBookName(),i.getWriterName());
        });

        ArrayList<Book> pageSize=new ArrayList<>();

        books.stream().forEach(i->{
            if(i.getPageNumber()>100){
                pageSize.add(i);
            }
        });

        pageSize.stream().forEach(i-> System.out.println(i.getBookName()+":"+i.getWriterName()));

    }
}
