package com.levelp.func;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharFuncmCl {
    public void charIn(String s) {
        //char [] charArray = s.toCharArray();
        String[] charArray = s.split("");
        ArrayList<String> Arr1 = new ArrayList<>();
        for(int a=0;a<charArray.length;a++) {
             if (charArray[a].equals("x")) {
                 System.out.println("Умножить");

                 continue;
             } else if (charArray[a].equals("(")) {
                 System.out.println("Скобка (");
                 continue;
             } else if (charArray[a].equals(")")) {
                 System.out.println("Скобка )");
                 continue;
             }
             Arr1.add(charArray[a]);
         }

        for (Object count : Arr1) {
            System.out.println(count);
        }
        raship(s);
      //  System.out.println("Вывод:" + Arrays.toString(charArray));
        //System.out.println(charArray[0] + "           " + charArray[1] + "       " + charArray.length);

        /*
        for(int a=0; a<=charArray.length;a++) {
            if(Character.isDigit(charArray[a])){
                //int[] chislo =
                System.out.println(charArray[a]);
            }
            //int[] q = Integer.parseInt(charArray[a]);
            //System.out.println(charArray[a]);
        }
        System.out.println("Вывод:" + Arrays.toString(charArray));*/
        /*for(int f=0;f<=charArray.length;f++){
            System.out.println(charArray[f]);

        //checkChar(Integer.parseInt(Arrays.toString(charArray)));
        //for(int i=0;i<=charArray.length;i++){

            checkChar(charArray[f]);
        }
    }
    private void checkChar(String f){
        System.out.println("Число");
    }
    private void checkChar(int a){
        System.out.println("Символ");*/
    }
    public void raship(String b){
        Matcher m = Pattern.compile("\\w+").matcher(b);
        while (m.find()) {
            if(m.group(0).equals('x')){continue;}
            System.out.println(m.group(0));
            /*if(Character.isDigit(Integer.parseUnsignedInt(m.group(0)))){
                System.out.println("Число");
            }
            else{
                System.out.println("символ");

            }*/
        }
    }

}