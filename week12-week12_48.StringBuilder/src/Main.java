
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder str = new StringBuilder();
        str.append("{\n ");
        int counter = 0;
        int limite = t.length - 1;
        for (int i = 0; i < t.length; i++) {
            str.append(t[i]);
            if (i != limite) {
                str.append(", ");
            }
                  
            counter++;
            if (counter == 4 || i == limite) {
                counter = 0;
                str.append("\n ");
            }   
        }          
        str.append("}");
        return str.toString();
    }
}
