package JavaStringPractice;

public class SlidingWindowArraySum {

    public void sumSlidingWindow(int[] iArray, int sliding) {
        int temp =0;
        for(int i=0; i<=iArray.length-3; i++) {
            for(int j=i; j<i+sliding; j++) {
                temp = temp + iArray[j];
            }
            System.out.println("Sum of sliding window is: " + temp);
            temp = 0;
        }
    }

    public static void main(String[] args) {
        SlidingWindowArraySum sws = new SlidingWindowArraySum();
        int[] iArray = {2,4,5,6,1,8,9,7};
        int sliding =3;
        sws.sumSlidingWindow(iArray, sliding);
    }
}
