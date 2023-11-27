package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    // Test cases for calculateSum method (Method 1)
    @Test
    public void testCalculateSum() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(8, obj.calculateSum(3, 5));
        assertEquals(-2, obj.calculateSum(-3, 1));

        // Test cases with assertNotEquals
        assertNotEquals(10, obj.calculateSum(3, 5));
        assertNotEquals(-3, obj.calculateSum(-3, 1));
    }

    // Test cases for calculateDifference method (Method 2)
    @Test
    public void testCalculateDifference() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(2, obj.calculateDifference(5, 3));
        assertEquals(2, obj.calculateDifference(-3, -5));

        // Test cases with assertNotEquals
        assertNotEquals(7, obj.calculateDifference(5, 1));
        assertNotEquals(3, obj.calculateDifference(1, 5));
    }

    // Test cases for calculateFactorial method (Method 3)
    @Test
    public void testCalculateFactorial() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(1, obj.calculateFactorial(0));
        assertEquals(120, obj.calculateFactorial(5));

        // Test cases with assertNotEquals
        assertNotEquals(10, obj.calculateFactorial(5));
        assertNotEquals(1, obj.calculateFactorial(3));
    }

    // Test cases for calculateMax method (Method 5)
    @Test
    public void testCalculateMax() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(5, obj.calculateMax(5, 3));
        assertEquals(5, obj.calculateMax(3, 5));

        // Test cases with assertNotEquals
        assertNotEquals(3, obj.calculateMax(3, 8));
        assertNotEquals(-3, obj.calculateMax(-3, -1));
    }

    // Test cases for calculateMin method (Method 6)
    @Test
    public void testCalculateMin() {
        // Test cases with assertEquals
        Main obj = new Main();
        assertEquals(3, obj.calculateMin(5, 3));
        assertEquals(-3, obj.calculateMin(-3, 1));

        // Test cases with assertNotEquals
        assertNotEquals(10, obj.calculateMin(3, 5));
        assertNotEquals(-1, obj.calculateMin(-3, -1));
    }

    // Test cases for calculatePermutation method (Method 7)
    @Test
    public void testCalculatePermutation() {
        // Test cases with assertEquals
        Main obj = new Main();
        assertEquals(60, obj.calculatePermutation(5, 3));
        assertEquals(1, obj.calculatePermutation(5, 0));

        // Test cases with assertNotEquals
        assertNotEquals(10, obj.calculatePermutation(5, 3));
        assertNotEquals(0, obj.calculatePermutation(5, 1));
    }

    // Test cases for calculateCombination method (Method 8)
    @Test
    public void testCalculateCombination() {
        // Test cases with assertEquals
        Main obj = new Main();
        assertEquals(10, obj.calculateCombination(5, 2));
        assertEquals(1, obj.calculateCombination(5, 0));

        // Test cases with assertNotEquals
        assertNotEquals(5, obj.calculateCombination(5, 2));
        assertNotEquals(0, obj.calculateCombination(5, 1));
    }

    // Test cases for calculateLogBase2 method (Method 9)
    @Test
    public void testCalculateLogBase2() {
        // Test cases with assertEquals
        Main obj = new Main();
        assertEquals(3, obj.calculateLogBase2(8));
        assertEquals(0, obj.calculateLogBase2(1));

        // Test cases with assertNotEquals
        assertNotEquals(2, obj.calculateLogBase2(8));
        assertNotEquals(10, obj.calculateLogBase2(2));
    }

    // Test cases for calculateLogBase10 method (Method 10)
    @Test
    public void testCalculateLogBase10() {
        // Test cases with assertEquals
        Main obj = new Main();
        assertEquals(2, obj.calculateLogBase10(100));
        assertEquals(0, obj.calculateLogBase10(1));

        // Test cases with assertNotEquals
        assertNotEquals(1, obj.calculateLogBase10(100));
        assertNotEquals(2, obj.calculateLogBase10(10));
    }

    // Test cases for calculateLogAtoTheBaseB method (Method 11)
    @Test
    public void testCalculateLogAtoTheBaseB() {
        // Test cases with assertEquals
        Main obj = new Main();
        assertEquals(2, obj.calculateLogAtoTheBaseB(16, 4));
        assertEquals(0, obj.calculateLogAtoTheBaseB(1, 5));

        // Test cases with assertNotEquals
        assertNotEquals(3, obj.calculateLogAtoTheBaseB(16, 4));
        assertNotEquals(1, obj.calculateLogAtoTheBaseB(1, 10));
    }

    // Test cases for calculateNthFibonacci method (Method 12)
    @Test
    public void testCalculateNthFibonacci() {
        // Test cases with assertEquals
        Main obj = new Main();
        assertEquals(5, obj.calculateNthFibonacci(5));
        assertEquals(1, obj.calculateNthFibonacci(1));

        // Test cases with assertNotEquals
        assertNotEquals(8, obj.calculateNthFibonacci(5));
        assertNotEquals(3, obj.calculateNthFibonacci(3));
    }

    // Test cases for calculateNearestPowerOf2Smaller method (Method 13)
    @Test
    public void testCalculateNearestPowerOf2Smaller() {
        // Test cases with assertEquals
        Main obj = new Main();
        assertEquals(2, obj.calculateNearestPowerOf2Smaller(5));
        assertEquals(3, obj.calculateNearestPowerOf2Smaller(10));

        // Test cases with assertNotEquals
        assertNotEquals(5, obj.calculateNearestPowerOf2Smaller(5));
        assertNotEquals(16, obj.calculateNearestPowerOf2Smaller(10));
    }

    // Test cases for calculateNearestPowerOf2Greater method
    @Test
    public void testCalculateNearestPowerOf2Greater() {
        // Test cases with assertEquals
        Main obj = new Main();
        assertEquals(3, obj.calculateNearestPowerOf2Greater(5));
        assertEquals(4, obj.calculateNearestPowerOf2Greater(10));


        assertNotEquals(4, obj.calculateNearestPowerOf2Greater(5));
        assertNotEquals(32, obj.calculateNearestPowerOf2Greater(10));
    }

    // Test cases for calculateSmallestPowerOf2 method (Method 15)
    @Test
    public void testCalculateSmallestPowerOf2() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(0, obj.calculateSmallestPowerOf2(5));
        assertEquals(0, obj.calculateSmallestPowerOf2(17));

        // Test cases with assertNotEquals
        assertNotEquals(4, obj.calculateSmallestPowerOf2(5));
        assertNotEquals(8, obj.calculateSmallestPowerOf2(10));
    }

    @Test
    public void testCalculateLargestPowerOf2() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(3, obj.calculateLargestPowerOf2(8));
        assertEquals(4, obj.calculateLargestPowerOf2(16));

        // Test cases with assertNotEquals
        assertNotEquals(2, obj.calculateLargestPowerOf2(8));
        assertNotEquals(8, obj.calculateLargestPowerOf2(16));
    }

    // Test cases for calculateNthpowerOf2 method (Method 17)
    @Test
    public void testCalculateNthpowerOf2() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(8, obj.calculateNthpowerOf2(3));
        assertEquals(16, obj.calculateNthpowerOf2(4));

        // Test cases with assertNotEquals
        assertNotEquals(4, obj.calculateNthpowerOf2(3));
        assertNotEquals(16, obj.calculateNthpowerOf2(5));
    }

    // Test cases for calculateApowerB method (Method 18)
    @Test
    public void testCalculateApowerB() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(8, obj.calculateApowerB(2, 3));
        assertEquals(16, obj.calculateApowerB(2, 4));

        // Test cases with assertNotEquals
        assertNotEquals(4, obj.calculateApowerB(2, 3));
        assertNotEquals(64, obj.calculateApowerB(2, 5));
    }

    // Test cases for calculateBinExpo method (Method 19)
    @Test
    public void testCalculateBinExpo() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(8, obj.calculateBinExpo(2, 3));
        assertEquals(16, obj.calculateBinExpo(2, 4));

        // Test cases with assertNotEquals
        assertNotEquals(4, obj.calculateBinExpo(2, 3));
        assertNotEquals(64, obj.calculateBinExpo(2, 5));
    }

    // Test cases for calculateGCD method (Method 20)
    @Test
    public void testCalculateGCD() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(3, obj.calculateGCD(9, 6));
        assertEquals(5, obj.calculateGCD(25, 10));

        // Test cases with assertNotEquals
        assertNotEquals(2, obj.calculateGCD(9, 6));
        assertNotEquals(8, obj.calculateGCD(25, 10));
    }

    @Test
    public void testCalculateProduct() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(15, obj.calculateProduct(3, 5));
        assertEquals(0, obj.calculateProduct(0, 5));

        // Test cases with assertNotEquals
        assertNotEquals(12, obj.calculateProduct(3, 5));
        assertNotEquals(9, obj.calculateProduct(2, 3));
    }

    // Test cases for calculateDivision method (Method 22)
    @Test
    public void testCalculateDivision() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(2, obj.calculateDivision(6, 3));
        assertEquals(0, obj.calculateDivision(0, 5));

        // Test cases with assertNotEquals
        assertNotEquals(3, obj.calculateDivision(6, 3));
        assertNotEquals(2, obj.calculateDivision(2, 3));
    }

    // Test cases for calculateModulo method (Method 23)
    @Test
    public void testCalculateModulo() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(1, obj.calculateModulo(5, 2));
        assertEquals(0, obj.calculateModulo(10, 5));

        // Test cases with assertNotEquals
        assertNotEquals(0, obj.calculateModulo(5, 2));
        assertNotEquals(2, obj.calculateModulo(10, 5));
    }

    // Test cases for calculateFloor method (Method 24)
    @Test
    public void testCalculateFloor() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(2, obj.calculateFloor(6, 3));
        assertEquals(0, obj.calculateFloor(2, 3));

        // Test cases with assertNotEquals
        assertNotEquals(3, obj.calculateFloor(6, 3));
        assertNotEquals(1, obj.calculateFloor(2, 3));
    }

    // Test cases for calculateCeil method (Method 25)
    @Test
    public void testCalculateCeil() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(2, obj.calculateCeil(6, 3));
        assertEquals(1, obj.calculateCeil(2, 3));

        // Test cases with assertNotEquals
        assertNotEquals(3, obj.calculateCeil(6, 3));
        assertNotEquals(0, obj.calculateCeil(2, 3));
    }

    // Test cases for calculateBMI method (Method 26)
    @Test
    public void testCalculateBMI() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(25, obj.calculateBMI(100, 2));  // Assuming weight is in kg and height is in meters
        assertEquals(25, obj.calculateBMI(25, 1));

        // Test cases with assertNotEquals
        assertNotEquals(22, obj.calculateBMI(60, 9));
        assertNotEquals(18, obj.calculateBMI(75, 9));
    }

    // Test cases for merge and sort methods (Methods 27 and 28)
    @Test
    public void testMergeAndSort() {
        Main obj = new Main();
        // Test cases with assertEquals
        int[] arr1 = {3, 1, 4, 1, 5, 9, 2, 6};
        int[] expectedMergeSort = {1, 1, 2, 3, 4, 5, 6, 9};
        int[] expectedHeapSort = {1, 1, 2, 3, 4, 5, 6, 9};

        int[] arr2 = {12, 11, 13, 5, 6, 7};
        int[] expectedMergeSort2 = {5, 6, 7, 11, 12, 13};
        int[] expectedHeapSort2 = {5, 6, 7, 11, 12, 13};

        assertArrayEquals(expectedMergeSort, obj.mergeSort(arr1.clone()));
        assertArrayEquals(expectedHeapSort, obj.heapSort(arr1.clone()));
        assertArrayEquals(expectedMergeSort2, obj.mergeSort(arr2.clone()));
        assertArrayEquals(expectedHeapSort2, obj.heapSort(arr2.clone()));

        // Test cases with assertNotEquals
        int[] arr3 = {3, 1, 4, 1, 5, 9, 2, 6};
        int[] expectedMergeSort3 = {1, 2, 3, 4, 5, 6, 7, 8};  // intentionally incorrect
        int[] expectedHeapSort3 = {1, 2, 3, 4, 5, 6, 7, 8};   // intentionally incorrect

        int[] arr4 = {12, 11, 13, 5, 6, 7};
        int[] expectedMergeSort4 = {5, 6, 7, 11, 12, 13, 14};  // intentionally incorrect
        int[] expectedHeapSort4 = {5, 6, 7, 11, 12, 13, 14};   // intentionally incorrect

        assertNotEquals(expectedMergeSort3, obj.mergeSort(arr3.clone()));
        assertNotEquals(expectedHeapSort3, obj.heapSort(arr3.clone()));
        assertNotEquals(expectedMergeSort4, obj.mergeSort(arr4.clone()));
        assertNotEquals(expectedHeapSort4, obj.heapSort(arr4.clone()));
    }

    // Test cases for calculateGetIndex method (Method 29)
    @Test
    public void testCalculateGetIndex() {
        Main obj = new Main();
        // Test cases with assertEquals
        int[] arr = {1, 4, 7, 2, 9, 3};

        assertEquals(1, obj.calculateGetIndex(arr, 4));
        assertEquals(3, obj.calculateGetIndex(arr, 2));

        // Test cases with assertNotEquals
        assertNotEquals(4, obj.calculateGetIndex(arr, 2));
        assertNotEquals(2, obj.calculateGetIndex(arr, 9));
    }

    // Test cases for calculateAddMatrices method (Method 30)
    @Test
    public void testCalculateAddMatrices() {
        Main obj = new Main();
        // Test cases with assertEquals
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        int[][] expectedSum = {{6, 8}, {10, 12}};

        assertArrayEquals(expectedSum, obj.calculateAddMatrices(matrix1, matrix2));

        // Test cases with assertNotEquals
        int[][] matrix3 = {{1, 2}, {3, 4}};
        int[][] matrix4 = {{5, 6}, {7, 8}};
        int[][] expectedSum2 = {{7, 8}, {11, 12}};  // intentionally incorrect

        assertNotEquals(expectedSum2, obj.calculateAddMatrices(matrix3, matrix4));
    }

    @Test
    public void testCalculateSubtractMatrices() {
        Main obj = new Main();
        // Test cases with assertEquals
        int[][] matrix1 = {{5, 6}, {7, 8}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        int[][] expectedDifference = {{4, 4}, {4, 4}};

        assertArrayEquals(expectedDifference, obj.calculateSubtractMatrices(matrix1, matrix2));

        // Test cases with assertNotEquals
        int[][] matrix3 = {{5, 6}, {7, 8}};
        int[][] matrix4 = {{1, 2}, {3, 4}};
        int[][] expectedDifference2 = {{3, 4}, {3, 4}};  // intentionally incorrect

        assertNotEquals(expectedDifference2, obj.calculateSubtractMatrices(matrix3, matrix4));
    }

    // Test cases for calculateMultiplyMatrices method (Method 32)
    @Test
    public void testCalculateMultiplyMatrices() {
        Main obj = new Main();
        // Test cases with assertEquals
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        int[][] expectedProduct = {{19, 22}, {43, 50}};

        assertArrayEquals(expectedProduct, obj.calculateMultiplyMatrices(matrix1, matrix2));

        // Test cases with assertNotEquals
        int[][] matrix3 = {{1, 2}, {3, 4}};
        int[][] matrix4 = {{5, 6}, {7, 8}};
        int[][] expectedProduct2 = {{20, 22}, {43, 50}};  // intentionally incorrect

        assertNotEquals(expectedProduct2, obj.calculateMultiplyMatrices(matrix3, matrix4));
    }

    // Test cases for calculateExponentiateMatrix method (Method 33)
    @Test
    public void testCalculateExponentiateMatrix() {
        Main obj = new Main();
        // Test cases with assertEquals
        int[][] matrix = {{2, 1}, {1, 2}};
        int[][] expectedPower = {{5, 4}, {4, 5}};

        assertArrayEquals(expectedPower, obj.calculateExponentiateMatrix(matrix, 2));

        // Test cases with assertNotEquals
        int[][] matrix2 = {{2, 1}, {1, 2}};
        int[][] expectedPower2 = {{4, 4}, {4, 4}};  // intentionally incorrect

        assertNotEquals(expectedPower2, obj.calculateExponentiateMatrix(matrix2, 2));
    }

    // Test cases for decimalToBinary method (Method 34)
    @Test
    public void testDecimalToBinary() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals("101", obj.decimalToBinary(5));
        assertEquals("1100100", obj.decimalToBinary(100));

        // Test cases with assertNotEquals
        assertNotEquals("111", obj.decimalToBinary(5));
        assertNotEquals("101", obj.decimalToBinary(10));
    }

    // Test cases for binaryToDecimal method (Method 35)
    @Test
    public void testBinaryToDecimal() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(5, obj.binaryToDecimal("101"));
        assertEquals(100, obj.binaryToDecimal("1100100"));

        // Test cases with assertNotEquals
        assertNotEquals(10, obj.binaryToDecimal("101"));
        assertNotEquals(5, obj.binaryToDecimal("111"));
    }

    @Test
    public void testDecimalToHexadecimal() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals("5", obj.decimalToHexadecimal(5));
        assertEquals("64", obj.decimalToHexadecimal(100));

        // Test cases with assertNotEquals
        assertNotEquals("A", obj.decimalToHexadecimal(10));
        assertNotEquals("5", obj.decimalToHexadecimal(7));
    }

    // Test cases for hexadecimalToDecimal method (Method 37)
    @Test
    public void testHexadecimalToDecimal() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(5, obj.hexadecimalToDecimal("5"));
        assertEquals(100, obj.hexadecimalToDecimal("64"));

        // Test cases with assertNotEquals
        assertNotEquals(16, obj.hexadecimalToDecimal("A"));
        assertNotEquals(8, obj.hexadecimalToDecimal("7"));
    }

    // Test cases for decimalToOctal method (Method 38)
    @Test
    public void testDecimalToOctal() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals("5", obj.decimalToOctal(5));
        assertEquals("144", obj.decimalToOctal(100));

        // Test cases with assertNotEquals
        assertNotEquals("9", obj.decimalToOctal(7));
        assertNotEquals("A", obj.decimalToOctal(10));
    }

    // Test cases for octalToDecimal method (Method 39)
    @Test
    public void testOctalToDecimal() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(5, obj.octalToDecimal("5"));
        assertEquals(100, obj.octalToDecimal("144"));

        // Test cases with assertNotEquals
        assertNotEquals(8, obj.octalToDecimal("7"));
        assertNotEquals(12, obj.octalToDecimal("12"));
    }

    // Test cases for binaryToOctal method (Method 40)
    @Test
    public void testBinaryToOctal() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals("5", obj.binaryToOctal("101"));
        assertEquals("244", obj.binaryToOctal("10100100"));

        // Test cases with assertNotEquals
        assertNotEquals("15", obj.binaryToOctal("111"));
        assertNotEquals("12", obj.binaryToOctal("1100"));
    }

    // Test cases for octalToBinary method (Method 41)
    @Test
    public void testOctalToBinary() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals("101", obj.octalToBinary("5"));
        assertEquals("1100100", obj.octalToBinary("144"));

        // Test cases with assertNotEquals
        assertNotEquals("011", obj.octalToBinary("7"));
        assertNotEquals("1100", obj.octalToBinary("12"));
    }

    // Test cases for hexadecimalToBinary method (Method 42)
    @Test
    public void testHexadecimalToBinary() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals("101", obj.hexadecimalToBinary("5"));
        assertEquals("110100", obj.hexadecimalToBinary("64"));

        // Test cases with assertNotEquals
        assertNotEquals("011", obj.hexadecimalToBinary("7"));
        assertNotEquals("1110", obj.hexadecimalToBinary("C"));
    }

    // Test cases for calculateSimpleInterest method
    @Test
    public void testCalculateSimpleInterest() {
        Main obj = new Main();
        // Test cases with assertEquals
        assertEquals(20, obj.calculateSimpleInterest(100, 10, 2));
        assertEquals(50, obj.calculateSimpleInterest(250, 10, 2));

        // Test cases with assertNotEquals
        assertNotEquals(30, obj.calculateSimpleInterest(100, 5, 2));
        assertNotEquals(40, obj.calculateSimpleInterest(200, 8, 2));
    }
    @Test
    public void testBinaryToDecimal_PositiveBinaryNumber() {
        Main obj = new Main();
        String binaryNumber = "1101";
        int expectedDecimal = 13;
        int actualDecimal = obj.binaryToDecimal(binaryNumber);
        assertEquals(expectedDecimal, actualDecimal);
    }

    @Test
    public void testBinaryToDecimal_ZeroBinaryNumber() {
        Main obj = new Main();
        String binaryNumber = "0";
        int expectedDecimal = 0;
        int actualDecimal = obj.binaryToDecimal(binaryNumber);
        assertEquals(expectedDecimal, actualDecimal);
    }

    @Test
    public void testBinaryToDecimal_NegativeBinaryNumber() {
        Main obj = new Main();
        String binaryNumber = "-1101"; // Assuming method handles negative binary numbers
        int expectedDecimal = 13;
        int actualDecimal = obj.binaryToDecimal(binaryNumber);
        assertEquals(expectedDecimal, actualDecimal);
    }

    @Test
    public void testBinaryToDecimal_BinaryNumberWithLeadingZeros() {
        Main obj = new Main();
        String binaryNumber = "001101"; // Leading zeros should not affect the result
        int expectedDecimal = 13;
        int actualDecimal = obj.binaryToDecimal(binaryNumber);
        assertEquals(expectedDecimal, actualDecimal);
    }

    @Test
    public void testBinaryToDecimal_LargeBinaryNumber() {
        Main obj = new Main();
        String binaryNumber = "110110110110110";
        long expectedDecimal = 28086;
        int actualDecimal = obj.binaryToDecimal(binaryNumber);
        assertEquals(expectedDecimal, actualDecimal);
    }

    @Test
    public void testBinaryToDecimal_InvalidBinaryNumber() {
        Main obj = new Main();
        String binaryNumber = "10201";
        int expectedDecimal = 17;
        int actualDecimal = obj.binaryToDecimal(binaryNumber);
        assertEquals(expectedDecimal, actualDecimal);
    }
}