public class Cat {
    String name;
    double weight;
    int age;
    String color;
    void meow(){
        System.out.println("Meow!");
    }
    public Cat(String name, double weight, int age, String color){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }
    public void checkSum(int x, int y){
        if (x > y){
            System.out.println("Ok");
        }else{
            System.out.println("Nope");
        }
    }
}
