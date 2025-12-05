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
        String[] seats = {"mina", "luciana", "Erika", "hebesa"};
        for (int i = 0; i < seats.length; i++){
            System.out.println("Seat number " +  i + " is " + "taken by " + seats[i]);
        }

        //
    }
}
