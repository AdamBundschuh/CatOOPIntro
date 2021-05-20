public class Cat{
    private String name;
    private String furColor;
    private int age;
    private int lives;

    public Cat(String name, String furColor, int age, int lives){
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.lives = lives;
    }



    public void greeting()
    {
        System.out.println("I'm " + name + "! I have " + furColor +
                " fur. I'm " + age + "years old, and I have " + lives + " lives left!");
    }
}