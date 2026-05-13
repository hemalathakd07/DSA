public class SecondLargestElement1 {
    static int secondLargestElement(int[] array) {
        int largest = array[0];
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                second_largest = largest;
                largest = array[i];
            }
            else if (array[i] < largest && array[i] > second_largest) {
                second_largest = array[i];
            }
        }
        return second_largest;
    }
    public static void main(String[] args) {
        int[] array = {23, 54, 76, 22, 6, 2};
        System.out.println(secondLargestElement(array));
    }
}