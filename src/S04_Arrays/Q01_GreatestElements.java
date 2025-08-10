package S04_Arrays;

public class Q01_GreatestElements {

    public static int greatestElement(int[] arr){
        int greatest = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > greatest) greatest = arr[i];
        }
        return greatest;
    }

    public static int secondGreatestElement(int[] arr){
        int greatest = arr[0];
        int secondGreatest = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > greatest) {
                secondGreatest = greatest;
                greatest = i;
            }
            else if(i > secondGreatest && i < greatest) secondGreatest = i;
        }
        return secondGreatest;
    }

    public static int thirdGreatestElement(int[] arr){
        int greatest = arr[0];
        int secondGreatest = Integer.MIN_VALUE;
        int thirdGreatest = Integer.MIN_VALUE;

        for(int i : arr){
            if(i > greatest) {
                thirdGreatest = secondGreatest;
                secondGreatest = greatest;
                greatest = i;
            } else if (i > secondGreatest && i < greatest) {
                thirdGreatest = secondGreatest;
                secondGreatest = i;
            } else if (i > thirdGreatest && i < secondGreatest) {
                thirdGreatest = i;
            }
        }
        return thirdGreatest;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,4,7,8,9,11,3,6,10,12,13,13};
        System.out.println(greatestElement(arr));
        System.out.println(secondGreatestElement(arr));
        System.out.println(thirdGreatestElement(arr));
    }
}
