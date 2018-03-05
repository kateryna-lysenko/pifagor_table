import java.util.Arrays;

public class seven_numbers {

    public static void main(String[] args) {
        String up02356789 = "._.";
        String up14 = "...";
        String mid0 = "|.|";
        String mid17_d1479 = "..|";
        String mid23_d35 = "._|";
        String mid489_d068 = "|_|";
        String mid56_d2 = "|_.";


        int n = 123456789;

        char[] chars = (n + "").toCharArray();

        int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = chars[i] - '0';
        }


        for (int i = 0; i < chars.length; i++) {
            if (ints[i] != 1 && ints[i] != 4) {
                System.out.print(up02356789);
            } else System.out.print(up14);
        }
        System.out.println();

        for (int i = 0; i < chars.length; i++) {
            if (ints[i] == 0) {
                System.out.print(mid0);
            } else if (ints[i] == 1 || ints[i] == 7) {
                System.out.print(mid17_d1479);
            } else if (ints[i] == 2 || ints[i] == 3) {
                System.out.print(mid23_d35);
            } else if (ints[i] == 5 || ints[i] == 6) {
                System.out.print(mid56_d2);
            } else System.out.print(mid489_d068);
        }
        System.out.println();

        for (int i = 0; i < chars.length; i++){
            if (ints[i]==2){
                System.out.print(mid56_d2);
            }else if (ints[i] == 3 || ints[i] == 5){
                System.out.print(mid23_d35);
            }else if (ints[i] == 0 || ints[i] == 6|| ints [i]==8 ){
                System.out.print(mid489_d068);
            }else System.out.print(mid17_d1479);
        }


    }}








