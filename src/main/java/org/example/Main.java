package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public  int calculateDifference(int a, int b) {

        int difference = 0;
        if (a > b) {
            difference = a - b;
        } else {
            difference = b - a;
        }

        return difference;
    }

    public  int calculateFactorial(int n) {

        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            int present = i;
            int previous = factorial;
            int new_factorial = present * previous;
            factorial = new_factorial;
        }

        return factorial;
    }

    public  int calculateSubtraction(int a, int b) {

        int answer = 0;
        answer = a - b;
        return answer;
    }

    public  int calculateMax(int a, int b) {

        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public  int calculateMin(int a, int b) {

        int min = 0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }

    // The following function calculates permutation given N and R
    public  int calculatePermutation(int n, int r) {

        int permutation = 0;
        int numerator = 1, denominator = 1;

        for (int i = 1; i <= n; i++) {

            numerator = numerator * i;
        }

        for (int i = 1; i <= n - r; i++) {

            denominator = denominator * i;
        }

        permutation = numerator / denominator;

        return permutation;
    }

    // The following function calculates combination given N and R
    public  int calculateCombination(int n, int r) {

        int combintion = 0;
        int numerator = 1, denominator = 1;

        for (int i = 1; i <= n; i++) {

            numerator = i * numerator;
        }

        for (int i = 1; i <= r; i++) {

            denominator = denominator * i;
        }

        for (int i = 1; i <= n - r; i++) {

            denominator = denominator * i;
        }

        combintion = numerator / denominator;

        return combintion;
    }

    public  int calculateLogBase2(int n) {

        int result = (int) (Math.log(n) / Math.log(2));
        return result;
    }

    public  int calculateLogBase10(int n) {

        int result = (int) (Math.log10(n));
        return result;
    }

    public  int calculateLogAtoTheBaseB(int a, int b) {

        int result = (int) (Math.log(a) / Math.log(b));
        return result;
    }

    public  int calculateNthFibonacci(int n) {
        if (n <= 2) return 1;

        int first = 1, second = 1;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }

        result = second;
        return result;
    }

    public  int calculateNearestPowerOf2Smaller(int n) {

        int result = 0, value = 1;

        while (value < n) {
            result++;
            value = value * 2;
        }

        int have = 1;
        for (int i = 1; i <= result; i++) {
            have = have * 2;
        }

        if (have > n) {
            result--;
        }

        return result;
    }

    public  int calculateNearestPowerOf2Greater(int n) {

        int result = 0, value = 1;

        while (value < n) {
            result++;
            value = value * 2;
        }

        int have = 1;
        for (int i = 1; i <= result; i++) {
            have = have * 2;
        }

        if (have == n) {
            result++;
        }

        return result;
    }

    public  int calculateSmallestPowerOf2(int n) {

        int result = 0;

        for (int i = 0; ; i++) {
            int mask = 1 << i;

            if ((n & mask) == mask) {
                result = i;
                break;
            }
        }

        return result;
    }

    public  int calculateLargestPowerOf2(int n) {

        int result = 0;

        for (int i = 0; ; i++) {
            int mask = 1 << i;

            if ((n & mask) == mask) {
                result = i;
            }

            if (mask > n) {
                break;
            }
        }

        return result;
    }

    public  int calculateNthpowerOf2(int n) {

        int result = 1;

        for (int i = 1; i <= n; i++) {

            result = result * 2;
        }

        return result;
    }

    public  int calculateApowerB(int a, int b) {

        int result = 1;

        for (int i = 1; i <= b; i++) {

            result = result * a;
        }

        return result;
    }

    public  int calculateBinExpo(int a, int b) {

        int result = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                result = result * a;
            }
            b >>= 1;
            a = a * a;
        }

        return result;
    }

    public  int calculateGCD(int a, int b) {

        int gcd = 1;
        if (a == 0) {

            gcd = b;
        } else if (b == 0) {

            gcd = a;
        } else if (a % b == 0) {

            gcd = b;
        } else if (b % a == 0) {

            gcd = a;
        } else {
            if (a > b) {

                gcd = calculateGCD(a - b, b);
            } else {

                gcd = calculateGCD(b - a, a);
            }
        }
        return gcd;
    }

    public  int calculateProduct(int a, int b) {

        int product = 0;

        for (int i = 0; i < b; i++) {

            product = product + a;
        }

        return product;
    }

    public  int calculateDivision(int a, int b) {

        int result = a;
        result = a / b;

        return result;

    }

    public  int calculateModulo(int a, int m) {

        int result = 0;
        while (a < 0) {
            a = a + m;
        }

        while (a >= m) {
            a = a - m;
        }

        result = a;
        return result;
    }

    public  int calculateFloor(int a, int b) {

        int result = 0;
        result = a / b;
        return result;
    }

    public  int calculateCeil(int a, int b) {

        int result = 0;
        result = a / b;
        if (a > result * b) {

            result++;
        }

        return result;
    }

    public  int calculateBMI(int weight, int height) {
        // bmi = (weight in kg) /(height * height in m)
        int result = weight;
        int denominator = 0;
        for (int i = 0; i < height; i++) {

            denominator = denominator + height;
        }

        result = result / denominator;
        return result;
    }

    /* Merge Sort Start */

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public  void merge(int arr[], int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public  int[] mergeSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    public  void sort(int[] arr, int l, int r) {
        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    /********************************* Merge sort end ***************************************/

    /* Heap Sort Start */
    public  int[] heapSort(int arr[]) {
        int N = arr.length;

        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        // One by one extract an element from heap
        for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
        return arr;
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    public  void heapify(int arr[], int N, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }

    /******************************** Heap Sort End *********************************/

    public  int calculateGetIndex(int arr[], int num) {

        if (arr == null) {
            return -1;
        }

        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                result = i;
            }
        }

        return result;
    }

    public  int[][] calculateAddMatrices(int[][] A, int[][] B) {

        // Check if matrices A and B have the same dimensions
        if (A.length != B.length || A[0].length != B[0].length) {

            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        // Create a new matrix C to store the sum of A and B
        int[][] C = new int[A.length][A[0].length];

        // Add corresponding elements of matrices A and B and store the sum in matrix C
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A[0].length; j++) {

                C[i][j] = A[i][j] + B[i][j];
            }
        }

        return C;
    }

    public  int[][] calculateSubtractMatrices(int[][] A, int[][] B) {

        // Check if matrices A and B have the same dimensions
        if (A.length != B.length || A[0].length != B[0].length) {

            throw new IllegalArgumentException("Matrices must have the same dimensions");
        }

        // Create a new matrix C to store the difference of A and B
        int[][] C = new int[A.length][A[0].length];

        // Subtract corresponding elements of matrices A and B and store the difference in matrix C

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A[0].length; j++) {

                C[i][j] = A[i][j] - B[i][j];
            }
        }

        return C;
    }


    public  int[][] calculateMultiplyMatrices(int[][] A, int[][] B) {

        // Check if the number of columns in matrix A is equal to the number of rows in matrix B
        if (A[0].length != B.length) {
            throw new IllegalArgumentException("The number of columns in matrix A must equal the number of rows in matrix B");
        }

        // Create a new matrix C to store the product of A and B
        int[][] C = new int[A.length][B[0].length];

        // Multiply corresponding elements of matrices A and B and store the product in matrix C
        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < B[0].length; j++) {

                for (int k = 0; k < A[0].length; k++) {

                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }

    public  int[][] calculateExponentiateMatrix(int[][] A, int n) {

        // Check if the matrix is square
        if (A.length != A[0].length) {

            throw new IllegalArgumentException("Matrix must be square");
        }

        // Check if the power is non-negative
        if (n < 0) {

            throw new IllegalArgumentException("Power must be non-negative");
        }

        // Handle base cases
        if (n == 0) {

            int[][] identityMatrix = new int[A.length][A.length];

            for (int i = 0; i < A.length; i++) {
                identityMatrix[i][i] = 1;
            }

            return identityMatrix;
        } else if (n == 1) {
            return A;
        }

        // Divide and conquer approach
        int[][] halfMatrix = calculateExponentiateMatrix(A, n / 2);
        int[][] result = calculateMultiplyMatrices(halfMatrix, halfMatrix);

        // Handle odd powers
        if (n % 2 == 1) {

            result = calculateMultiplyMatrices(result, A);
        }

        return result;
    }

    public  String decimalToBinary(int decimalNumber) {

        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder binaryString = new StringBuilder();

        while (decimalNumber > 0) {

            binaryString.append(decimalNumber % 2);
            decimalNumber /= 2;
        }

        return binaryString.reverse().toString();
    }

    public  int binaryToDecimal(String binaryString) {

        int decimalNumber = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--) {

            if (binaryString.charAt(i) == '1') {

                decimalNumber += Math.pow(2, binaryString.length() - 1 - i);
            }
        }

        return decimalNumber;
    }

    public  String decimalToHexadecimal(int decimalNumber) {

        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder hexadecimalString = new StringBuilder();

        while (decimalNumber > 0) {

            int remainder = decimalNumber % 16;
            hexadecimalString.append(Character.forDigit(remainder, 16));
            decimalNumber /= 16;
        }

        return hexadecimalString.reverse().toString();
    }

    public  int hexadecimalToDecimal(String hexadecimalString) {

        int decimalNumber = 0;

        for (int i = hexadecimalString.length() - 1; i >= 0; i--) {

            char hexDigit = hexadecimalString.charAt(i);
            int digitValue = Character.digit(hexDigit, 16);
            decimalNumber += digitValue * Math.pow(16, hexadecimalString.length() - 1 - i);
        }

        return decimalNumber;
    }

    public  String decimalToOctal(int decimalNumber) {

        if (decimalNumber == 0) {
            return "0";
        }

        StringBuilder octalString = new StringBuilder();

        while (decimalNumber > 0) {

            int remainder = decimalNumber % 8;
            octalString.append(Character.forDigit(remainder, 8));
            decimalNumber /= 8;
        }

        return octalString.reverse().toString();
    }

    public  int octalToDecimal(String octalString) {

        int decimalNumber = 0;

        for (int i = octalString.length() - 1; i >= 0; i--) {

            char octalDigit = octalString.charAt(i);
            int digitValue = Character.digit(octalDigit, 8);
            decimalNumber += digitValue * Math.pow(8, octalString.length() - 1 - i);
        }

        return decimalNumber;
    }

    public  String binaryToOctal(String binaryString) {

        if (!isValidBinary(binaryString)) {
            System.out.println("Invalid binary input. Please enter a valid binary number.");
            throw new RuntimeException("Invalid Binary string entered.");
        }
        while (binaryString.length() % 3 != 0) {
            binaryString = "0" + binaryString;
        }

        StringBuilder octalStringBuilder = new StringBuilder();

        // Convert binary groups of 3 digits to octal
        for (int i = 0; i < binaryString.length(); i += 3) {
            String binaryGroup = binaryString.substring(i, i + 3);
            int decimalValue = Integer.parseInt(binaryGroup, 2);
            octalStringBuilder.append(Integer.toOctalString(decimalValue));
        }

        return octalStringBuilder.toString();
    }
    private static boolean isValidBinary(String binaryString) {
        return binaryString.matches("[01]+");
    }

    public  String octalToBinary(String octalString) {

        StringBuilder binaryString = new StringBuilder();

        for (char octalDigit : octalString.toCharArray()) {

            String subBinaryString = decimalToBinary(Character.digit(octalDigit, 8));
            binaryString.append(subBinaryString);
        }

        return binaryString.toString();
    }

    public  String hexadecimalToBinary(String hexadecimalString) {

        StringBuilder binaryString = new StringBuilder();

        for (char hexDigit : hexadecimalString.toCharArray()) {

            String subBinaryString = decimalToBinary(Character.digit(hexDigit, 16));
            binaryString.append(subBinaryString);
        }

        return binaryString.toString();
    }

    public  String binaryToHexadecimal(String binaryString) {

        if (binaryString.length() % 4 != 0) {
            binaryString = "0" + binaryString;
        }

        StringBuilder hexadecimalString = new StringBuilder();
        for (int i = 0; i < binaryString.length(); i += 4) {

            String subBinaryString = binaryString.substring(i, i + 4);
            hexadecimalString.append(Character.forDigit(binaryToDecimal(subBinaryString), 16));
        }

        return hexadecimalString.toString();
    }

    public  String octalToHexadecimal(String octalString) {

        return decimalToHexadecimal(octalToDecimal(octalString));
    }

    public  String hexadecimalToOctal(String hexadecimalString) {

        return decimalToOctal(hexadecimalToDecimal(hexadecimalString));
    }

    public  int calculateSimpleInterest(int principal, int rate, int time) {

        int numerator = principal * rate * time;

        if (numerator % 100 != 0) {
            throw new IllegalArgumentException("Invalid Arguments, not divisible by 100");
        }

        int denominator = 100;
        int result = numerator / denominator;
        return result;
    }


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean exit = false;
//
//        while (!exit) {
//            System.out.println("Choose an operation:");
//            System.out.println("0. Exit");
//            System.out.println("1. Calculate Sum");
//            System.out.println("2. Calculate Difference");
//            System.out.println("3. Calculate Factorial");
//            System.out.println("5. Calculate Max");
//            System.out.println("5. Calculate Min");
//            System.out.println("6. Calculate Permutation");
//            System.out.println("7. Calculate Combination");
//            System.out.println("8. Calculate Log base 2");
//            System.out.println("9. Calculate Log base 10");
//            System.out.println("10. Calculate Log a to the base b");
//            System.out.println("11. Calculate Nth Fibonacci");
//            System.out.println("12. Calculate Nearest Power of 2 Smaller");
//            System.out.println("13. Calculate Nearest Power of 2 Greater");
//            System.out.println("14. Calculate Smallest Power of 2");
//            System.out.println("15. Calculate Largest Power of 2");
//            System.out.println("16. Calculate Nth Power of 2");
//            System.out.println("17. Calculate A to the power B");
//            System.out.println("18. Calculate Binary Exponentiation");
//            System.out.println("19. Calculate GCD");
//            System.out.println("20. Calculate Product");
//            System.out.println("21. Calculate Division");
//            System.out.println("22. Calculate Modulo");
//            System.out.println("23. Calculate Floor");
//            System.out.println("24. Calculate Ceil");
//            System.out.println("25. Calculate BMI");
//            System.out.println("26. Merge Sort (Not user input)");
//            System.out.println("27. Heap Sort (Not user input)");
//            System.out.println("28. Get Index in an array");
//            System.out.println("29. Convert Decimal to Binary");
//            System.out.println("30. Convert Binary to Decimal");
//            System.out.println("31. Convert Decimal to Hexadecimal");
//            System.out.println("32. Convert Hexadecimal to Decimal");
//            System.out.println("33. Convert Decimal to Octal");
//            System.out.println("34. Convert Octal to Decimal");
//            System.out.println("35. Convert Binary to Octal");
//            System.out.println("36. Convert Octal to Binary");
//            System.out.println("37. Convert Hexadecimal to Binary");
//            System.out.println("38. Convert Binary to Hexadecimal");
//            System.out.println("39. Calculate Simple Intrest");
//            System.out.println("40. Matrices Sum");
//            System.out.println("41. Matrices Difference");
//            System.out.println("42. Matrices Product");
//            System.out.println("43. Matrices Exponentiation");
//
//            Main obj = new Main();
//            int choice = scanner.nextInt();
//            switch (choice) {
//                case 0:
//                    exit = true;
//                    System.out.println("Exiting Calculator. Goodbye!");
//                    break;
//                case 1:
//                    System.out.println("Enter two numbers:");
//                    int num1 = scanner.nextInt();
//                    int num2 = scanner.nextInt();
//                    int sum = obj.calculateSum(num1, num2);
//                    System.out.println("Sum: " + sum);
//                    break;
//                case 2:
//                    System.out.println("Enter two numbers:");
//                    int a = scanner.nextInt();
//                    int b = scanner.nextInt();
//                    int difference = obj.calculateDifference(a, b);
//                    System.out.println("Difference: " + difference);
//                    break;
//                case 3:
//                    System.out.println("Enter a number:");
//                    int n = scanner.nextInt();
//                    int factorial = obj.calculateFactorial(n);
//                    System.out.println("Factorial: " + factorial);
//                    break;
//                case 4:
//                    System.out.println("Enter two numbers:");
//                    int maxNum1 = scanner.nextInt();
//                    int maxNum2 = scanner.nextInt();
//                    int maxResult = obj.calculateMax(maxNum1, maxNum2);
//                    System.out.println("Max: " + maxResult);
//                    break;
//                case 5:
//                    System.out.println("Enter two numbers:");
//                    int minNum1 = scanner.nextInt();
//                    int minNum2 = scanner.nextInt();
//                    int minResult = obj.calculateMin(minNum1, minNum2);
//                    System.out.println("Min: " + minResult);
//                    break;
//                case 6:
//                    System.out.println("Enter values for N and R:");
//                    int nPerm = scanner.nextInt();
//                    int rPerm = scanner.nextInt();
//                    int permutation = obj.calculatePermutation(nPerm, rPerm);
//                    System.out.println("Permutation: " + permutation);
//                    break;
//                case 7:
//                    System.out.println("Enter values for N and R:");
//                    int nComb = scanner.nextInt();
//                    int rComb = scanner.nextInt();
//                    int combination = obj.calculateCombination(nComb, rComb);
//                    System.out.println("Combination: " + combination);
//                    break;
//                case 8:
//                    System.out.println("Enter a number:");
//                    int logBase2Num = scanner.nextInt();
//                    int logBase2Result = obj.calculateLogBase2(logBase2Num);
//                    System.out.println("Log base 2: " + logBase2Result);
//                    break;
//                case 9:
//                    System.out.println("Enter a number:");
//                    int logBase10Num = scanner.nextInt();
//                    int logBase10Result = obj.calculateLogBase10(logBase10Num);
//                    System.out.println("Log base 10: " + logBase10Result);
//                    break;
//                case 10:
//                    System.out.println("Enter values for A and B:");
//                    int logABaseB_A = scanner.nextInt();
//                    int logABaseB_B = scanner.nextInt();
//                    int logABaseBResult = obj.calculateLogAtoTheBaseB(logABaseB_A, logABaseB_B);
//                    System.out.println("Log A to the base B: " + logABaseBResult);
//                    break;
//                case 11:
//                    System.out.println("Enter a number for Nth Fibonacci:");
//                    int nthFibonacci = scanner.nextInt();
//                    int nthFibonacciResult = obj.calculateNthFibonacci(nthFibonacci);
//                    System.out.println("Nth Fibonacci: " + nthFibonacciResult);
//                    break;
//                case 12:
//                    System.out.println("Enter a number:");
//                    int powerOf2Smaller = scanner.nextInt();
//                    int nearestPowerOf2SmallerResult = obj.calculateNearestPowerOf2Smaller(powerOf2Smaller);
//                    System.out.println("Nearest Power of 2 Smaller: " + nearestPowerOf2SmallerResult);
//                    break;
//                case 13:
//                    System.out.println("Enter a number:");
//                    int powerOf2Greater = scanner.nextInt();
//                    int nearestPowerOf2GreaterResult = obj.calculateNearestPowerOf2Greater(powerOf2Greater);
//                    System.out.println("Nearest Power of 2 Greater: " + nearestPowerOf2GreaterResult);
//                    break;
//                case 14:
//                    System.out.println("Enter a number:");
//                    int smallestPowerOf2 = scanner.nextInt();
//                    int smallestPowerOf2Result = obj.calculateSmallestPowerOf2(smallestPowerOf2);
//                    System.out.println("Smallest Power of 2: " + smallestPowerOf2Result);
//                    break;
//                case 15:
//                    System.out.println("Enter a number:");
//                    int largestPowerOf2 = scanner.nextInt();
//                    int largestPowerOf2Result = obj.calculateLargestPowerOf2(largestPowerOf2);
//                    System.out.println("Largest Power of 2: " + largestPowerOf2Result);
//                    break;
//                case 16:
//                    System.out.println("Enter a number for Nth Power of 2:");
//                    int nthPowerOf2 = scanner.nextInt();
//                    int nthPowerOf2Result = obj.calculateNthpowerOf2(nthPowerOf2);
//                    System.out.println("Nth Power of 2: " + nthPowerOf2Result);
//                    break;
//                case 17:
//                    System.out.println("Enter values for A and B:");
//                    int aPowerB_A = scanner.nextInt();
//                    int aPowerB_B = scanner.nextInt();
//                    int aPowerBResult = obj.calculateApowerB(aPowerB_A, aPowerB_B);
//                    System.out.println("A to the power B: " + aPowerBResult);
//                    break;
//                case 18:
//                    System.out.println("Enter values for A and B:");
//                    int binExpo_A = scanner.nextInt();
//                    int binExpo_B = scanner.nextInt();
//                    int binExpoResult = obj.calculateBinExpo(binExpo_A, binExpo_B);
//                    System.out.println("Binary Exponentiation: " + binExpoResult);
//                    break;
//                case 19:
//                    System.out.println("Enter values for A and B:");
//                    int gcdA = scanner.nextInt();
//                    int gcdB = scanner.nextInt();
//                    int gcdResult = obj.calculateGCD(gcdA, gcdB);
//                    System.out.println("GCD: " + gcdResult);
//                    break;
//                case 20:
//                    System.out.println("Enter values for A and B:");
//                    int productA = scanner.nextInt();
//                    int productB = scanner.nextInt();
//                    int productResult = obj.calculateProduct(productA, productB);
//                    System.out.println("Product: " + productResult);
//                    break;
//                case 21:
//                    System.out.println("Enter values for A and B:");
//                    int divisionA = scanner.nextInt();
//                    int divisionB = scanner.nextInt();
//                    int divisionResult = obj.calculateDivision(divisionA, divisionB);
//                    System.out.println("Division: " + divisionResult);
//                    break;
//                case 22:
//                    System.out.println("Enter values for A and B:");
//                    int moduloA = scanner.nextInt();
//                    int moduloB = scanner.nextInt();
//                    int moduloResult = obj.calculateModulo(moduloA, moduloB);
//                    System.out.println("Modulo: " + moduloResult);
//                    break;
//                case 23:
//                    System.out.println("Enter values for A and B:");
//                    int floorA = scanner.nextInt();
//                    int floorB = scanner.nextInt();
//                    int floorResult = obj.calculateFloor(floorA, floorB);
//                    System.out.println("Floor: " + floorResult);
//                    break;
//                case 24:
//                    System.out.println("Enter values for A and B:");
//                    int ceilA = scanner.nextInt();
//                    int ceilB = scanner.nextInt();
//                    int ceilResult = obj.calculateCeil(ceilA, ceilB);
//                    System.out.println("Ceil: " + ceilResult);
//                    break;
//                case 25:
//                    System.out.println("Enter values for Weight (in kg) and Height (in meters):");
//                    int weightBMI = scanner.nextInt();
//                    int heightBMI = scanner.nextInt();
//                    double bmiResult = obj.calculateBMI(weightBMI, heightBMI);
//                    System.out.println("BMI: " + bmiResult);
//                    break;
//                case 26:
//                    System.out.println("Enter values of array separated by space");
//                    String inputLine = scanner.nextLine();
//                    int[] numbers = Arrays.stream(inputLine.split("\\s+"))
//                            .mapToInt(Integer::parseInt)
//                            .toArray();
//                    System.out.println("Original array: " + Arrays.toString(numbers));
//                    obj.mergeSort(numbers);
//                    System.out.println("Sorted array: " + Arrays.toString(numbers));
//                    break;
//                case 27:
//                    // Heap Sort (Not user input)
//                    System.out.println("Enter values of array separated by space");
//                    inputLine = scanner.nextLine();
//                    numbers = Arrays.stream(inputLine.split("\\s+"))
//                            .mapToInt(Integer::parseInt)
//                            .toArray();
//                    System.out.println("Original array: " + Arrays.toString(numbers));
//                    obj.heapSort(numbers);
//                    System.out.println("Sorted array: " + Arrays.toString(numbers));
//                    break;
//                case 28:
//                    System.out.println("Enter values for the array and the element to find:");
//                    int[] arrayToSearch = {1, 2, 3, 4, 5};
//                    int elementToFind = scanner.nextInt();
//                    int indexResult = obj.calculateGetIndex(arrayToSearch, elementToFind);
//                    System.out.println("Index of " + elementToFind + ": " + indexResult);
//                    break;
//                case 29:
//                    System.out.println("Enter a decimal number:");
//                    int decimalToBinaryNum = scanner.nextInt();
//                    String binaryResult = obj.decimalToBinary(decimalToBinaryNum);
//                    System.out.println("Binary: " + binaryResult);
//                    break;
//                case 30:
//                    System.out.println("Enter a binary number:");
//                    String binaryToDecimalStr = scanner.next();
//                    int binaryToDecimalResult = obj.binaryToDecimal(binaryToDecimalStr);
//                    System.out.println("Decimal: " + binaryToDecimalResult);
//                    break;
//                case 31:
//                    System.out.println("Enter a decimal number:");
//                    int decimalToHexNum = scanner.nextInt();
//                    String hexResult = obj.decimalToHexadecimal(decimalToHexNum);
//                    System.out.println("Hexadecimal: " + hexResult);
//                    break;
//                case 32:
//                    System.out.println("Enter a hexadecimal number:");
//                    String hexToDecimalStr = scanner.next();
//                    int hexToDecimalResult = obj.hexadecimalToDecimal(hexToDecimalStr);
//                    System.out.println("Decimal: " + hexToDecimalResult);
//                    break;
//                case 33:
//                    System.out.println("Enter a decimal number:");
//                    int decimalToOctalNum = scanner.nextInt();
//                    String octalResult = obj.decimalToOctal(decimalToOctalNum);
//                    System.out.println("Octal: " + octalResult);
//                    break;
//                case 34:
//                    System.out.println("Enter an octal number:");
//                    String octalToDecimalStr = scanner.next();
//                    int octalToDecimalResult = obj.octalToDecimal(octalToDecimalStr);
//                    System.out.println("Decimal: " + octalToDecimalResult);
//                    break;
//                case 35:
//                    System.out.println("Enter a binary number:");
//                    String binaryToOctalStr = scanner.next();
//                    String binaryToOctalResult = obj.binaryToOctal(binaryToOctalStr);
//                    System.out.println("Octal: " + binaryToOctalResult);
//                    break;
//                case 36:
//                    System.out.println("Enter an octal number:");
//                    String octalToBinaryStr = scanner.next();
//                    String octalToBinaryResult = obj.octalToBinary(octalToBinaryStr);
//                    System.out.println("Binary: " + octalToBinaryResult);
//                    break;
//                case 37:
//                    System.out.println("Enter a hexadecimal number:");
//                    String hexToBinaryStr = scanner.next();
//                    String hexToBinaryResult = obj.hexadecimalToBinary(hexToBinaryStr);
//                    System.out.println("Binary: " + hexToBinaryResult);
//                    break;
//                case 38:
//                    System.out.println("Enter a binary number:");
//                    String binaryToHexStr = scanner.next();
//                    String binaryToHexResult = obj.binaryToHexadecimal(binaryToHexStr);
//                    System.out.println("Hexadecimal: " + binaryToHexResult);
//                    break;
//                case 39:
//                    System.out.println("Enter principal amount, rate, and time:");
//                    int principalSI = scanner.nextInt();
//                    int rateSI = scanner.nextInt();
//                    int timeSI = scanner.nextInt();
//                    int simpleInterestResult = obj.calculateSimpleInterest(principalSI, rateSI, timeSI);
//                    System.out.println("Simple Interest: " + simpleInterestResult);
//                    break;
//                case 40:
//                    System.out.println("Enter dimensions of matrix 1");
//                    int[] temp = Arrays.stream(scanner.nextLine().split("\\s+"))
//                            .mapToInt(Integer::parseInt)
//                            .toArray();
//                    int[][] arr1 = new int[temp[0]][temp[1]];
//                    System.out.println("Enter dimensions of matrix 2");
//                    temp = Arrays.stream(scanner.nextLine().split("\\s+"))
//                            .mapToInt(Integer::parseInt)
//                            .toArray();
//                    int[][] arr2 = new int[temp[0]][temp[1]];
//                    int[][] sumMatrix = obj.calculateAddMatrices(arr1, arr2);
//                    System.out.println("Sum of Matrices A and B:");
//                    for (int[] i : sumMatrix) {
//                        for (int j: i) {
//                            System.out.print(j + " ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                case 41:
//                    System.out.println("Enter dimensions of matrix 1");
//                    temp = Arrays.stream(scanner.nextLine().split("\\s+"))
//                            .mapToInt(Integer::parseInt)
//                            .toArray();
//                    arr1 = new int[temp[0]][temp[1]];
//                    System.out.println("Enter dimensions of matrix 2");
//                    temp = Arrays.stream(scanner.nextLine().split("\\s+"))
//                            .mapToInt(Integer::parseInt)
//                            .toArray();
//                    arr2 = new int[temp[0]][temp[1]];
//                    int[][] differenceMatrix = obj.calculateSubtractMatrices(arr1, arr2);
//                    System.out.println("Difference of Matrices A and B:");
//                    for (int[] i : differenceMatrix) {
//                        for (int j: i) {
//                            System.out.print(j + " ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                case 42:
//                    System.out.println("Enter dimensions of matrix A");
//                    temp = Arrays.stream(scanner.nextLine().split("\\s+"))
//                            .mapToInt(Integer::parseInt)
//                            .toArray();
//                    arr1 = new int[temp[0]][temp[1]];
//                    System.out.println("Enter dimensions of matrix B");
//                    temp = Arrays.stream(scanner.nextLine().split("\\s+"))
//                            .mapToInt(Integer::parseInt)
//                            .toArray();
//                    arr2 = new int[temp[0]][temp[1]];
//                    int[][] multiplicationMateix = obj.calculateMultiplyMatrices(arr1, arr2);
//                    System.out.println("Multiplication of Matrices A and B:");
//                    for (int[] i : multiplicationMateix) {
//                        for (int j: i) {
//                            System.out.print(j + " ");
//                        }
//                        System.out.println();
//                    }
//                    break;
//                case 43:
//                    System.out.println("Enter dimensions of matrix A");
//                    temp = Arrays.stream(scanner.nextLine().split("\\s+"))
//                            .mapToInt(Integer::parseInt)
//                            .toArray();
//                    arr1 = new int[temp[0]][temp[1]];
//                    System.out.println("Enter the power to raise Matrix A to:");
//                    int power44 = scanner.nextInt();
//                    int[][] powerMatrix = obj.calculateExponentiateMatrix(arr1, power44);
//                    System.out.println("Matrix A raised to the power of " + power44 + ":");
//                    for (int[] i : powerMatrix) {
//                        for (int j: i) {
//                            System.out.print(j + " ");
//                        }
//                        System.out.println();

//                    }
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please choose a valid option.");
//            }
//        }
//    }
}
