public class Simulacion implements Productividad, modoTelefono, modoRadio, modoReproduccion{
    
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
}