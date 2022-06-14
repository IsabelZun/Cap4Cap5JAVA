public class EJERCICIO_5_13

    {

    public void factorial()
    {
        for ( int i = 1; i <= 5; i++ )
        {
            
            int factor = 1;
            int numero = i;

            while ( 0 < numero )
            {
                factor *= numero--;
            }

            System.out.printf("\nEl factorial de %d es: %d\n", i, factor );
        }
    }
  }
