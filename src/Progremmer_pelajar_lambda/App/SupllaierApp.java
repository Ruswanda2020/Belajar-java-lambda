package Progremmer_pelajar_lambda.App;

import java.util.function.Supplier;

public class SupllaierApp {
    public static void main(String[] args) {

        Supplier<String> supplier= () -> "ruswanda dirgantara ";
        System.out.println(supplier.get());
    }
}
