
public class Odontologo {
    private int numeroMatricula;
    private String nombre;
    private String apellido;

}
public interface OdontologoDAO {
    void guardarOdontologo(Odontologo odontologo);
    List<Odontologo> listarOdontologos();
}

public class OdontologoDAOImpl implements OdontologoDAO {
    // Implementación de los métodos DAO utilizando H2
}
public class OdontologoDAOMemory implements OdontologoDAO {
    private List<Odontologo> odontologos = new ArrayList<>();

    @Override
    public void guardarOdontologo(Odontologo odontologo) {
        odontologos.add(odontologo);
    }

    @Override
    public List<Odontologo> listarOdontologos() {
        return odontologos;
    }
}
import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;

public class OdontologoDAOImpl implements OdontologoDAO {
    private static final Logger logger = LogManager.getLogger(OdontologoDAOImpl.class);

    @Override
    public void guardarOdontologo(Odontologo odontologo) {
        // Lógica de guardar el odontólogo
        logger.info("Se ha guardado el odontólogo: " + odontologo.getNombre());
    }

    @Override
    public List<Odontologo> listarOdontologos() {
        // Lógica de listar odontólogos
        logger.info("Se han listado todos los odontólogos");
        return odontologos;
    }
}
