public class Arrayz {
    public static void main(String[] args) {
        //adding elements within an array
        int[] arr = new int[]{ 444, 31, 333, 244};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
