/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.restaurantehexagonal.dominio.services;



import co.edu.unicauca.restaurantehexagonal.dominio.entities.Componente;
import co.edu.unicauca.restaurantehexagonal.dominio.infra.JsonError;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IComponenteRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author SoftwareTeam
 * 
 */
public class ComponenteService {
    IComponenteRepository repoComponente;

    /**
     * Constructor parametrizado, Hace inyeccion de dependencias.
     */
    public ComponenteService(IComponenteRepository repoComponente) {
        this.repoComponente = repoComponente;
    }

    /**
     * Constructor por defecto.
     */
    public ComponenteService() {
    }
    
    /**
     * Crea un nuevo componente
     */
    public String createComponente(Componente parComponente) {
        List<JsonError> errors = new ArrayList<>();
        if (parComponente.getIdComponente()== null || parComponente.getIdRestaurante()==null || parComponente.getNombreComponente().isEmpty() 
            || parComponente.getTipoComponente().isEmpty() || parComponente.getIdtipoComponente() == null) {
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION  ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repoComponente.createComponente(parComponente);
    }
    
    public String contarComponente (int almuid, int idtipocom){
        List<JsonError> errors = new ArrayList<>();
        if (!repoComponente.almuerzoComponentes(almuid).isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repoComponente.contarComponente(almuid,idtipocom);        
    }
    
    public String contarComponentex (int almuid, String nomComp){
        List<JsonError> errors = new ArrayList<>();
        if (!repoComponente.almuerzoComponentes(almuid).isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repoComponente.contarComponentex(almuid, nomComp); 
    }
    
    /**
     * Metodo encargado de buscar un componente segun su almuerzo y nombre.
     * 
     */
    public String buscarComponente (int almuid, int nomComp){
        List<JsonError> errors = new ArrayList<>();
        if (!repoComponente.almuerzoComponentes(almuid).isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repoComponente.buscarComponente(almuid, nomComp); 
    }
   
    
    
    /**
     * Metodo encargado de obtener una lista de todos los componentes
     * existentes en un restaurante sin mostrar el componente que se le solicita.
     * 
     */
    public List<Componente> listComponentes(String idcomp) {
        List<JsonError> errors = new ArrayList<>();
        if (!repoComponente.findAllComponentes().isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repoComponente.findAllComponentes(idcomp);
    }
    
    /**
     * Metodo encargado de obtener una lista de todos los componentes
     * existentes.
     * 
     */
    public List<Componente> listComponentes() {
        List<JsonError> errors = new ArrayList<>();
        if (!repoComponente.findAllComponentes().isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repoComponente.findAllComponentes();
    }
    
    /**
     * Metodo encargado de obtener una lista de todos los componentes
     * existentes.
     * 
     */
    public List<Componente> listComponentesRest(String restId) {
        List<JsonError> errors = new ArrayList<>();
        if (!repoComponente.findAllComponentesRest(restId).isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repoComponente.findAllComponentesRest(restId);
    }
    
    /**
     * Metodo encargado de obtener una lista de todos los componentes
     * de un almuerzo.
     * 
     */
    public List<Componente> listComponentesAlmuerzo(int almuerzo) {
        List<JsonError> errors = new ArrayList<>();
        if (!repoComponente.almuerzoComponentes(almuerzo).isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repoComponente.almuerzoComponentes(almuerzo);
    }
}
