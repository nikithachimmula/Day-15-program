
public class BinarySearch {

	  static int binarySearch(String[] arr, String x)
	    {
	        int  n= 0, r = arr.length - 1;
	        while (n <= r) {
	            int m = n + (r - n) / 2;
	 
	            int result = x.compareTo(arr[m]);
	 
	            // Check if x is present at mid
	            if (result == 0)
	                return m;
	 
	            // If x greater, ignore left half
	            if (result > 0)
	                n = m + 1;
	 
	            // If x is smaller, ignore right half
	            else
	                r = m - 1;
	        }
	 
	        return -1;
	    }
	 
	    // Driver method to test above
	    public static void main(String []args)
	    {
	        String[] arr = { "apple", "grape", "mango", "orange"};
	        String x = "orange";
	        int result = binarySearch(arr, x);
	 
	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at "
	                              + "index " + result);
	    }
	}