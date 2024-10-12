
// Tanner Smith tanmanalan@gmail.com

//for CTE software development 1

//instructor Mr Gross
/**
 * Bubble.type.sort
 */
public class Bubbletypesort {
}
public Bubbletypesort 

    
 Bubbletypesort;

    public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){
    
                int temp;
    
    temp=arrayToSwap[lowerIndex];
    
    arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];
    
    arrayToSwap[lowerIndex+1]=temp;
    
    return arrayToSwap;
    
    }
    
    public static void main(String[] args){
    // this creates the array
    int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};
    
     // Outer loop for number of passes through the array
     for (int i = 0; i < arrayToSort.length - 1; i++) {
        // Inner loop to compare and swap elements
        for (int j = 0; j < arrayToSort.length - 1 - i; j++) {
            if (arrayToSort[j] > arrayToSort[j + 1]) {
                // Swap the two elements if the current one is greater than the next
                swapTwoArrayElements(arrayToSort, j);
            }
        }
    }

    // Print the sorted array
    System.out.println("Sorted Array: ");
    for (int i : arrayToSort) {
        System.out.print(i + " ");
    }
}

    
     
    
     
    
     
    
     
    
     
