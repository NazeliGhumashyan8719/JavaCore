package homework8;

public class DinamicArrayDemo {

    public static void main(String[] args) {
        DinamicArray da = new DinamicArray();


        da.add(5);
        da.add(5);
        da.add(5);
        da.add(5);
        da.add(5);
        da.add(5);
        da.add(5);
        da.add(5);
        da.add(5);
        da.add(5);
        da.add(5);
        da.add(5);
        da.add(5);
        da.add(7);
        da.add(7);
        da.add(2);
        da.add(2);
        da.add(2);

        System.out.println(da.getByIndex(0));
        da.print();
        da.set(1,4);
        da.print();
        System.out.println(da.exists(2));
        da.print();
        System.out.println(da.getIndexByValue(6));
        da.add(8,11);
        da.print();
    }
}
