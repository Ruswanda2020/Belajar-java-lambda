package Progremmer_pelajar_lambda.App;

import java.util.function.Predicate;

public class PeridicateApp {
    public static void main(String[] args) {

        Predicate<String> predicateChackBlank= value -> value.isBlank();

        System.out.println(predicateChackBlank.test(""));
        System.out.println(predicateChackBlank.test("wanda"));
    }
}
