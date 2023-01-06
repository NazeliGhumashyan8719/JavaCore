package homework4;

public class CharArrayExample {

    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                j = j + 1;
            }
        }

        System.out.println(j);//tpel qani hat 'o' ka


        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};

        System.out.print(chars2[chars2.length / 2]);// tpel mejtexi erku sinvolner@
        System.out.println(chars2[chars2.length / 2 - 1]);


        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean b = false;
        if ((chars3[chars3.length - 2] == 'l') && (chars3[chars3.length - 1] == 'y')) {

            System.out.println(b);//ete verjanum e ly-ov tpel true
        }

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int d = 0; d < text.length; d++) {
            if (text[d] != ' ') {
                System.out.println(text[d]);// bacatner@ chtpel
            }

        }
    }

}

















