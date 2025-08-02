package skill2;

public class TypeConversionDemo {
    public static void main(String[] args) {
        int i = 100;
        long l = i;
        float f = l;
        double d = f;
        int j = (int)d;
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Back to Int: " + j);
    }
}
