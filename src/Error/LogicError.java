////Logical Errors (Bug in Logic)

//// Example 1: Wrong formula
//public class Test6 {
//    public static void main(String[] args) {
//        int a = 10, b = 20;
//        int avg = (a + b) / 2; // ✅ Correct
//        int wrongAvg = (a + b) / 3; // ❌ Logical error
//        System.out.println("Wrong Average = " + wrongAvg);
//    }
//}
//
//// Example 2: Infinite loop
//public class Test7 {
//    public static void main(String[] args) {
//        int i = 1;
//        while (i != 10) { // ❌ Condition never becomes false
//            System.out.println(i);
//        }
//    }
//}
