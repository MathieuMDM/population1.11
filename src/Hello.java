public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int myFirstNumber = 5+9;
        int mySecondNumber = 15+9;
        int myThirdNumber = 15+mySecondNumber*72;
        int myTotalNumber = myFirstNumber+mySecondNumber+myThirdNumber;
        System.out.println(myTotalNumber);
        int myLastOne = 1000 - myTotalNumber;
        System.out.println(myLastOne);
    }
}
