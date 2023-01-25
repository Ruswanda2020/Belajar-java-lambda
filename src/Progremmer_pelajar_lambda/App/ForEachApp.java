package Progremmer_pelajar_lambda.App;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {

        List<String>names=List.of("rus","wanda","dirgantara");

        //loop biasa
        for (var name:names){
            System.out.println(name);
        }

        //loop menggunakan anonimus class
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        //loop mengunakan lambda
        names.forEach(valu->System.out.println(valu));

        //looping menggunakan lambda mrthod reference
        names.forEach(System.out::println);


    }
}
