public class ClaseCarroC {
    private int volumen;
    private int emisoras;
    private String NombreCancion;
    private String GeneroCancion;
    private Float duracion;
    private String Frecuencia;
    private boolean EstadoRadio;


    public ClaseCarroC() {
        int volumen= 0;
        int emisoras=0;
        String NombreCancion="";
        Float duracion=0.0f;
        String Frecuencia="";
        boolean EstadoRadio= false;

    }

    public ClaseCarroC(int volumen, int emisoras, String NombreCancion, String GeneroCancion, Float duracion, String Frecuencia, boolean EstadoRadio) {
        this.volumen = volumen;
        this.emisoras = emisoras;
        this.NombreCancion = NombreCancion;
        this.GeneroCancion = GeneroCancion;
        this.duracion = duracion;
        this.Frecuencia = Frecuencia;
        this.EstadoRadio= EstadoRadio;
    }
    

    public boolean isEstadoRadio() {
        return this.EstadoRadio;
    }

    public boolean getEstadoRadio() {
        return this.EstadoRadio;
    }

    public void setEstadoRadio(boolean EstadoRadio) {
        this.EstadoRadio = EstadoRadio;
    }

    public int getVolumen() {
        return this.volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getEmisoras() {
        return this.emisoras;
    }

    public void setEmisoras(int emisoras) {
        this.emisoras = emisoras;
    }

    public String getNombreCancion() {
        return this.NombreCancion;
    }

    public void setNombreCancion(String NombreCancion) {
        this.NombreCancion = NombreCancion;
    }

    public String getGeneroCancion() {
        return this.GeneroCancion;
    }

    public void setGeneroCancion(String GeneroCancion) {
        this.GeneroCancion = GeneroCancion;
    }

    public Float getDuracion() {
        return this.duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    public String getFrecuencia() {
        return this.Frecuencia;
    }

    public void setFrecuencia(String Frecuencia) {
        this.Frecuencia = Frecuencia;
    }
    
}