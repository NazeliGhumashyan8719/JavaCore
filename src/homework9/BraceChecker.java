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
        int last;
        char lastBracket;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    last = stack.pop();
                    if (last == 0) {
                        System.out.println("Error at " + i + " closed " + c + " but not  opened");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '(') {
                            System.out.println("Error:at " + i + " opened " + lastBracket + " but closed " + c);
                        }
                    }
                    break;
                case ']':
                    last = stack.pop();
                    if (last == 0) {
                        System.out.println("Error at " + i + " closed " + c + " but not  opened");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '[') {
                            System.out.println("Error:at " + i + " opened " + lastBracket + " but closed " + c);
                        }
                    }
                    break;
                case '}':
                    last = stack.pop();
                    if (last == 0) {
                        System.out.println("Error at " + i + " closed " + c + " but not  opened");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '{') {
                            System.out.println("Error:at " + i + " opened " + lastBracket + " but closed " + c);
                        }
                        break;
                    }
            }
        }
        //  while ((lastBracket = (char) stack.pop()) != 0) {
        //      System.out.println("Error:opened " + lastBracket + " but not closed");
        //  }
        while (!stack.isEmpty()) {
            System.out.println("Error:opened " + (char) stack.pop() + "but not cclosed");

        }
    }
}


// if (last = 0 ) {
// System.out.println("");//

















