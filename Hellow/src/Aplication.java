public class Aplication {
    public static void main(String[] args) {
    System.out.println("Hello World");
        int[] mass = {15,27,3,344,17};
        int summ = 0;
        for (int i: mass){
            summ += i;
        }
        System.out.println(summ / mass.length);
    }
}
