package Zoho;

public class x_pattern {
    public static void main(String[] args) {
        String a = "Zohnofnce"; // 12 chars (even)
        int n = a.length();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j || i + j == n - 1) {
                    System.out.print(a.charAt(j) + " ");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
