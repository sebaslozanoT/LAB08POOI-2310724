
package banco;

import java.util.ArrayList;
import java.util.List;


public class Cliente {
    private String idCliente;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private int dni;
    private List<CuentaBancaria> cuentas = new ArrayList<>();
    private List<EventoBancario> eventoBancarios = new ArrayList<>();

    public Cliente(String idCliente, String nombre, String apellido, String direccion, int telefono, int dni) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public List<EventoBancario> getEventoBancarios() {
        return eventoBancarios;
    }

    public void setEventoBancarios(List<EventoBancario> eventoBancarios) {
        this.eventoBancarios = eventoBancarios;
    }
    
public class CuentaAhorro extends CuentaBancaria {
    private double tasaInteresAnual;
    private String beneficios;

    public CuentaAhorro(double tasaInteresAnual, String beneficios, String numeroCuenta, String descripcionCuenta, String cuentaCCI, String estado) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, estado);
        this.tasaInteresAnual = 0.03;
        this.beneficios = beneficios;
        
    }

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
}


public class CuentaCorriente extends CuentaBancaria{
    private double tasaInteresAnual;
    private double ComisionFija;
    private int maxRetiro;

    public CuentaCorriente(double tasaInteresAnual, double ComisionFija, int maxRetiro, String numeroCuenta, String descripcionCuenta, String cuentaCCI, String estado) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, estado);
        this.tasaInteresAnual = 0.02;
        this.ComisionFija = 2.0;
        this.maxRetiro = maxRetiro;
        
    } 

    public double getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public void setTasaInteresAnual(double tasaInteresAnual) {
        this.tasaInteresAnual = tasaInteresAnual;
    }

    public double getComisionFija() {
        return ComisionFija;
    }

    public void setComisionFija(double ComisionFija) {
        this.ComisionFija = ComisionFija;
    }

    public int getMaxRetiro() {
        return maxRetiro;
    }

    public void setMaxRetiro(int maxRetiro) {
        this.maxRetiro = maxRetiro;
    }
}

    
public class CuentaCTS extends CuentaBancaria{
    private double tasaInteresAnial;
    private int puntos;

    public CuentaCTS(double tasaInteresAnial, int puntos, String numeroCuenta, String descripcionCuenta, String cuentaCCI, String estado) {
        super(numeroCuenta, descripcionCuenta, cuentaCCI, estado);
        this.tasaInteresAnial = 0.07;
        this.puntos = puntos;
        
    }

    public double getTasaInteresAnial() {
        return tasaInteresAnial;
    }

    public void setTasaInteresAnial(double tasaInteresAnial) {
        this.tasaInteresAnial = tasaInteresAnial;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
   
}

public class CuentaFree{
    private boolean numIlimitado;

    public CuentaFree(boolean numIlimitado) {
        this.numIlimitado = numIlimitado;
    }

    public boolean isNumIlimitado() {
        return numIlimitado;
    }

    public void setNumIlimitado(boolean numIlimitado) {
        this.numIlimitado = numIlimitado;
    }

    
public class CuentaSueldo {
    private String nombreEmpresa;

    public CuentaSueldo(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}
    
public class EventoBancario {
    private Date fecha;
    private String tituloEvento;
    private String descripcion;

    public EventoBancario(Date fecha, String tituloEvento, String descripcion) {
        this.fecha = fecha;
        this.tituloEvento = tituloEvento;
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTituloEvento() {
        return tituloEvento;
    }

    public void setTituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    package banco;


public class MovimientoCuenta {
    private String numOperacion;
    private String descripcion;
    private Date fecha;
    private double importe;
    private String tipoOperacion;

    public MovimientoCuenta(String numOperacion, String descripcion, Date fecha, double importe, String tipoOperacion) {
        this.numOperacion = numOperacion;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.importe = importe;
        this.tipoOperacion = tipoOperacion;
    }

