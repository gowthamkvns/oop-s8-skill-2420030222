package skill2;

public class WrapperDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = Integer.valueOf(a);
        int b = obj.intValue();
        System.out.println("Primitive: " + a);
        System.out.println("Wrapped: " + obj);
        System.out.println("Unwrapped: " + b);
    }
}
