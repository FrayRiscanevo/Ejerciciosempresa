
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Empresa {
    private String nombre;
    private HashMap<String,Sucursal>sucursales;
    public Empresa(String nombre) {
        this.nombre=nombre;
        this.sucursales = new HashMap<>();
    }
    public ArrayList<Empleado>listarTodos(){
        ArrayList<Empleado>empleados=
                new ArrayList<>();
        for(Sucursal s:this.sucursales.values())
            for(Empleado e:s.getEmp().values())
                empleados.add(e);
        return empleados;
    }
    public boolean ingreasarSucursal(Sucursal s){
            this.sucursales.put(s.getCiudad(),s);
            return true;
    }
}
