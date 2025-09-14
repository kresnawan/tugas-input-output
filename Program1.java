import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Program menghitung Energi potensial, energi kinetik, dan energi mekanik.");

        System.out.print("Masukkan massa benda (kg) : ");
        double massa = input.nextDouble();

        System.out.print("Masukkan kecepatan benda (m/s2) : ");
        double kecepatan = input.nextDouble();

        System.out.print("Masukkan ketinggian benda (m) : ");
        double ketinggian = input.nextDouble();

        double energiPotensial = massa * 10 * ketinggian;
        double energiKinetik = 0.5 * massa * (kecepatan * kecepatan);
        double energiMekanik = energiKinetik + energiPotensial;

        System.out.println("");
        System.out.println("Energi potensial : " + energiPotensial + " Joule");
        System.out.println("Energi kinetik : " + energiKinetik + " Joule");
        System.out.println("Energi mekanik : " + energiMekanik + " Joule");
    }
}


// Ep = m x g x h
// Ep = energi potensial (J)
// m =  massa
// g = gravitasi
// h = ketinggian

// Ek = 1/2 x massa x kecepatan (m/s2)

// Em = Ep + Ek