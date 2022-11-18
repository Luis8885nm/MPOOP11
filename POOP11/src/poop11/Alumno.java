/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 *
 * @author Elián
 */
public class Alumno {
    private String Nombre; 
    private String apPaterno; 
    private String apMaterno; 
    private int numCuenta;
    private int edad;
    private float promedio;

    public Alumno() {
        
    }

    public Alumno(String Nombre, String apPaterno, String apMaterno, int numCuenta, int edad, float promedio) {
        this.Nombre = Nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getEdad() {
        return edad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre=" + Nombre + ", apPaterno=" + apPaterno + ", apMaterno=" + apMaterno + ", numCuenta=" + numCuenta + ", edad=" + edad + ", promedio=" + promedio + '}';
    }

   
}
