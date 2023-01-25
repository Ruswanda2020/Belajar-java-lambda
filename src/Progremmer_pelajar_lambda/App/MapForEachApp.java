package Progremmer_pelajar_lambda.App;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {

        Map<String,String> map=new LinkedHashMap<>();
        map.put("first_name","rus");
        map.put("middle_name","wanda");
        map.put("last_name","dirgantara");

        //looping biasa
        for (var name:map.entrySet()){
            System.out.println(name);
        }

        //looping use anonymouse class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+":"+value);
            }
        });

        //looping dengn lambda
        map.forEach((key, value) -> System.out.println(key+":"+value));
    }
}
