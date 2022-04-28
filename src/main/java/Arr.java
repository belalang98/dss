import java.util.Arrays;

public class Arr {

    public static void main(String[] args) {

        int[] array = new int[] {1,3,4,5,8,4,3,7};
        int[] newArray = new int[2];

        newArray[0] = array[0];
        newArray[newArray.length-1] = array[array.length-1];

        System.out.println(Arrays.toString(newArray));
        System.out.println("first " + newArray[0]);
        System.out.println("last " + newArray[newArray.length -1]);

    }
}
