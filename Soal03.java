import java.util.Scanner;

public class soal03 {

    public static String waktu(String jam, int waktu) {
        String Waktu;
        
        if (waktu >= 1 && waktu <= 24) {
            Waktu = "jam";
        } else if (waktu >= 0 && waktu <= 3) {
            Waktu = "menit";
        } else if (waktu >=  && waktu <= )
            waktu = "tambah menit";
         else {
            
    }
        
        return " jam" + "menit";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String jam = scanner.nextLine();   
        String menit = scanner.nextLine();
        int waktu = scanner.nextInt();  
 
        System.out.println(waktu(jam, waktu));
    }
}