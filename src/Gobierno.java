public abstract class Gobierno {
    private String Nombre;
    private Gobierno sigFuncionario;

    abstract void procesarSolicitud(Documento documento);
    void setSiguienteFuncionario(Gobierno funcionario){
            sigFuncionario = funcionario;
    }
    Gobierno getSigFuncionario(){
        return sigFuncionario;
    }
}

