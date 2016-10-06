/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado e1=new Empleado("100","carlos", 30);
        Empleado e2=new Empleado("110","carlos", 30);
        
        Sucursal s=new Sucursal("Bogota");
        if (!s.ingreasarEmp(e1))System.out.println("ERROR");
        if (!s.ingreasarEmp(e2))System.out.println("ERROR");
        if (!s.ingreasarEmp(e2))System.out.println("ERROR");
        Empleado e =s.buscarEmpleado("100");
        if (e!=null) System.out.println(e);
        else System.out.println("NO EXISTE");
        
        
    }
    
}
