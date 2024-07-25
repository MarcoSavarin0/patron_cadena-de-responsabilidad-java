public class Presidente extends Gobierno {
    @Override
    void procesarSolicitud(Documento documento) {
        if (documento.getTipoDocumento() == 1 || documento.getTipoDocumento() == 2 || documento.getTipoDocumento() == 3) {
            System.out.println("Leido por el presidente");
        } else {
            System.out.println("sucedio un error");
        }
    }

}

