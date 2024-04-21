package TaskHard;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User(18, "Vovan", new Dog("Pes"));
        User user2 = (User) user1.clone();
        System.out.println(user1);
        user1.setName("Vovanych");
        user1.dog.setName("Pepe");
        user2.dog.setName("Paul");
        System.out.println(user1);
        System.out.println(user2);
    }
}
