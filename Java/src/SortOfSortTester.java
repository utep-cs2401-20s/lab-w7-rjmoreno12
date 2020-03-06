import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortOfSortTester {
    @Test
    public void test1() { //basic test to see if the code worked
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int[] expectedOutput = {4, 3, 1, 2, 5, 6};

        SortOfSort testOne = new SortOfSort();
        testOne.sortOfSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(expectedOutput[i], inputArray[i]);
        }


    }

    @Test
    public void test2() { //tests if there is only one value in the array
        int[] inputArray = {0};
        int[] expectedOutput = {0};

        SortOfSort testOne = new SortOfSort();
        testOne.sortOfSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(expectedOutput[i], inputArray[i]);
        }
    }

    @Test
    public void test3() { //test if all values in the array are the same
        int[] inputArray = {13,13,13,13,13,13,13,13,13,13};
        int[] expectedOutput = {13,13,13,13,13,13,13,13,13,13};

        SortOfSort testOne = new SortOfSort();
        testOne.sortOfSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(expectedOutput[i], inputArray[i]);
        }
    }

    @Test
    public void test4() { //tests if negative numbers work
        int[] inputArray = {-24, -34, -34, -44, -54, -64, 134, 454, -4};
        int[] expectedOutput = {-24, -34, -44, -54, -64, -44, -34, 134, 45 };

        SortOfSort testOne = new SortOfSort();
        testOne.sortOfSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(expectedOutput[i], inputArray[i]);
        }

    }

    @Test
    public void test5() { //test to see if the method works with an odd length
        int[] inputArray = {6, 100, 54, 400, 74, 884,1000};
        int[] expectedOutput = {400, 100, 6, 54, 74, 884, 1000 };

        SortOfSort testOne = new SortOfSort();
        testOne.sortOfSort(inputArray);

        for (int i = 0; i < inputArray.length; i++) {
            assertEquals(expectedOutput[i], inputArray[i]);
        }

    }


}