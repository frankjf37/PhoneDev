public class UA5000 {

    static void dr(Integer d) {

        //int ranura = 0;
        int ranura = (d / 32);
        //System.out.println("Valor Ranura es; " + ranura);
 
        int fila = d / 16;
        int columna = d % 16;
 
        if(fila < 22)  {
            //System.out.println("Fila menor a 23");
            ranura = (ranura + 6);
            System.out.println("DR - Ranura " + ranura + ". " + (fila + 1) + "," + columna);
        }
        else {
            //System.out.println("Fila mayor igual a 23");
            //System.out.println("Valor Ranura es; " + ranura);
            //System.out.println("Valor de Fila es: " + fila);
            ranura = (ranura + 7);
            System.out.println("DR - Ranura " + ranura + ". " + (fila + 3) + "," + columna);

        }
    }
}
