import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion = 0;

        Conversor conversion = new Conversor();
        Scanner entrada3 = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);
        Moneda moneda = conversion.conversionMonedas("USD", "ARS");
        Moneda moneda2 = conversion.conversionMonedas("ARS", "USD");
        Moneda moneda3 = conversion.conversionMonedas("USD", "BRL");
        Moneda moneda4 = conversion.conversionMonedas("BRL", "USD");
        Moneda moneda5 = conversion.conversionMonedas("USD", "COP");
        Moneda moneda6 = conversion.conversionMonedas("COP", "USD");

        System.out.println("""
                **************************************************
                Bienvenido a nuestro conversor de monedas.
                
                Elija una de las siguientes opciones para realizar una conversion.
                
                1) Dolar ==> Peso Argentino
                2) Peso Argentino ==> Dolar
                3) Dolar ==> Real Brasileño
                4) Real Brasileño ==> Dolar
                5) Dolar ==> Peso Colombiano
                6) Peso Colombiano ==> Dolar
                7) Conversion Libre
                8) Salir
                
                **************************************************
                """);

        try {
            do {
                if (menu.hasNextInt()) {
                    opcion = menu.nextInt();

                    switch (opcion) {
                        case 1:

                            System.out.println("Has Seleccionado Convertir Dolares a Pesos Argentinos");
                            System.out.println("ingresa el valor");
                            var valor1 = Double.valueOf(entrada3.nextLine());
                            var prom = moneda.conversion_rate();
                            var resul = prom * valor1;
                            System.out.println("El Valor de 1 Dolar a 1 Peso Argentino es de: " + prom + " " + "ARS");
                            System.out.println("El Valor de " + valor1 + " USD" + " a Pesos Argentinos es de: " + resul + " " + "ARS");
                            GenerarJson generador = new GenerarJson();
                            generador.guardarJson(moneda);
                            break;

                        case 2:

                            System.out.println("Has Seleccionado Convertir Pesos Argentinos a Dolares");
                            System.out.println("ingresa el valor");
                            var valor2 = Double.valueOf(entrada3.nextLine());
                            double prom2 = moneda2.conversion_rate();
                            double resul2 = prom2 * valor2;
                            System.out.println("El Valor de 1 Peso Argentino a 1 Dolar es de: " + prom2 + " " + "USD");
                            System.out.println("El Valor de " + valor2 + " ARS" + " a Dolares es de: " + resul2 + " " + "USD");
                            GenerarJson generador2 = new GenerarJson();
                            generador2.guardarJson(moneda2);
                            break;

                        case 3:

                            System.out.println("Has Seleccionado Convertir Dolares a Reales Brasileños");
                            System.out.println("ingresa el valor");
                            var valor3 = Double.valueOf(entrada3.nextLine());
                            var prom3 = moneda3.conversion_rate();
                            var resul3 = prom3 * valor3;
                            System.out.println("El Valor de 1 Dolar a 1 Real Brasileño es de: " + prom3 + " " + "BRL");
                            System.out.println("El Valor de " + valor3 + " USD" + " a Reales Brasileños es de: " + resul3 + " " + "BRL");
                            GenerarJson generador3 = new GenerarJson();
                            generador3.guardarJson(moneda3);
                            break;

                        case 4:

                            System.out.println("Has Seleccionado Convertir Reales Brasileños a Dolares");
                            System.out.println("ingresa el valor");
                            var valor4 = Double.valueOf(entrada3.nextLine());
                            var prom4 = moneda4.conversion_rate();
                            var resul4 = prom4 * valor4;
                            System.out.println("El Valor de 1 Real Brasileño a 1 Dolar es de: " + prom4 + " " + "USD");
                            System.out.println("El Valor de " + valor4 + " BRL" + " a Dolares es de: " + resul4 + " " + "USD");
                            GenerarJson generador4 = new GenerarJson();
                            generador4.guardarJson(moneda4);
                            break;

                        case 5:

                            System.out.println("Has Seleccionado Convertir Dolares a Pesos Colombianos");
                            System.out.println("ingresa el valor");
                            var valor5 = Double.valueOf(entrada3.nextLine());
                            var prom5 = moneda5.conversion_rate();
                            var resul5 = prom5 * valor5;
                            System.out.println("El Valor de 1 Dolar a 1 Peso Colombiano es de: " + prom5 + " " + "COP");
                            System.out.println("El Valor de " + valor5 + " USD" + " a Pesos Colombiano es de: " + resul5 + " " + "COP");
                            GenerarJson generador5 = new GenerarJson();
                            generador5.guardarJson(moneda5);
                            break;

                        case 6:

                            System.out.println("Has Seleccionado Convertir Pesos Colombianos a Dolares");
                            System.out.println("ingresa el valor");
                            var valor6 = Double.valueOf(entrada3.nextLine());
                            var prom6 = moneda6.conversion_rate();
                            var resul6 = prom6 * valor6;
                            System.out.println("El Valor de 1 Peso Colombiano a 1 Dolar es de: " + prom6 + " " + "USD");
                            System.out.println("El Valor de " + valor6 + " COP" + " a Dolares USD es de: " + resul6 + " " + "USD");
                            GenerarJson generador6 = new GenerarJson();
                            generador6.guardarJson(moneda6);
                            break;

                        case 7:

                            System.out.println("""
                                    Has seleccionado el conversor libre para poder utilizarlo necesitas usar el codigo de la moneda a convertir
                                    seguidamente el monto de la moneda a convertir
                                    ejemplo MXN (Peso Mexicano) a USD (Dolares)
                                    """);

                            Scanner entrada1 = new Scanner(System.in);
                            Scanner entrada2 = new Scanner(System.in);


                            System.out.println("Ingresa el primer codigo de la moneda");
                            var sigla1 = String.valueOf(entrada1.nextLine());
                            System.out.println("Ingresa el segundo codigo de la moneda");
                            var sigla2 = String.valueOf(entrada2.nextLine());

                            System.out.println("ingresa el monto a convertir");

                            var valorPerso = Double.valueOf(entrada3.nextLine());
                            Moneda monedaPerso = conversion.conversionMonedas(sigla1, sigla2);
                            var promPerso = monedaPerso.conversion_rate();
                            var resulPerso = promPerso * valorPerso;

                            System.out.println("El Valor de 1 " + sigla1 + " a 1 " + sigla2 + " es de: " + promPerso);
                            System.out.println("El Valor del monto convertido es de: " + resulPerso + " " + sigla2);
                            GenerarJson generadorPerso = new GenerarJson();
                            generadorPerso.guardarJson(monedaPerso);
                            break;

                        case 8:
                            System.out.println("Saliendo del programa...");
                            break;

                        default:
                            System.out.println("Opción no válida. Intenta de nuevo.");
                    }
                }else {
                    System.out.println("Entrada inválida. Por favor ingresa un número.");
                    menu.next();
                }

            } while (opcion != 8);

        }  catch (RuntimeException | IOException e) {
            System.err.println("Ocurrió un error durante la conversión: " + e.getMessage());
        }

        menu.close();
    }

}


