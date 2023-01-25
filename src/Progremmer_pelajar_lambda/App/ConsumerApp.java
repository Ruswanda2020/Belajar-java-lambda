package Progremmer_pelajar_lambda.App;

import java.util.function.Consumer;

import static java.lang.System.out;

public class ConsumerApp {
    public static void main(String[] args) {

        Consumer<String> consumer= value -> out.println(value);

        consumer.accept("wanda dirgantara");
    }
}
