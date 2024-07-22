package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        for(int i : arr){
            System.out.println(i);
        }

        System.out.println();
        Arrays.stream(arr).forEach(n -> System.out.println(n));

        IntStream is = Arrays.stream(arr);
        is.forEach(n-> System.out.println(n));  // is를 한번 사용하였기 때문에 is를 또 재사용 할 수 없다.

        // 만약 모든 수의 합을 구하고 싶으면 스트림을 재생성해야 된다.
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);


    }
}