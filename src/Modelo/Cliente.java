
package Modelo;

import java.sql.Date;

/**
 *
 * @author Saira Urbina
 */
public class Cliente {
    
    private String cedula;
    private String nombres;
    private String Apellidos;
    private String telefono;
    private Date fechaNacimiento;
    
    public Cliente(String cedula, String nombres, String Apellidos, String telefono, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.Apellidos = Apellidos;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
   
    
    
}
