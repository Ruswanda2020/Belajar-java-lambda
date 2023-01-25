package Progremmer_pelajar_lambda.App;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {

        sayHallo("wanda");

        String name=null;

        sayHallo(name);


    }

    public static void sayHallo(String name) {

       /* Optional.ofNullable(name)
                .map(String::toUpperCase)
                .ifPresentOrElse(
                        value -> System.out.println("HALLO "+value),
                        ()-> System.out.println("HALLO")
                        );
*/
        String nameuppr=Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");
        System.out.println("hallo " +nameuppr);



       // Optional<String> opsi = Optional.ofNullable(name);
       // Optional<String> nametoUpper = opsi.map(valu -> valu.toUpperCase());
       // nametoUpper.ifPresent(value -> System.out.println("hallo "+value));

        //if chcek null
      // if (name != null){
         //   String nameupper=name.toUpperCase();
         //   System.out.println(nameupper);
       // }
    }
}