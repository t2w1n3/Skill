
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static int[] numbers = new int[30];
    public static void main(String[] args) {
        numbers[0] = 1;
        numbers[1] = 1;
        for ( int i = 2;  i < numbers.length; i++){
           numbers[i] = numbers[i-2] + numbers[i - 1];
        }
        System.out.println(Arrays.toString(numbers));
        Cat Zevs = new Cat("Zevs",7.0,8,"red");
        Zevs.meow();
        Tank tank = new Tank(2,3);
        tank.goBackward(2);
        Zevs.checkSum(-200,200);
    }
}