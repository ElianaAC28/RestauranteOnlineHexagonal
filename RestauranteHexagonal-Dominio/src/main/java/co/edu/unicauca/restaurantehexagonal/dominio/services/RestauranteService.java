package co.edu.unicauca.restaurantehexagonal.dominio.services;



import co.edu.unicauca.restaurantehexagonal.dominio.entities.Restaurante;
import co.edu.unicauca.restaurantehexagonal.dominio.infra.JsonError;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IRestauranteRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author SoftwareTeam
 * 
 */
public class RestauranteService 
{ 
    IRestauranteRepository repoRestaurante;
    
    
    /**
     * Constructor parametrizado, Hace inyeccion de dependencias.
     */
    public RestauranteService(IRestauranteRepository repoRestaurante) {
        this.repoRestaurante = repoRestaurante;
    }
    
    /**
     * Constructor por defecto.
     */
    public RestauranteService() {
    }
    
    /**
     * Crear restaurante.
     */
    public String createRestaurante(Restaurante parRestaurante) {
        List<JsonError> errors = new ArrayList<>();
        if (parRestaurante.getNit().isEmpty() || parRestaurante.getNombreRestaurante().isEmpty() || parRestaurante.getEslogan().isEmpty() 
            || parRestaurante.getPropietario().isEmpty() || parRestaurante.getDireccion().isEmpty()
            || parRestaurante.getDireccion().isEmpty() || parRestaurante.getCiudad().isEmpty()
            || parRestaurante.getAdministrador().isEmpty()) {
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION  ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repoRestaurante.createRestaurante(parRestaurante);
    }
    
    /**
     * Metodo encargado de obtener una lista de todos los restaurantes
     * existentes
     * 
     */
    public List<Restaurante> listRestaurantes() {
        List<JsonError> errors = new ArrayList<>();
        if (!repoRestaurante.findAllRestaurantes().isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repoRestaurante.findAllRestaurantes();
    }
    
    /**
     * Buscar un Restaurante utlizando un socket
     *
     * @param userId del administrador
     * @return Objeto restaurant
     * @throws Exception
     */
    public Restaurante findRestauranteUser(String userId) throws Exception{
        List<JsonError> errors = new ArrayList<>();
        if (!repoRestaurante.findRestauranteUser(userId).toString().isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repoRestaurante.findRestauranteUser(userId);
    }
    
    /**
     * Buscar un Restaurante utlizando un socket
     *
     * @param restId del restaurante
     * @return Objeto restaurant
     * @throws Exception
     */
    public Restaurante findRestaurante(String restId) throws Exception{
        List<JsonError> errors = new ArrayList<>();
        if (!repoRestaurante.findRestaurante(restId).toString().isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repoRestaurante.findRestaurante(restId);
    }

}
