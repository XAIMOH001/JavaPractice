enum level{
    LOW,
    MEDIUM,
    HIGH
}
public class Enams {
    public static void main(String[] args){
        level myLev = level.HIGH;

        switch (myLev){
            case LOW:
                System.out.println("Low");
                break;
            case MEDIUM:
                System.out.println("Medium");
                break;
            case HIGH:
                System.out.println("High");
                break;
        }
    }
}
