package Progremmer_pelajar_lambda.App;

import Progremmer_pelajar_lambda.SimpleAction;

public class SimpleApp {
    public static void main(String[] args) {

        /*
        SimpleAction simpleAction = new SimpleAction() {
            @Override
            public String action() {
                return "wanda gnatang ";
            }
        };

        System.out.println(simpleAction.action());

        SimpleAction simpleAction2 = () -> {
            return "wanda ganteng";
        };
        System.out.println(simpleAction2.action());
       */

        SimpleAction simpleAction1=(String name)->{
            return "hallo"+name;
        };

        SimpleAction simpleAction2=(name)->{
            return "hallo"+name;
        };

        SimpleAction simpleAction3=(String name)->"hallo"+name;

        SimpleAction simpleAction4=(name)->"hallo"+name;

        SimpleAction simpleAction5=name->"hallo"+name;



    }
}
