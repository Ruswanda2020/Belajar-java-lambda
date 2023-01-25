package Progremmer_pelajar_lambda.util;

public class StringUtil {

  public static Boolean isLawerCase(String value){

      for (var c:value.toCharArray()){
          if (!Character.isLowerCase(c)){
              return false;
          }
      }
      return true;
  }
}
