public class BasicsTest {
    public static void main(String[] args) {
        Basics testing = new Basics();
        testing.printRange(1, 255);
        System.out.println("End of Test 1");

        testing.oddNum(1, 255);
        System.out.println("End of Test 2");

        testing.printNSum(0, 255);
        System.out.println("End of Test 3");

        testing.array(new int[] {1,2,3,4,5});
        System.out.println("End of Test 4");

        Integer test5 = testing.max(new int[] {1,3,0,-3,2});
        System.out.println(test5);
        System.out.println("End of Test 5");

        Integer test6 = testing.avg(new int[] {4,5,3,2,1});
        System.out.println(test6);
        System.out.println("End of Test 6");

        int[] test7 = testing.oddArray(225);
        System.out.println(test7);
        System.out.println("End of Test 7");

        Integer test8 = testing.greaterThanY(new int[] {1,2,3,4,5}, 3);
        System.out.println(test8);
        System.out.println("End of Test 8");

        int[] test9 = testing.minMaxAvg(new int[] {1,2,6,12,-1});
        System.out.println(test9);
        System.out.println("End of Test 9");

        int[] test10 = testing.shifting(new int[] {1,5,10,-2});
        System.out.println(test10);
        System.out.println("End of Test 10");

    }
}