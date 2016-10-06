
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
public class Sucursal {
    private String ciudad;
    private int numEmpleados;
    private HashMap<String,Empleado>emp;

    public HashMap<String, Empleado> getEmp() {
        return emp;
    }

    public void setEmp(HashMap<String, Empleado> emp) {
        this.emp = emp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }
    
    public Sucursal(String ciudad) {
        this.ciudad = ciudad;
        this.numEmpleados = 0;
        this.emp = new HashMap<>();
    }
    public boolean ingreasarEmp(Empleado e){
        if (this.emp.containsKey(e.getCedula()))
            return false;
        else{
            this.emp.put(e.getCedula(),e);
            return true;
        }
    }
    public ArrayList<Empleado>listarTodos(){
        ArrayList<Empleado>empleados=
                new ArrayList<>();
        for(Empleado e:this.emp.values())
            empleados.add(e);
        return empleados;
    }
    public Empleado empleadomayor(){
        Empleado mayor=null;
        for (Empleado e:this.emp.values()){
            if (mayor==null){
                mayor=e;
            }
            else {
                if(e.getEdad()>mayor.getEdad())
                    mayor=e;
            }
        }
        return mayor;
    }
    public Empleado buscarEmpleado(String clave){
        Empleado e=null;
        e=this.emp.get(clave);
        return e;
    }
}
