package chapter7.overload.overload5;

public class PassObjRe {

    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a и ob.b после ввызова: " + ob.a + " " + ob.b);

    }
}

