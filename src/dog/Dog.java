package dog;

public class Dog {
    private String name;
    private String color;
    private boolean hasOwner; //есть ли хозяин
    private String bark; //лай
    String foot;
    
    public Dog(String name, String color, boolean hasOwner, String bark) {
        this.name = name;
        this.color = color;
        this.hasOwner = hasOwner;
        this.bark = bark;
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        hasOwner = false;
        bark = "Гав";
    }

    public void voice() {
        System.out.println(bark);
    }

    public boolean checkName(String s) {
        boolean check = false;
        if (s.equals(name))
            check = true;
        return check;
    }

    public String domestication() {
        if (hasOwner == false) {
            hasOwner = true;
            return bark;
        }
        return "у меня уже есть хозяин";
    }

    // shift+f6
    public String passport() {
        String a = "Имя: " + name;
        String b = "Цвет: " + color;
        String c;
        if (hasOwner = false)
            c = "Бездомный";
        else
            c = "Есть хозяин";
        String s = a + "\r\n" + b + "\r\n" + c;
        return s;
    }

    public String passport(String preString) {
        return preString + "\r\n" + passport();
    }

    public void meetDog(Dog dog) {
        this.voice();
        System.out.println("!" + "Привет," + dog.name + "!");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public String getBark() {
        return bark;
    }
}
