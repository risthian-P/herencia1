import conicas2. *;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Elipse elipse1 = new Elipse(3,4);
        circunferencia_grupo2 circu1 = new circunferencia_grupo2(3,23);
        hiperbole hiper1 = new hiperbole(2,4);
        Parabola_Equipo2 parabola = new Parabola_Equipo2(5,4,2,1.4f,2);
        int ingreso = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu principal");
        do{
            System.out.println("Ingrese la acción a realizar");
            System.out.println("1. Hiperbole");
            System.out.println("2. Elipse");
            System.out.println("3. Circunferencia");
            System.out.println("4. Parabola");
            System.out.println("5. Salir");
            ingreso = entrada.nextInt();

            switch (ingreso){
                case 1:
                    System.out.println("Hiperbole: ");
                    hiper1.variables();
                    break;
                case 2:
                    System.out.println("Elipse (Area): " + elipse1.area_elipse());
                    break;
                case 3:
                    System.out.println("Circunferencia (area): " + circu1.area_cir());
                    break;
                case 4:
                    System.out.println("Parabola");
                    System.out.println("Para ello se requiere conocer:");
                    System.out.println("eje x: " + parabola.getEjex() + " y eje y: " + parabola.getEjey() );
                    parabola.Parabola_Equipo2_VerticeX(3,4);
                    parabola.Parabola_Equipo2_VerticeY(4,5,6);
                    parabola.Parabola_Equipo2_ImpVer();
                    break;
                case 5:
                    System.out.println("...");
                default:
                    System.out.println("Ingreso de valor incorrecto");
            }

        }while (ingreso != 5);
        System.out.println("Fin del programa...");
    }
}
