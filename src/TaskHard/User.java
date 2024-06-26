package TaskHard;

public class User implements Cloneable{
    private int age;
    private String name;
    Dog dog;

    public User(int age, String name, Dog dog) {
        this.age = age;
        this.name = name;
        this.dog = dog;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User userCloned = (User) super.clone();
        Dog dogCloned = (Dog) userCloned.getDog().clone();
        userCloned.setDog(dogCloned);
        return userCloned;
    }
}
