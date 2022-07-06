package page.Classes;

import java.util.Locale;

public class main {
    public static void main(String[] args) {
        /*
        Demo_Class.inter ii = new MyInterImpl() {
        };

        Demo_Class.inter i = new Demo_Class.inter() {
            @Override
            public void DemoInter() {

                System.out.println("Hi everyone1");
            }

            @Override
            public void DemoInterTwo() {

            }
        };

        Demo_Class.inter i2 = new Demo_Class.inter() {
            @Override
            public void DemoInter() {
                System.out.println("Hi everyTwo");
            }

            @Override
            public void DemoInterTwo() {

            }
        };
        Demo_Class.inter i3 = new Demo_Class.inter() {
            @Override
            public void DemoInter() {
                System.out.println("Hi EveryThree");

            }

            @Override
            public void DemoInterTwo() {

            }
        };

         */

        Demo_Class.inter i = () ->{
            System.out.println("This is A Functional Interface");
        };

        Demo_Class.sumInter i2 =(int a, int b)->{

            return a*b;
        };
        Demo_Class.Length CalculateLength = str -> str.length();
        System.out.println("This Is A Length " + CalculateLength.getLength("KiRan"));


        i.DemoInter();
        System.out.println(i2.sum(96,45));



    }
}
