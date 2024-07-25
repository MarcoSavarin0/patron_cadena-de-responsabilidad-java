public class Diputado extends Gobierno{


    @Override
    void procesarSolicitud(Documento documento) {
        if (documento.getTipoDocumento() == 1){
            System.out.println("Leido por el diputado");
            getSigFuncionario().procesarSolicitud(documento);
        }else if (getSigFuncionario() != null){
            getSigFuncionario().procesarSolicitud(documento);
        }
    }
}
