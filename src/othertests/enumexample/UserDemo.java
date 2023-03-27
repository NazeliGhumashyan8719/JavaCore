package othertests.enumexample;


import java.util.Scanner;

public class UserDemo {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        User user = new User();
        user.name = "Ara";
        user.surname = "Aryan";
        Profession[] values = Profession.values();
        System.out.println("Please choose profession from:");
        for (Profession value : values) {
            System.out.println(value);
        }
        String professionStr = scanner.nextLine();
        try {
            user.profession = Profession.valueOf(professionStr);
            System.out.println(user.profession);
            System.out.println("You choose" + user.profession.getClinic() + "clinic");
            System.out.println("Ordinal " + user.profession.ordinal());
            System.out.println("Compare " + user.profession.compareTo(Profession.DENTIST));
            System.out.println("Choose again");
        }catch(IllegalArgumentException e){
            System.out.println("Please choose correct profession");
        }
    }
}

