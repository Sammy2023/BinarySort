import java.util.Random;

public class Binary_Sort {
    public static void main(String[] args)
    {
        int [] arr = {5,2,3,4,6,};
        System.out.println(binarySearch(arr, 0, arr.length-1, 6));

    }

    //looks for the value and returns the index
    private static int binarySearch(int[] arr, int tail, int head, int value)
    {
        // for even arrays, mid would pick the first element behind the two in them middle
        // this one would choose the the first one out of the second one
        int mid = tail + ((head-1)/2);
        //check only when the 'search area' is in bound
        if(tail<=head )
        {
                // if value is found, YAHOO!
            if(arr[mid] == value )
                return mid;
                // if the value is larger than the checked one
            else if (arr[mid] <value )
                return binarySearch(arr, mid+1, head, value );

            else if(arr[mid] > value)
                return binarySearch( arr, tail, mid-1, value);

        }

        return -1;

    }
}
