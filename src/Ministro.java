public class Ministro extends Gobierno {

    @Override
    void procesarSolicitud(Documento documento) {
        if (documento.getTipoDocumento() < 3) {
            System.out.println("leido por el ministro");
            getSigFuncionario().procesarSolicitud(documento);
        } else if (getSigFuncionario() != null){
            getSigFuncionario().procesarSolicitud(documento);
        }
    }
}
