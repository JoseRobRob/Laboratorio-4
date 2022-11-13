public interface modoRadio{
    public boolean estadoRadio(Boolean EstadoRadio);
    public int cambiarVolumen(int volumen);
    public String cambiarFrecuencia(String Frecuencia);
    public String cambiarEmisoras(int emisoras);
    public void guardarEmisoras();
    public void cargarEmisoras();

}