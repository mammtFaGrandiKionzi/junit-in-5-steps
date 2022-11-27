public class MyMath {

    int[] numbers = {1, 2, 3};

    // WE WANT TO SUM ALL THE ELEMENTS
    public int sum() {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);

        return sum;
    }

}
