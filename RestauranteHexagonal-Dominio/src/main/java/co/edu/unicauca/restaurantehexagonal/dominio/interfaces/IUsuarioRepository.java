package co.edu.unicauca.restaurantehexagonal.dominio.interfaces;

;

import co.edu.unicauca.restaurantehexagonal.dominio.entities.Usuario;

/**
 * Interface del respositorio de clientes
 * @author Libardo Pantoja
 */
public interface IUsuarioRepository {
    /**
     * Busca un Usuario por su id
     * @param userId id del usuario
     * @return  objeto de tipo Usuario
     */
    public Usuario findUsuario(String userId);
        /**
     * Crea un Usuario por su id
     * @param usuario id del usuario
     * @return  objeto de tipo Usuario
     */
    public String createUsuario(Usuario usuario);
        /**
     * Autentica un Usuario por su id
     * @param userpassword id del usuario
     * @return  objeto de tipo Usuario
     */
    public String autenticarUsuario(String username, String userpassword);

}
