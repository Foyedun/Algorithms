package reverse;

public class Reverse {
    public static void main(String[] args) {
String fabulous = stringReversal("shogo");
        System.out.println(fabulous);
    }

    public static String stringReversal(String input) {
        String[] inputArr = input.split(" ");
        String output = " ";
        for (int i = inputArr.length - 1; i >= 0; i--) {
            output += inputArr[i];
        }
        return output;
    }
}

