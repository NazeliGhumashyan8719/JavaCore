package chapter6;

public class BoxDemo4 {

    public static void main(String[] args) {
       Box mybox1 = new Box();
       Box mybox2 = new Box();
       double vol;

       // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        /* присвоить другие значения переменным
        экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // получить объем первого паралелепипеда
        vol = mybox1.volume();
        System.out.println(vol);
        // получить объем второго паралелепипеда
        vol = mybox2.volume();
        System.out.println(vol);


    }
}
