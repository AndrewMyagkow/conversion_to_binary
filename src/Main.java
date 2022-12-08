import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder("");
        StringBuilder intermediate = new StringBuilder();

        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                intermediate.append(String.valueOf(aChar));
            } else if (intermediate.length() > 0) {
                stringBuilder.append(Integer.toBinaryString(Integer.parseInt(intermediate.toString())));
                stringBuilder.append(aChar);
                intermediate = new StringBuilder();
            } else {
                stringBuilder.append(aChar);
            }
        }

        if (intermediate.length() > 0) {
            stringBuilder.append(Integer.toBinaryString(Integer.parseInt(intermediate.toString())));
        }
        System.out.println(stringBuilder);

    }
}