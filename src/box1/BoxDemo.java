package box1;


public class BoxDemo {

    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // присвоить значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // рассчитать объуь параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Объем равен " + vol);
    }
}



