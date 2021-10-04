/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Escritorio
 */
public class Directorio {
     private Map<Long , Cliente> directorio= new HashMap<>(); 
     
      
    public Directorio() {
    }
    
     public boolean agregarCliente(long tel , Cliente cliente){
     if (directorio.containsKey(tel) ){
             return false;}
     else { directorio.put(tel, cliente);
     return true;
     }
     }

     
     public Cliente buscarCliente(long tel){
         Cliente cliente=null;
   if (directorio.containsKey(tel)){
             cliente=directorio.get(tel);
     }
 
         return cliente;
     }


    public Map<Long, Cliente> getDirectorio() {
        return directorio;
    }
          
        
             
     
     public List<Long> buscarTelefono(String apellido){
        Cliente cliente;
         ArrayList<Long> t =new ArrayList<>();

        
         System.out.println("Telefonos a nombre de "+apellido+": ");
     
      for (Map.Entry<Long, Cliente> e : directorio.entrySet()) {
          cliente= e.getValue();

         if (cliente.getApellido() == apellido) { 
               t.add(e.getKey()); 
         } 
       }
       if(t.isEmpty()) { System.out.println("No existe telefono a su nombre");
         } else { System.out.println(t);}
       
       return t;  
        }
     
     
     public HashSet buscarClientes(String ciudad){
        Cliente cliente;
        HashSet c= new HashSet();
        System.out.println("Clientes de la ciudad de "+ciudad+": ");
     
      for (Map.Entry<Long, Cliente> e : directorio.entrySet()) {
          cliente= e.getValue();

         if (cliente.getCiudad() == ciudad) { 
               c.add(cliente); 
         } 
       }
          if(c.isEmpty()) { System.out.println("No existe clientes en esta ciudad");
         } else { System.out.println(c);}
       
       return c;  
        }
     
     public void  borrarCliente(long dni){

          Collection v = directorio.values();
  Iterator it=v.iterator();
  while (it.hasNext()){
  
  Cliente val=(Cliente)it.next();
      if(val.dni== dni){
          it.remove();
          JOptionPane.showMessageDialog(null, "Cliente borrado");
      }  
}
}
}
     
              
               
                         
                         
  
                
              
            
            
       
         
         
         
         
     
     
     
     

   
 
    
    
    
    

