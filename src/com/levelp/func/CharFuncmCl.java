package com.levelp.func;
import com.sun.media.sound.SoftLinearResampler2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharFuncmCl {
    public void charIn(String s) {
        String[] charArray = s.split("");
        ArrayList<String> Arr1 = new ArrayList<>();
        ArrayList<String> Arr2 = new ArrayList<>();
        for(int a=0;a<charArray.length;a++) {
             if (charArray[a].equals("x")) {
                 System.out.println("Умножить");
                 krat(charArray[++a],Arr1,Arr2);
                 continue;
             } else if (charArray[a].equals("(")) {
                 System.out.println("Скобка (");
                 povtorChar(charArray[++a],Arr1,Arr2);
                 continue;
             } else if (charArray[a].equals(")")) {
                 System.out.println("Скобка )");
                 continue;
             }
             Arr1.add(charArray[a]);
         }
        for (Object count : Arr1) {
            System.out.print(count);
       }
        //raship(s);
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
    public void povtorChar(String c,ArrayList Arr1, ArrayList Arr2){
        int q= Integer.parseInt(c);
        Arr2.clear();
        for(int i=Arr1.size()-q;i<Arr1.size();i++ ) {
            Arr2.add(Arr1.get(i));
        }
    }
    public void krat(String c, ArrayList Arr1, ArrayList Arr2){
        int q = Integer.parseInt(c);
        while (q!=0){
            for(int i=0;i<Arr2.size();i++) {
                Arr1.add(Arr2.get(i));
            }
        q--;
    }
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