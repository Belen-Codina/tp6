/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6;

import javax.swing.JOptionPane;

/**
 *
 * @author Escritorio
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente c1= new Cliente(35208236, "Belen", "Codina", "San Luis", "Alte Brown 1");
        Cliente c2= new Cliente(40512434, "Maria", "Garcia", "Buenos Aires", "Callao 300");
   
        Directorio d1 = new Directorio();
        
     
                if (d1.agregarCliente(2657324753l, c1)){
                    JOptionPane.showMessageDialog(null, "Agregado con exito");}
                else {JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR");}
                
               if (d1.agregarCliente(2657324753l, c2)){
                    JOptionPane.showMessageDialog(null, "Agregado con exito");}
                else {JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR");}
               
                 if (d1.agregarCliente(153053265l, c1)){
                   JOptionPane.showMessageDialog(null, "Agregado con exito");}
              else {JOptionPane.showMessageDialog(null, "ERROR AL AGREGAR");}
      
   
    d1.agregarCliente(151235689l, c2);
    d1.buscarTelefono("Codina");
   d1.buscarClientes("San Luis");
         if (d1.buscarCliente(2657324753l)==null){
        JOptionPane.showMessageDialog(null, "No existe cliente");
                }else {System.out.println(d1.buscarCliente(2657324753l));}
  d1.borrarCliente(35208236);
         if (d1.buscarCliente(2657324753l)==null){
        JOptionPane.showMessageDialog(null, "No existe cliente");
                }else {System.out.println(d1.buscarCliente(2657324753l));}
  
  
    
    
}
}
                

