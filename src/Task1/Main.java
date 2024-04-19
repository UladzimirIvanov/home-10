package Task1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(20, "Vova");
        User user2 = new User(20, "Vova");
        User user3 = new User(20, "Vova");
        User user4 = new User(20, "Vova");

        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user3));
        System.out.println(user3.equals(user4));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        System.out.println(user4.hashCode());

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
    }
}
