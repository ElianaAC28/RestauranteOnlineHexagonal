package co.edu.unicauca.restaurantehexagonal.dominio.services;



import co.edu.unicauca.restaurantehexagonal.dominio.entities.Usuario;
import co.edu.unicauca.restaurantehexagonal.dominio.infra.JsonError;
import co.edu.unicauca.restaurantehexagonal.dominio.interfaces.IUsuarioRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 * Servicio de Usuarios. Da acceso a la lógica de negocio
 *
 * @author SoftwareTeam
 * 
 */
public class UsuarioService 
{

    /**
     * Repositorio de usuarios
     */
    IUsuarioRepository repo;

    /**
     * Constructor parametrizado. Hace inyeccion de dependencias
     * 
     */
    public UsuarioService(IUsuarioRepository repo) 
    {
        this.repo = repo;
    }

    /**
     * Busca un usuario
     */
    public Usuario findUsuario(int userId, String userName) 
    {
        return repo.findUsuario(userId,userName);
    }
    
    /**
     * Autentica usuario
     */
    public String autenticarUsuario(String username, String userpassword){
        List<JsonError> errors = new ArrayList<>();
        if (username.isEmpty() || userpassword.isEmpty()) {
            errors.add(new JsonError("400", "BAD_REQUEST", "Nombre de usuario y password son requeridos"));
        }
        //Validacion con reglas de negocio
        return repo.autenticarUsuario(username,userpassword);
    }
    /**
     * Crea un nuevo usuario. Aplica validaciones de negocio
     * 
     */
    public String createUsuario(Usuario usuario) {
        List<JsonError> errors = new ArrayList<>();
  
        // Validaciones y reglas de negocio
       if (
               //usuario.getUserId().isEmpty() ||
               usuario.getUserName().isEmpty() ||
               usuario.getUserEmail().isEmpty() ||
               usuario.getUserPassword().isEmpty() ||
               usuario.getUserNombre().isEmpty() ||
               usuario.getUserApellido().isEmpty())
       {
           errors.add(new JsonError("400", "BAD_REQUEST","id, nombres, apellidos, email y género son obligatorios. "));
        } else {
       }
        
        if (!usuario.getUserEmail().contains("@")){
            errors.add(new JsonError("400", "BAD_REQUEST","Email debe tener una @. "));
        }    
        // Verifica que no se encuentre repetido repetido
        
        Usuario customerSearched = this.findUsuario(usuario.getUserId(),usuario.getUserName());
        if (customerSearched != null){
            errors.add(new JsonError("400", "BAD_REQUEST","La cedula o el nombre de usuario ya existen "));
            
        }
        
       if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorsJson = gson.toJson(errors);
            return errorsJson;
        }         
        return repo.createUsuario(usuario);
   }
    /**
     * Busca un usuario
     */
    public int gestionarID() 
    {
        return repo.gestionarID();
    }
}
