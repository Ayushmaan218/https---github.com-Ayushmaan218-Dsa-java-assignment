
public class q7 {

    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 2, 5, 4, 8, 2, 5}; 
        int n = arr.length;

        int max = arr[0], min = arr[0];
        int maxCount = 1, minCount = 1;
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxCount = 1;
                maxIndex = i;
            } else if (arr[i] == max) {
                maxCount++;
            }

            if (arr[i] < min) {
                min = arr[i];
                minCount = 1;
                minIndex = i;
            } else if (arr[i] == min) {
                minCount++;
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Number of occurrences of maximum value: " + maxCount);
        System.out.println("Position of first occurrence of maximum value: " + maxIndex);
        System.out.println("Minimum value: " + min);
        System.out.println("Number of occurrences of minimum value: " + minCount);
        System.out.println("Position of last occurrence of minimum value: " + minIndex);
    }
}
