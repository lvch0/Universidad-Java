package main;

public class Negocio {
    private final int idNegocio;
    private int idEmpleado;
    private int cuitNego;
    private String razonSocial;
    private String nombreComercial;
    private int direccion;
    private int telefono;
    private String email;
    private static int contadorNego;
    
    private Negocio() {
        this.idNegocio = ++Negocio.contadorNego;
    }
    
    public Negocio(int cuitNego, String razonSocial, String nombreComercial,
            int direccion, int telefono, String email) {
        this();
        this.cuitNego = cuitNego;
        this.razonSocial = razonSocial;
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdNegocio() {
        return this.idNegocio;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public int getCuitNego() {
        return this.cuitNego;
    }
    
    public String getRazonSocial() {
        return this.razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return this.nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public int getDireccion() {
        return this.direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
