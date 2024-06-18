import java.util.Scanner;

public class Drs {
    public static void main(String[] args) {
        
        // Calculo DR Centrales Huawei

        System.out.println("Favor Ingrese el DR: ");
        Scanner scanner = new Scanner(System.in);
        int dr = Integer.valueOf(scanner.nextLine());

        Dr(dr);

        scanner.close();
    }

}
