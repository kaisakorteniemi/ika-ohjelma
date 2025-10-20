public class App {
    public static void main(String[] args) throws Exception {
        int ika = 20;

    if (ika > 0 && ika < 18) {
        System.out.println("Olet alaikäinen");
        if (ika >= 15) {
            System.out.println("Saat ajaa mopoa");
        }
        if (ika >= 16 && ika <= 17) {
            System.out.println("Voit ajaa kevaria");
        }}
    else if (ika == 18) {
        System.out.println("Olet tullut juuri täysi-ikäiseksi, saat ajaa autoa!");
    }
    else if (ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60 || ika == 70 || ika == 80 || ika == 90) {
        System.out.println("Onneksi olkoon, täytät pyöreitä!");
        if (ika >= 40 && ika <= 50) {
        System.out.println("Parasta keski-ikää!");
    }
    }
    else if (ika == 100) {
        System.out.println("Onneksi olkoon! \nOlet täyttäny 100 vuotta! \nPaljon onnea!");
    }
    else if (ika >= 58 && ika < 65) {
        System.out.println("Voit jäädä varhaiseläkkeelle!");
    }
    else if (ika >= 65) {
        System.out.println("Olet eläkeläinen");
        if (ika == 65) {
            System.out.println("Hyviä eläkepäiviä!");
        }
    }

    else {
        System.out.println("Olet aikuinen");
    }
    }

}


