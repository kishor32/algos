package code;

public class ArrayContainsNumber {

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 5, 6};

        System.out.println(ArrayContainsNumber.binarySearch(array, 0, array.length-1, 2));
    }

    public static int binarySearch(int[] arr, int first, int last, int key) {

        if (first <=last){
            int mid = first + (last - first)/2;
            if (arr[mid] == key){
                return mid;
            }
            if (key < arr[mid]){
                return binarySearch(arr, first, mid-1, key);//search in left subarray
            }else{
                return binarySearch(arr, mid+1, last, key);//search in right subarray
            }
        }
        return -1;
    }
}
