package io.github.kongeor.example1;

import java.util.stream.IntStream;

public class Factorial {

    public static int recursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursive(n - 1);
        }
    }

    public static int stream(int n) {
        return IntStream.rangeClosed(1, n).reduce((a, b) -> a * b).orElse(-1);
    }

    public static void main(String[] args) {
        System.out.println(stream(5));
    }
}
