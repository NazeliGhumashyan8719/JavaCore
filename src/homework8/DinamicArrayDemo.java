package homework8;

public class DinamicArrayDemo {

    public static void main(String[] args) {
        DinamicArray da = new DinamicArray();
        for (int i = 0; i < 10; i++) {
            da.add(i+1);

        }


        da.print();
        da.add(1,222);
        da.print();

    }
}

