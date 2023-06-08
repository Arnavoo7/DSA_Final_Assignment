//Given an array, find a product of all array elements.


public class Eight {
    public static long getProduct(int[] arr, int i) {

        if(i >= arr.length){
            return 1;
        }

        long currentElement = arr[i];
        long productsoFar = getProduct(arr,i+1);

        return (currentElement * productsoFar);
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3};
        long product = getProduct(arr,0);

        System.out.println("Product of the array elements: " + product);
    }
}
