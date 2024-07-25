import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GobiernoTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    @DisplayName("probando documento nivel 1")
    void caso1() {
        Gobierno diputado = new Diputado();
        Gobierno ministro = new Ministro();
        Gobierno presidente = new Presidente();
        Documento documento_LEVEL1 = new Documento(1, "Reservado");

        //probando la solicitud
        ministro.setSiguienteFuncionario(presidente);
        diputado.setSiguienteFuncionario(ministro);

        diputado.procesarSolicitud(documento_LEVEL1);
        System.setOut(originalOut);

        String output = outContent.toString();
        System.out.println(output);

        String[] lines = output.split(System.lineSeparator());
        int count = lines.length;

        assertEquals(3, count);
    }
    @Test
    @DisplayName("probando documento nivel 2")
    void caso2(){
        Gobierno diputado = new Diputado();
        Gobierno ministro = new Ministro();
        Gobierno presidente = new Presidente();
        Documento documento_LEVEL2 = new Documento(2, "Secreto");
        ministro.setSiguienteFuncionario(presidente);
        diputado.setSiguienteFuncionario(ministro);

        diputado.procesarSolicitud(documento_LEVEL2);

        System.setOut(originalOut);
        String output = outContent.toString();
        System.out.println(output);
        String[] lines = output.split(System.lineSeparator());
        int count = lines.length;

        assertEquals(2, count);
    }
    @Test
    @DisplayName("probando documento nivel 3")
    void caso3(){
        Gobierno diputado = new Diputado();
        Gobierno ministro = new Ministro();
        Gobierno presidente = new Presidente();
        Documento documento_LEVEL3 = new Documento(3, "Muy secreto");
        ministro.setSiguienteFuncionario(presidente);
        diputado.setSiguienteFuncionario(ministro);

        diputado.procesarSolicitud(documento_LEVEL3);

        System.setOut(originalOut);
        String output = outContent.toString();
        System.out.println(output);
        String[] lines = output.split(System.lineSeparator());
        int count = lines.length;

        assertEquals(1, count);
    }
}