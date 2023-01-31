package homework9;

public class BraceChecker {

    // սա հենց տեքստն է
    private String text;

    // կլասսի կոնստրուկտորն է,որը պետք է ընդունի String տիպի տեքստ ու վերագրի վերևի տեքստին
    // որ չկարողանանք BraceChacker-ի օբյեկտը սարքենք առանց text-ը տալու կոնստրուկտորի միջոցով
    public BraceChecker(String text) {
        this.text = text;

    }

    // սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան,աշխաելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {

        System.out.println(text);
        Stack stack = new Stack();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.println(c);
            char last;
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    last = (char) stack.pop();
                    if (last != '(') {
                        System.out.println("Error:opened" + i + last + " but closed" + c);
                    }
                    break;
                case ']':
                    last = (char) stack.pop();
                    if (last != '[') {
                        System.out.println("Error:opened " + i + last + " but closed" + c);
                    }
                    break;
                case '}':
                    last = (char) stack.pop();
                    if (last != '{') {
                        System.out.println("Error:opened" + i + last + "but closed" + c);
                    }
                    break;
            }
        }
    }
}













