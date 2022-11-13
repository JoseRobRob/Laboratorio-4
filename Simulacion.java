public class Simulacion implements modoRadio, modoTelefono, modoReproduccion, Productividad{
    
    ClaseCarroC cc= new ClaseCarroC();
    
    public boolean estadoRadio(Boolean EstadoRadio){
        boolean a= cc.getEstadoRadio();
        if(a==true){
            return false;
        }
        else{
            return true;
        }
    }

    public int cambiarVolumen(int volumen){
        cc.setVolumen(volumen);
        return volumen;
    }

    public String cambiarFrecuencia(String Frecuencia){
        cc.setFrecuencia(Frecuencia);
        return "Nueva frecuencia : "+Frecuencia;
    }

    public String cambiarEmisoras(int emisoras){
        cc.setEmisoras(emisoras);
        return "La nueva emisora es: "+emisoras;
    }

    public void guardarEmisoras(){
        //arrayList Lemisoras
        //Lemisoras.add(emisoras)
    }

    public void cargarEmisoras(){
        //setEmisoras(Lemisoras.get[i])
    }

    public String mostrarContactos(){
        String a= "Nombre | Numero \nJose 54936146\nSantiago 55139472\nMamita 55139292\nPa 55139472";
        return "Lista de contactos: \n\n"+a;
    }

    public String llamarContactos(){
        return "Llamando a contacto de prueba vrrrrrm vrrrrm";
    }

    public String finalizarLlamadaEspera(){
        return "LLmadada finalizada...";
    }

    public String seleccionarPlaylist(String GeneroCancion){
        cc.setGeneroCancion(GeneroCancion);
        return "Genero seleccionado: "+GeneroCancion;
    }
    
    public String cambiarCancion(String NombreCancion){
        cc.setNombreCancion(NombreCancion);
        return "Nueva cancion reproduciendo: "+NombreCancion;
    }

    public String pronosticoClima(){
        int min=1;
        int max=4;
        int a = (int)Math.random()*(max-min+1)+min;

        switch(a){
            case 1:{
                return "Hoy sera un buen dia, Día templado";
            }
            case 2:{
                return "Preparate para un dia del asco :), Día lluvioso";
            }
            case 3:{
                return "Eh maybe sale algo bien... esperemos, Día Soleado";
            }
            case 4:{
                return "Ah solo quedate en casa y llora un poco, Día nublado";
            }
        }
        
        return "Tal vez tengas suerte <3 Día calido";
    }
}