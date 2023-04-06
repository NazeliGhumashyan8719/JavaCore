package othertests.arraysort;

public class DinamicArrayDemo {

    public static void main(String[] args) {

        DinamicArray da = new DinamicArray();


        da.add(3);
        da.add(33);
        da.add(1);
        da.add(2);
        da.add(13);
        da.add(35);
        da.add(25);
        da.add(34);
        da.add(25);
        da.add(333);


        da.print();
        System.out.println(da.getByIndex(1));
        da.print();


    }
}

