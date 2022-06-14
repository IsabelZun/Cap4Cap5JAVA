/*Este programa recibe, mediante un ciclo controlado por centinela, 
el numero de galones y el numero de kilometros recorridos por cada galon*/

import java.util.Scanner;

public class E_4_17
{
    public static void main(String args[])
    {
        Scanner entrada = new Scanner (System.in);
        double galon=0;
        double kilometros;

        EJERCICIO_4_17 miObjeto = new EJERCICIO_4_17();

        System.out.println("\nIntroduzca el numero de galones: (0 para terminar)\n");
        galon = entrada.nextDouble();

        while ( 0 != galon)
        {

            System.out.println("\nIntroduzca el numero de kilometros: \n");
            kilometros = entrada.nextDouble();

            System.out.printf("\nLos kilometros por galon fueron: %.2f: ", miObjeto.Procesa_Datos(galon, kilometros));
            System.out.println("\nIntroduzca el numero de galones: (0 para terminar) \n");
            galon = entrada.nextDouble();

        }
    }
}