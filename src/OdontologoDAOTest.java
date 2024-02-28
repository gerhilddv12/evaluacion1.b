
import org.junit.Test;
        import static org.junit.Assert.assertEquals;
        import java.util.List;

public class OdontologoDAOTest {
    @Test
    public void testListarOdontologos() {
        OdontologoDAO dao = new OdontologoDAOImpl(); // Cambiar por la implementación que se desee testear
        List<Odontologo> odontologos = dao.listarOdontologos();
        assertEquals(2, odontologos.size()); // Suponiendo que se han guardado 2 odontólogos previamente
    }
}
