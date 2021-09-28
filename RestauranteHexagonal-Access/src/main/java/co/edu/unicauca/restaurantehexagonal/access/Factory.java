package co.edu.unicauca.restaurantehexagonal.access;

import co.edu.unicauca.restaurantehexagonal.dominio.infra.Utilities;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IAlmuerzoRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IComponenteRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IRestauranteRepository;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IUsuarioRepository;




/**
 * Fabrica que se encarga de instanciar un repositorio concreto
 *
 * @author SoftwareTeam
 */
public class Factory{

    private static Factory instance;

    private Factory() {
    }

    /**
     * Clase singleton
     *
     * @return
     */
    public static Factory getInstance() {

        if (instance == null) {
            instance = new Factory();
        }
        return instance;

    }

    /**
     * Método que crea una instancia concreta de la jerarquia
     * IUsuarioRepository
     *
     * @return una clase hija de la abstracción IRepositorioClientes
     */
    public IUsuarioRepository getRepositoryUsuario() {
        String type = Utilities.loadProperty("customer.repository");
        if (type.isEmpty()) {
            type = "mysql";
        }
        IUsuarioRepository result = null;

        switch (type) {
            case "default":
                //result = new UsuarioRepositoryImplArrays();
                break;
            case "mysql":
                result = new UsuarioRepositoryImplMysql();
                break;
        }

        return result;

    }
    
    /**
     * Método que crea una instancia concreta de la jerarquia IComponenterepository.
     *
     * @return una clase hija de la abstracción IComponenterepository.
     */
    public IComponenteRepository getRepositoryComponente() {
        //String type = "mysql";
        String type = Utilities.loadProperty("customer.repository");
        if (type.isEmpty()) {
            type = "mysql";
        }
        IComponenteRepository result = null;
        switch (type) {
            case "mysql":
                result = new ComponenteRepositoryImplMysql();
                break;
        }
        return result;
    }
    
     /**
     * Método que crea una instancia concreta de la jerarquia IComponenterepository.
     *
     * @return una clase hija de la abstracción IComponenterepository.
     */
    
    
    public IAlmuerzoRepository getRepositoryAlmuerzo() {
       String type = Utilities.loadProperty("customer.repository");
        if (type.isEmpty()) {
            type = "default";
        }
        IAlmuerzoRepository result = null;

        switch (type) {
         
            case "mysql":
                result = new AlmuerzoRepositoryImplMysql();
                break;
        }

        return result;
    }
    
    public IRestauranteRepository getRepositoryRestaurante() {
       String type = Utilities.loadProperty("customer.repository");
        if (type.isEmpty()) {
            type = "default";
        }
        IRestauranteRepository result = null;

        switch (type) {
         
            case "mysql":
                result = new RestauranteRepositoryImplMysql();
                break;
        }

        return result;
    }
}
