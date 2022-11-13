import java.util.Scanner;

public class SimulacionIniciada{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //scaner para guardar las respuestas
        Simulacion START = new Simulacion();
        String menu= "Opcion 1: Cambiar el volumen del radio \nOpcion2: Cambiar Emisora \nOpcion3: Guardar emisora \nOpcion4: Cargar emisora \nOpcion5: Mostrar contactos \nOpcion6: llamar contacto de prueba \nOpcion7: Seleccionar genero de playlist \nOpcion8: Cambiar cancion \nOpcion9: Pronostico del clima\n Opcion 10 SALIR";
        
        int i=0;
        System.out.println("Bienvenidos a la simulacion de las funcionalidades del radio de un carro tipo C! ");
       
        while(i<1){
            System.out.println("\nPara comenzar lo exorto a encender el radio: \nOpcion 1: Si\nOpcion 2: No");
            int opcion = teclado.nextInt();
            teclado.nextLine();
           
            if(opcion==1){
                START.estadoRadio(false);
                System.out.println("Radio encendido");
                i=2;
                
            }
            else{
                System.out.println("Selecciono No prender ");
                i=0;
            }
        }  

        System.out.println("\nBien, Una vez prendido el radio aqui estan las opciones que puedes testear del radio! diviertete... \n");
        int q= 0;
        while(q<1){
            System.out.println(menu);
            int opcion = teclado.nextInt();
            teclado.nextLine();
            switch(opcion){
                case 1:{
                    System.out.println("Que volumen deseas colocarle al radio?");
                    int vol = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Nuevo Volumen modificado, ahora este se encuentra en: "+START.cambiarVolumen(vol));
                    
                    break;
                }
                case 2:{
                    System.out.println("A que emisora deseas cambiar?");
                    int emi = teclado.nextInt();
                    teclado.nextLine();
                    System.out.print("Nueva emisora seleccionada, ahora este se encuentra escuchando la : "+START.cambiarEmisoras(emi));
                    START.cambiarEmisoras(emi);
                    break;
                }
                case 3:{
                    System.out.print("GUARDAR EMISORA SE ENCUENTRA EN FASE DE DESARROLLO, VUELVA PRONTO");
                    break;
                }
                case 4:{
                    System.out.print("CARGAR EMISORA SE ENCUENTRA EN FASE DE DESARROLLO, VUELVA PRONTO");
                    break;
                }
                case 5:{
                    System.out.print("Usted selecciono Mostrar contactos: ");
                    System.out.print(START.mostrarContactos());
                    break;
                }
                case 6:{
                    System.out.print("Usted selecciono llamar a contacto de prueba:");
                    System.out.print(START.llamarContactos());
                    break;
                }
                case 7:{
                    System.out.print("Que genero desea escuchar?");
                    String can= teclado.nextLine();
                    System.out.print(START.seleccionarPlaylist(can));
                    break;
                }
                case 8:{
                    System.out.print("A que cancion desea cambiar?");
                    String con= teclado.nextLine();
                    System.out.print(START.cambiarCancion(con));
                    break;
                }
                case 9:{
                    System.out.print("PRONOSTICO DEL CLIMA: \n");
                    System.out.print(START.pronosticoClima());
                    break;
                }
                case 10:{
                    q=10;
                }
            }
        } 
        
     
    }
}