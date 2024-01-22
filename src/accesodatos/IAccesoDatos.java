package accesodatos;
//Una interface no tiene constructores, cualquier metodo que agreguemos va a ser publico y abstracto.

public interface IAccesoDatos {
    int MAX_REGISTRO = 10;
    
    //Este metodo es abstracto y al ser abstracto no lleva cuerpo. Por lo tanto no abrimos ni cerramos llaves,
    //si no que terminamos el metodo con punto y coma.
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
}
