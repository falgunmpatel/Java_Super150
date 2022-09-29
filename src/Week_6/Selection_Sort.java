package Week_6;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {2,5,7,1,4,3};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int mini = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr [mini];
            arr[mini] = temp;

        }
    }
}
