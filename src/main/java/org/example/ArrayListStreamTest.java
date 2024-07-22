package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jake");

        Stream<String> stream = sList.stream();
        stream.forEach(s-> System.out.println(s));

        // 스트림을 재 생성할 때 위에 코드에서 sList.stream() 를 사용해서 쓰면 된다.
        sList.stream().sorted().forEach(s-> System.out.print(s + "\t"));
        System.out.println();
        sList.stream().map(s->s.length()).forEach(n-> System.out.print(n + "\t"));
        System.out.println();
        sList.stream().filter(s->s.length() >= 5).forEach(s-> System.out.println(s));

    }
}
