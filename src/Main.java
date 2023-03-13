public class Main {
    public static void main(String[] args) {
        int[] array  = {1};
        System.out.println(a2(array));



    }
    /*
    //An array with an odd number of elements is said to be centered if all elements (except the middle one)
    //are strictly greater than the value of the middle element. Note that only arrays with an odd number of
    //elements have a middle element. Write a function that accepts an integer array and returns 1 if
    //it is a centered array, otherwise it returns 0.
   public static int centered(int[] array){
        if (array == null || array.length %2 == 0)
            return  0;
        int mid = (array.length)/2;
        int midvalue = array[mid];
        for(int i = 0 ; i <array.length ; i++ ){
            if (i != mid && midvalue >= array[i])
            return 0;
        }
        return 1;
    }


   static int a1(int[] a)
   {
       if (a == null || a.length % 2 == 0)
           return 0;
       int midIndex = a.length / 2 ;
       int middleItem = a[midIndex];
       for (int i=0; i<a.length; i++)
       {
           if (i != midIndex && middleItem >= a[i])
               return 0;
       }
       return 1;
   }
*/
   
//Write a function that takes an array of integers as an argument and returns a value based on the
//sums of the even and odd numbers in the array. Let X = the sum of the odd numbers in the array and
//let Y = the sum of the even numbers. The function should return X – Y
   static int a2(int[] a)
   {
       int sumEven = 0;
       int sumOdd = 0;

       for (int i=0; i<a.length; i++)
       {
           if (a[i]%2 == 0) {
               sumEven += a[i];
           }
          if ((a[i]%2 != 0)){
           sumOdd += a[i];
       }
       }

       return sumOdd - sumEven;
   }


}