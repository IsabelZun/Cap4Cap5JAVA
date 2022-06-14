import java.util.Scanner;

public class E_4_20

{

    public static void main( String args[])
    {

        System.out.print("\nEste programa convierte de decimal a ");
        System.out.print("hexadecimal. \n");
        Scanner entrada = new Scanner(System.in);
        E_4_19 miObjeto = new E_4_19();
        int numero;

        System.out.print("\nPor favor introduzca un numero ");
        System.out.println("y se imprimira su equivalente en Hexadecimal: ");
        numero = entrada.nextInt();

        miObjeto.Hexadecimal( numero );

    }
}