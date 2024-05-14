package Arrays;

/**
 * 1. insert  into an Array
 * 2. Traverse an Array
 * 3. Delete Array for both (specific value as well as the whole array)
 * 4. Search for an element in an array
 */
import java.util.Arrays;

public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToInsert) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This index is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array" + e);
        }
    }

    public void traverseArray() {
        System.out.println("Printing all the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void delete(int valueToDelete) {
        boolean valueFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToDelete) {
                arr[i] = Integer.MIN_VALUE;
                valueFound = true;
            }
        }
        if (valueFound) {
            System.out.println("Successfully deleted the value " + valueToDelete);
        } else {
            System.out.println("Value not found in the array");
        }
    }

    public void deleteArray() {
        arr = null;
        System.out.println("Array has been deleted successfully");
    }

    public boolean search(int valueToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToSearch) {
                System.out.println("Value " + valueToSearch + " found at index " + i);
                return true;
            }
        }
        System.out.println("Value " + valueToSearch + " not found in the array");
        return false;
    }

    public static void main(String[] args) {
        // create the object of the class
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(8);
        singleDimensionArray.insert(0, 1);
        singleDimensionArray.insert(1, 2);
        singleDimensionArray.insert(2, 3);
        singleDimensionArray.insert(3, 4);
        singleDimensionArray.insert(4, 5);
        singleDimensionArray.insert(5, 3);
        singleDimensionArray.insert(6, 4);
        singleDimensionArray.insert(7, 5);

        singleDimensionArray.traverseArray();

        singleDimensionArray.delete(3);
        singleDimensionArray.traverseArray();

        singleDimensionArray.search(2);
        singleDimensionArray.search(6);

        singleDimensionArray.deleteArray();
        // Uncomment the line below to see NullPointerException as the array is deleted
        // singleDimensionArray.traverseArray();
    }
}
