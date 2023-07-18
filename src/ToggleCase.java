import java.util.Arrays;
import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the String to Toggle !!! ");
        String string=scanner.next();

        String toggle=toogleString(string);

        System.out.println(toggle);
    }

    private static String toogleString(String string) {
        char[] stringArray=string.toCharArray();
        for(int i=0;i<string.length();i++){
            if(stringArray[i]>=65 && stringArray[i]<=90){
                stringArray[i]+=32;
            }
            else if(stringArray[i]>=97 && stringArray[i]<=122){
                stringArray[i]-=32;
            }
        }
        return new String(stringArray);
    }
}