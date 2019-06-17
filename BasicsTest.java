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
        for (int i = 0; i < test7.length; i++) {
            System.out.println(test7[i]);
        }
        System.out.println("End of Test 7");

        Integer test8 = testing.greaterThanY(new int[] {1,2,3,4,5}, 3);
        System.out.println(test8);
        System.out.println("End of Test 8");

        int[] test9 = testing.sqArray(new int[] {1,5,10,-2});
        for (int i = 0; i < test9.length; i++) {
            System.out.println(test9[i]);
        }
        System.out.println("End of Test 9");

        int [] test10 = testing.elimNegArray(new int[] {1,6,3,-2,-3});
        for (int i = 0; i < test10.length; i++) {
            System.out.println(test10[i]);
        }
        System.out.println("End of Test 10");

        int[] test11 = testing.minMaxAvg(new int[] {1,2,6,12,-1});
        for (int i = 0; i < test11.length; i++) {
            System.out.println(test11[i]);
        }
        System.out.println("End of Test 11");

        int[] test12 = testing.shifting(new int[] {1,5,10,-2});
        for (int i = 0; i < test12.length; i++) {
            System.out.println(test12[i]);
        }
        System.out.println("End of Test 12");

    }
}