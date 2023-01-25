package Progremmer_pelajar_lambda.App;

import java.util.function.Supplier;

public class LazyApp {
    public static void main(String[] args) {
      testScore(90,()->getname());
    }

    public static void testScore(Integer valu, Supplier<String> name){
        if (valu>80){
            System.out.println("selamat "+name.get()+ " anda lulus");
        }
        else {
            System.out.println("silahkan coba lagi");
        }
    }

    public static String getname(){
        System.out.println("method getname di pangil");
        return "wanda";
    }
}
