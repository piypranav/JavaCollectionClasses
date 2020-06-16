package JavaStringPractice;

public class SumOfRightElementArray {

    public void sumOfRightElement(int[] iArray) {
//        {2,6,7,9,5,4}
        int temp=0;
        System.out.println("Array size is: " + iArray.length);
        int[] iArray1 = new int[iArray.length];
        for(int i=0; i<=iArray.length-1; i++) {
            for (int j = i+1; j <= iArray.length-1; j++) {
                temp = temp + iArray[j];
            }
            if(i== iArray.length-1) {
                iArray1[i] = 0;
            } else {
                iArray1[i] = temp;
                temp =0;
            }
        }
        for(int i=0; i<=iArray1.length-1; i++) {
            System.out.println("Array value at " + i + " is: " + iArray1[i]);
        }
    }

    public static void main(String[] args) {
        int[] iArray = {2,6,7,9,5,4};
        SumOfRightElementArray sea = new SumOfRightElementArray();
        sea.sumOfRightElement(iArray);
    }
}
