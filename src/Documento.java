public class Documento {
    private int tipoDocumento;
    private String contenido;

    public Documento(int tipoDocumento, String contenido) {
        if (tipoDocumento == 1 || tipoDocumento == 2 || tipoDocumento == 3) {
            this.tipoDocumento = tipoDocumento;
            this.contenido = contenido;
        } else {
            throw new IllegalArgumentException("No existe este tipo de categoria");
        }
    }
    public int getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(int tipoDocumento) {
        if (tipoDocumento == 1 || tipoDocumento == 2 || tipoDocumento == 3) {
            this.tipoDocumento = tipoDocumento;
        } else {
            throw new IllegalArgumentException("No existe este tipo de categoria");
        }
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}

