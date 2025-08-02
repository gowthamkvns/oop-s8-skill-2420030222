package skill1;

public class StudentDashboard {
    public static void main(String[] args) {
        long rollNumber = 2420030222L;
        String name = "Gowtham Karthikeya";
        float marks = 98.5f;
        char gender = 'M';
        boolean isPassed = true;

        System.out.println("Student Summary Slip:");
        System.out.println("----------------------");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Gender: " + gender);
        System.out.println("Pass Status: " + (isPassed ? "Passed" : "Failed"));
    }
}
