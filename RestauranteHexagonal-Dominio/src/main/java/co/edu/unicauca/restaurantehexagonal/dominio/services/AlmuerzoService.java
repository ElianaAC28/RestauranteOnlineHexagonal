
package co.edu.unicauca.restaurantehexagonal.dominio.services;



import co.edu.unicauca.restaurantehexagonal.dominio.entities.Almuerzo;
import co.edu.unicauca.restaurantehexagonal.dominio.entities.Restaurante;
import co.edu.unicauca.restaurantehexagonal.dominio.infra.JsonError;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IAlmuerzoRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;




/**
 * Servicio de usuarios del sistema
 * @author SoftwareTeam
 */
public class AlmuerzoService {

    IAlmuerzoRepository repositoryAlm;
  
    
    public AlmuerzoService( IAlmuerzoRepository repositoryAlm) {
        this.repositoryAlm = repositoryAlm;
    }

    public AlmuerzoService() {
    }

       /**
     * Crea un nuevo componente
     */
    public String createAlmuerzo(Almuerzo parAlmuerzo) {
        List<JsonError> errors = new ArrayList<>();
        if (parAlmuerzo.getIdAlmuerzo()== null || parAlmuerzo.getRestId()==null || parAlmuerzo.getCostoAlm().isEmpty()
                ) {
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION  ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repositoryAlm.createAlmuerzo(parAlmuerzo);
    }
    
     /**
     * Metodo encargado de obtener una lista de todos los almuerzos de la base de datos.
     *
     */
    public List<Almuerzo> listAlmuerzos() {
        List<JsonError> errors = new ArrayList<>();
        if (!repositoryAlm.findAllAlmuerzos().isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repositoryAlm.findAllAlmuerzos();
    }
    
     /**
     * Metodo encargado de obtener una lista de todos los almuerzos de un restaurante.
     *
     */
    public List<Almuerzo> listAlmuerzosRestaurante(String restId) {
        List<JsonError> errors = new ArrayList<>();
        if (!repositoryAlm.findAllAlmuerzosRest(restId).isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repositoryAlm.findAllAlmuerzosRest(restId);
    }

    public String updateAlmuerzo(Almuerzo parAlmuerzo) {
        List<JsonError> errors = new ArrayList<>();
        if (parAlmuerzo.getIdAlmuerzo()== null || parAlmuerzo.getRestId()==null ) {
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION  ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repositoryAlm.updateAlmuerzo(parAlmuerzo);
    }
    
    public String updateCosto(Almuerzo parAlmuerzo) {
        List<JsonError> errors = new ArrayList<>();
        if (parAlmuerzo.getIdAlmuerzo()== null || parAlmuerzo.getRestId()==null || parAlmuerzo.getCostoAlm() == null ) {
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION  ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repositoryAlm.updateCosto(parAlmuerzo);
    }
    
    public String updateDescrip(Almuerzo parAlmuerzo) {
        List<JsonError> errors = new ArrayList<>();
        if (parAlmuerzo.getIdAlmuerzo()== null || parAlmuerzo.getRestId()==null || parAlmuerzo.getDescripcion()== null ) {
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION  ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repositoryAlm.updateDescrip(parAlmuerzo);
    }
    
    public String updateFoto(Almuerzo parAlmuerzo) {
        List<JsonError> errors = new ArrayList<>();
        if (parAlmuerzo.getIdAlmuerzo()== null || parAlmuerzo.getRestId()==null ) {
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION  ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repositoryAlm.updateFoto(parAlmuerzo);
    }
    
    public String deleteCompAlmuerzo(Almuerzo parAlmuerzo) {
        List<JsonError> errors = new ArrayList<>();
        if (parAlmuerzo.getIdAlmuerzo()== null || parAlmuerzo.getRestId()==null ) {
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION  ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repositoryAlm.deleteCompAlmuerzo(parAlmuerzo);
    }
   public String contarAlmu (Almuerzo parAlmuerzo) {
        List<JsonError> errors = new ArrayList<>();
        if (parAlmuerzo.getIdAlmuerzo()== null || parAlmuerzo.getRestId()==null ) {
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION  ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repositoryAlm.contarAlmu(parAlmuerzo);
    }
   
    public String asociarComp (String almuid, String compid) {
        List<JsonError> errors = new ArrayList<>();
        if (almuid == null || compid == null ) {
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION  ES OBLIGATORIA "));
        }
        return repositoryAlm.asociarComp(almuid, compid);
    }       
    
    
    public Almuerzo buscar(String restId, String idAlmu) throws Exception
    {
        List<JsonError> errors = new ArrayList<>();
        if (!repositoryAlm.buscaralmu(restId, idAlmu).toString().isEmpty() ) 
        {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repositoryAlm.buscaralmu(restId, idAlmu);
    }
    
    public List<Almuerzo> foto(String idAlmu) {
        List<JsonError> errors = new ArrayList<>();
        if (idAlmu.isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repositoryAlm.foto(idAlmu);
    }
    
}
