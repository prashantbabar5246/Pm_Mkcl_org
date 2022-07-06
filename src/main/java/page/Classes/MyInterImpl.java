package page.Classes;

public class MyInterImpl implements Demo_Class.inter, Demo_Class.sumInter {
    String Name = "Prashant";
    String Age = "55556";

    @Override
    public void DemoInter() {
        String AB = Name.substring(0, 3);
        System.out.println(AB);
        System.out.println("Printing Values from Prashant_1_1");
    }


    @Override
    public int sum(int a, int b) {
        System.out.println("Printing Values from sum");
        return 0;
    }


}
