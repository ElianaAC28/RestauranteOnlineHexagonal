package co.edu.unicauca.restaurantehexagonal.dominio.interfaces;


import co.edu.unicauca.restaurantehexagonal.dominio.entities.Componente;
import java.util.List;

/**
 * Interface del repositorio de Componentes.
 *
 * @author SoftwareTeam
 */
public interface IComponenteRepository {

    /**
     * Crea un nuevo Componente.
     *
     * @param parComponente Objeto de tipo Componente.
     * @return valor especifico (idComponente)
     */
    public String createComponente(Componente parComponente);

    
    public String contarComponente(int almuid, int idtipocom);
    /**
    * Retornar todos los datos de los componente sin mostar
    * Un componente con el id que llega
    */
    public List<Componente> findAllComponentes(String idcomp);
    
    public List<Componente> findAllComponentes();
    
    public List<Componente> almuerzoComponentes(int almuerzo);
    
    public List<Componente> findAllComponentesRest(String restId);

    public String contarComponentex(int almuid, String nomComp);
    
    public String buscarComponente(int almuid,int idcomp);
}
