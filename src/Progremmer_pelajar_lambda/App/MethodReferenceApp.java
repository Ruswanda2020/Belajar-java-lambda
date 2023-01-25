package Progremmer_pelajar_lambda.App;

import Progremmer_pelajar_lambda.util.StringUtil;

import javax.print.DocFlavor;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {

        //Predicate<String> predicateIsLowerCase= value -> StringUtil.isLawerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLawerCase;

        System.out.println(predicateIsLowerCase.test("wanda"));
        System.out.println(predicateIsLowerCase.test("Wanda"));

        // method reference di parameter
        //Function<String,String> function= value -> value.toUpperCase();
       Function<String,String> function= String::toUpperCase;
        System.out.println(function.apply("wanda"));
    }

//non static
    public void run(){

        Predicate<String> predicateIsLowerCase =this::isLawerCase;

        System.out.println(predicateIsLowerCase.test("wanda"));
        System.out.println(predicateIsLowerCase.test("Wanda"));

    }

    public void run2(){

        MethodReferenceApp app=new MethodReferenceApp();
        Predicate<String> predicateIsLowerCase =app::isLawerCase;

        System.out.println(predicateIsLowerCase.test("wanda"));
        System.out.println(predicateIsLowerCase.test("Wanda"));

    }
    public  Boolean isLawerCase(String value) {

        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
