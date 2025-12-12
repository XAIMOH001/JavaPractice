import java.util.Arrays;

public class Arrayz {
    public static void main(String[] args) {
        //adding elements within an array
        int[] arr = new int[]{ 444, 31, 333, 244};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);

        //using for loop to display seatNO an plus passenger
        String[] seats = {"mina", "luciana", "Erika", "Liquor"};
        for (int i = 0; i < seats.length; i++){
            System.out.println("Seat number " +  i + " is " + "taken by " + seats[i]);
        }

        //lowest and highest value from a numbers array
        int[] myNums = {23,50, 88, 954, 67, 334, 234};
        int min = myNums[0];
        int max = myNums[0];
        for (int n: myNums){
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


        //java Array methods
        //1.sort()
        Arrays.sort(myNums, 1, 6);
        for (int i : myNums) {
            System.out.println(i);
        }


    }
}
