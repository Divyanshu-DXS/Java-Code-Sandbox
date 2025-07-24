package CollectionsJava;
// Sample code for 2-D arrays

public class TwoDimArray {
    public static void main(String[] args) {
        // Hardcoded initialization
        int[][] arr = {{10, 20, 30}, {10, 20, 30}, {10, 20, 30}};
        int[][] arr2 = {{30, 20, 10}, {30, 20, 10}, {30, 20, 10}};

        System.out.println(arr[0].length);

        // int[][] newArr = new int[4][7]; -- declaring

        // adding 2 2-D Arrays
        int sum = 0;
        int[][] sumArr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sumArr[i][j] = (arr[i][j] + arr2[i][j]);
                rowSum += (arr[i][j] + arr2[i][j]);
                sum += rowSum;
            }
            System.out.println("sum or Array at index: " + (i + 1) + ": " + rowSum);
        }
        System.out.println("Total Sum of all elements in the array is: " + sum);
        System.out.println("New Array with sum of all elements: -- >");

        // Iterating a 2-D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(sumArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
