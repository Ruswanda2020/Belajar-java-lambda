package Progremmer_pelajar_lambda.App;

import java.util.function.Function;

public class FuntionApp {
    public static void main(String[] args) {

        Function<String,Integer> functionLength= value -> value.length();

        System.out.println(functionLength.apply("wanda"));
    }
}
