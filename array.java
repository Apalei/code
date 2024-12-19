
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String []menu={"espresso","latte","cold Drink"};
        menu [3]="virgin mojito";
        menu [4]="cold coffee";
        String []newmenu=menu;
        System.out.println(Arrays.toString(newmenu));
    }
}
