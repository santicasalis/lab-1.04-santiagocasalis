public class Main {
    public static void main (String[] args){
        int[] numbers={2,5,4,6,8,10,1};
        System.out.println(getDifference(numbers));
        System.out.println(twoSmall(numbers));
        System.out.println(resultExpression(2,2));
    }
    public static int getDifference(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }  if (arr[i] < min) {
                min = arr[i];

            }

        }
        return max - min;
    }

    public static String twoSmall(int[] arr){
        int smallFirst=arr[0];
        int smallSecond=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]< smallFirst ){
                smallSecond = smallFirst ;
                smallFirst = arr[i];

            } else if (arr[i]< smallSecond) {
                smallSecond = arr[i];

            }

        }
        System.out.println("primer mas chico "+ smallFirst );
        System.out.println("segundo mas chico "+ smallSecond );

        return null;
    }

    public static double resultExpression(double x, double y) {
        return Math.pow(x,2) + Math.pow((4*y / 5-x), 4);
    }


}




