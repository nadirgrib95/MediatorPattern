import java.util.Scanner;

public class MediatorPatternDemo {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("What is your name : ");
        String name1 = myObj.nextLine();

        System.out.println("What is your name : ");
        String name2 = myObj.nextLine();

        User user1 = new User(name1);
        User user2 = new User(name2);

        System.out.println("What is your message : ");
        String message1 = myObj.nextLine();

        System.out.println("What is your message : ");
        String message2 = myObj.nextLine();

        user1.sendMessage(message2 + " " + user2.getName() + "!");
        user2.sendMessage(message1 + " " + user1.getName() + "!");
    }
}
