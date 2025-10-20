public class App {
    public static void main(String[] args) throws Exception {
        int ika = 20;


// if (ika >= 0 && ika < 18) { 
//     System.out.println("Olet alaikäinen");
// }
// else {
//     System.out.println("Olet aikuinen");
// }

// if (ika > 0 && ika < 18) {
//     System.out.println("Olet alaikäinen");
//     }
//     else if (ika >= 65){
//         System.out.println("Olet eläkeläinen");
//     }
//     else
//     {
//         System.out.println("Olet aikuinen");
//     }

//Tehtävä 1: Laajenna ohjelmaa siten, että ohjelma osaa kertoa 16-17-vuotiaille, että he voivat ajaa kevaria.
//Tehtävä 2: Laajenna ohjelmaa niin, että se kertoo 18-vuotiaalle, että hän on juuri tullut täysi-ikäiseksi ja saa ajaa autoa.
//Tehtävä 3: Laajenna tehtävää niin, että aikuisille ilmoitetaan tasavuosikymmenistä onnentoivotus.
//Tehtävä 4: jos ikä on 100, tulosta 3-rivinen onnentoivotus.
//Tehtävä 5: Tarkenna eläkeasioita siten, että yli 58-vuotiaille kerro, että he voivat mennä varhaiseläkkeelle.
//Tehtävä 6: Toivota 65-vuotiaille hyviä eläkepäiviä.
//Tehtävä 7: 40–50 -vuotiaille toivota parasta keski-ikää.

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
