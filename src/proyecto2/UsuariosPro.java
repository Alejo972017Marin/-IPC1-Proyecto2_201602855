
package proyecto2;

class UsuariosPro extends MReservaciones{
    
    
        
    public boolean SuperUsuario(String User, String Pas){
        
        return User.equals("ipc1Admin")&& Pas.equals("aux1"); 
        
        
    }
   
     private String[][] DatosUsu={{"ipc1Admin"},{"Administrador"},{"Alejandro"},{"Ingrid"}};
 
    
    
    public boolean Us(Object User) {
 
        Object USUC = "";
        
        for (Object Usutem[] : DatosUsu) {
            for(Object usut:Usutem){
                     USUC = usut ;
              if (User.equals(USUC)) {
                        return true;
                    }
            }
            
       
            

        }

        return false;

    }

    
    public boolean UsuariosPro(Object User) {
 
        Object USUC = "";
        
        for (Object Usutem[] : DatosC) {
            for(Object usut:Usutem){
                     USUC = usut ;
              if (User.equals(USUC)) {
                        return true;
                    }
            }
            
       
            

        }

        return false;

    }

}
