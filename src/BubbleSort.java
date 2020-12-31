public class BubbleSort {
  /**
   * Main method.
   */
  public static void main(String[] args) {
    //Create a object of type BubbleSort
    BubbleSort obj = new BubbleSort();
    // Initialize the array
    int arr[] = {10, 8, 6, 4, 2};

    //obj calls method bubbleSort to perform sorting the array
    obj.bubbleSort(arr);

    //obj calls method bubbleSort to print out elements in sorted order
    obj.printNumsArray(arr);
  }

  /**
   * @param nums contains array of unsorted numbers
   */
  public void bubbleSort(int[] nums) {
    int length = nums.length;
    for (int i = 0; i < length - 1; i++) {
      for (int j = 0; j < length - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }
  }

  /**
   * This method is to print out elements in the sorted array
   *
   * @param array
   */
  public void printNumsArray(int array[]) {
    int arrayLength = array.length;
    for (int i = 0; i < arrayLength; i++) {
      System.out.println("Sorted Array: " + array[i] + " ");
    }
  }

}





