public class Main {
}
public class Main {
    public static void main(String[] args) {
        //int contador  = 10;

        // while (contador > 0) {
        // System.out.println("El contador vale ahora " + contador);
        //contador = contador - 1;


        // }
        //for (int contador =1; contador <=10; contador = contador +1){
        //    System.out.println(contador);
        //}

        // var temperatura = 14;
        // while (temperatura != 15){
        //   System.out.println(temperatura);
        // break;

        //}
        //  System.out.println("Se salio del bucle While");

        // for( ; temperatura != 15; ){
        //  System.out.println(temperatura);
        //  break;
        // }
        //System.out.println("Se salio del bucle For");

        // int valores[] = new int[5];

        //for ( int i = 0; i< valores.length; i++){

        // System.out.println(valores[i]);

        //  }
        //System.out.println("Se salio del bucle For y ArrAy");

        var estacion ="Primavera";

        switch(estacion) {

            case "Verano":
                System.out.println("Es verano");
                break;

            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Es " + estacion);

        }

        var hoy_es ="Sabado";

        switch(hoy_es) {

            case "Lunes":
            case "Martes":
            case "Miercoles":
            case "Jueves":
            case "Viernes":

                System.out.println("Hoy es laborable  " + hoy_es);
                break;

            case "Sabado":
            case "Domingo":

                System.out.println("Hoy es " + hoy_es);
                System.out.println("Hoy no es laborable");

        }
    }}