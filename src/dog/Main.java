package dog;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Барбос", "белый");
        dog1.voice();
        System.out.println(dog1.domestication());
        System.out.println(dog1.checkName("Тузик"));
        System.out.println(dog1.passport());
        Dog dog2 = new Dog("Рыжик", "рыжий", true, "Ав");
        dog1.meetDog(dog2);
        System.out.println(dog1.passport());
        System.out.println(dog1.passport("Паспорт:"));
        dog2.setColor("Бурый");
        System.out.println(dog2.passport());
    }
}
