public class Main {
    public static void main(String[] args){

        int numToExamine = 2;

        String result = (numToExamine % 2 == 0) ? "even" : "odd";

        System.out.println("The number " + numToExamine +" is " + result);

    }
}