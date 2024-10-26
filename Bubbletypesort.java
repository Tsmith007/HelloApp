// Tanner Smith tanmanalan@gmail.com

//for CTE software development 1

//instructor Mr Gross

    class bubbletypeSort{
   
public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){

        int temp;

temp=arrayToSwap[lowerIndex];

arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];

arrayToSwap[lowerIndex+1]=temp;

return arrayToSwap;

}

public static void main(String[] args){

int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};}
    {for (int i = 0; i < arrayToSort.length - 1; i++) { 
        for (int j = 0; j < arrayToSort.length - 1 - i; j++) { 
            if (arrayToSort[j] > arrayToSort[j + 1]) {
                swapTwoArrayElements(arrayToSort, j);
            }
        }
    }

    // Print the sorted array
    System.out.print("Sorted Array: ");
    for (int num : arrayToSort) {
        System.out.print(num + " ");
    }
}
    }
 
   