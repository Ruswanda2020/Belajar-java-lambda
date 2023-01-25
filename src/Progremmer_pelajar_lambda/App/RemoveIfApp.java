package Progremmer_pelajar_lambda.App;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        names.addAll(List.of("rus","wanda","dirantara"));

        //remove if anonymouse class
        /*names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String name) {
                return name.length()>5;
            }
        });
        */
       names.removeIf(name->name.length()>5);


        System.out.println(names);
    }
}
