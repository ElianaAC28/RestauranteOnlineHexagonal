/**
 * Interface del repositorio de Almuerzos.
 *
 * @author
 */
package co.edu.unicauca.restaurantehexagonal.dominio.interfaces;



import co.edu.unicauca.restaurantehexagonal.dominio.entities.Almuerzo;
import co.edu.unicauca.restaurantehexagonal.dominio.entities.Restaurante;
import java.util.List;

/**
 *
 * @author SoftwareTeam
 */
public interface IAlmuerzoRepository {

    /**
     * Crea un nuevo Almuerzo.
     *
     * @param parAlmuerzo Objeto de tipo Almuerzo.
     * @return valor especifico (idAlmuerzo)
     */

    public String createAlmuerzo(Almuerzo parAlmuerzo);
    public String updateAlmuerzo(Almuerzo parAlmuerzo);
    public String deleteCompAlmuerzo(Almuerzo parAlmuerzo);
    public List<Almuerzo> findAllAlmuerzos();
    public List<Almuerzo> findAllAlmuerzosRest(String restId);
    public String contarAlmu(Almuerzo parAlmuerzo);
    public String asociarComp( String almuid, String compid);
    public String updateCosto(Almuerzo parAlmuerzo);
    public String updateDescrip(Almuerzo parAlmuerzo);
    public String updateFoto(Almuerzo parAlmuerzo);
    public List<Almuerzo> foto(String idAlmu);
    public Almuerzo buscaralmu(String restId, String idAlmu);
}
