package JavaStringPractice;

public class BubbleSortAlgo {

    public static void main(String[] args) {

        int[] iArray = {2,6,9,4,1,9,5,4,7};
        for(int i=0; i<=iArray.length-1; i++) {
            int temp = 0;
            for(int j=i; j<=iArray.length-1; j++) {
                if(iArray[i] > iArray[j]) {
                    temp = iArray[j];
                    iArray[j] = iArray[i];
                    iArray[i] = temp;
                }
            }
        }
        for(int i=0; i<=iArray.length-1; i++) {
            System.out.println("Array is: " + iArray[i]);
        }
    }
}
