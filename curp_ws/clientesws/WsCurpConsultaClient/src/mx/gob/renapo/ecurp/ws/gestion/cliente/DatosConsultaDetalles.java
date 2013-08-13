package mx.gob.renapo.ecurp.ws.gestion.cliente;
/**
 *
 * Clase que actúa como Bean y encapsula los datos que se envían como parámetros para
 * realizar la consulta por detalles.
 *
 */

//package mx.gob.segob.dgti.ecurp.wserv.services;

/**
 * @author Dalma Casas Vargas
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class DatosConsultaDetalles {
    private int tipoTransaccion;

    /**
     * <code>cveUsuario</code> Usuario
     */
    private String cveUsuario;

    /**
     * <code>password</code> Password
     */
    private String password;

    /**
     * <code>direccionIp</code> Dirección IP
     */
    private String direccionIp;

    /**
     * <code>nombre</code> Nombre
     */
    private String nombre;

    /**
     * <code>primerApellido</code> Primer apellido
     */
    private String primerApellido;

    /**
     * <code>fechaNacimiento</code> Fecha de nacimiento
     */
    private String fechaNacimiento;

    /**
     * <code>segundoApellido</code> Segundo apellido
     */
    private String segundoApellido;

    /**
     * <code>sexo</code> Sexo
     */
    private String sexo;

    /**
     * <code>cveAlfaEntFedNac</code> Entidad federativa de nacimiento
     */
    private String cveAlfaEntFedNac;
    
    /**
     * <code>cveEntidadEmisora</code> Clave de la entidad emisora
     */
    private String cveEntidadEmisora;
    

    /**
     * Constructor
     * 
     */
    public DatosConsultaDetalles() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    
    
    
    
    
    /**
     * Constructor
     * @param tipoTransaccion
     * @param cveUsuario
     * @param password
     * @param direccionIp
     * @param nombre
     * @param primerApellido
     * @param fechaNacimiento
     * @param segundoApellido
     * @param sexo
     * @param cveAlfaEntFedNac
     * @param cveEntidadEmisora
     */
    public DatosConsultaDetalles(int tipoTransaccion, String cveUsuario,
            String password, String direccionIp, String nombre,
            String primerApellido, String fechaNacimiento,
            String segundoApellido, String sexo, String cveAlfaEntFedNac,
            String cveEntidadEmisora) {
        this.tipoTransaccion = tipoTransaccion;
        this.cveUsuario = cveUsuario;
        this.password = password;
        this.direccionIp = direccionIp;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.segundoApellido = segundoApellido;
        this.sexo = sexo;
        this.cveAlfaEntFedNac = cveAlfaEntFedNac;
        this.cveEntidadEmisora = cveEntidadEmisora;
    }
    
    
    
    
    /**
     * Constructor sin entidad emisora
     * @param tipoTransaccion
     * @param cveUsuario
     * @param password
     * @param direccionIp
     * @param nombre
     * @param primerApellido
     * @param fechaNacimiento
     * @param segundoApellido
     * @param sexo
     * @param cveAlfaEntFedNac
     */
    public DatosConsultaDetalles(int tipoTransaccion, String cveUsuario,
            String password, String direccionIp, String nombre,
            String primerApellido, String fechaNacimiento,
            String segundoApellido, String sexo, String cveAlfaEntFedNac) {
        this.tipoTransaccion = tipoTransaccion;
        this.cveUsuario = cveUsuario;
        this.password = password;
        this.direccionIp = direccionIp;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.segundoApellido = segundoApellido;
        this.sexo = sexo;
        this.cveAlfaEntFedNac = cveAlfaEntFedNac;
    }
    /**
     * @return Obtiene el valor del atributo cveEntidadEmisora.
     */
    public String getCveEntidadEmisora() {
        return cveEntidadEmisora;
    }
    /**
     * @param cveEntidadEmisora Asigna valor al atributo cveEntidadEmisora.
     */
    public void setCveEntidadEmisora(String cveEntidadEmisora) {
        this.cveEntidadEmisora = cveEntidadEmisora;
    }
    /**
     * @return Obtiene el valor del atributo cveAlfaEntFedNac.
     */
    public String getCveAlfaEntFedNac() {
        return cveAlfaEntFedNac;
    }
    /**
     * @param cveAlfaEntFedNac Asigna valor al atributo cveAlfaEntFedNac.
     */
    public void setCveAlfaEntFedNac(String cveAlfaEntFedNac) {
        this.cveAlfaEntFedNac = cveAlfaEntFedNac;
    }
    /**
     * @return Obtiene el valor del atributo cveUsuario.
     */
    public String getCveUsuario() {
        return cveUsuario;
    }
    /**
     * @param cveUsuario Asigna valor al atributo cveUsuario.
     */
    public void setCveUsuario(String cveUsuario) {
        this.cveUsuario = cveUsuario;
    }
    /**
     * @return Obtiene el valor del atributo direccionIp.
     */
    public String getDireccionIp() {
        return direccionIp;
    }
    /**
     * @param direccionIp Asigna valor al atributo direccionIp.
     */
    public void setDireccionIp(String direccionIp) {
        this.direccionIp = direccionIp;
    }
    /**
     * @return Obtiene el valor del atributo fechaNacimiento.
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    /**
     * @param fechaNacimiento Asigna valor al atributo fechaNacimiento.
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * @return Obtiene el valor del atributo nombre.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre Asigna valor al atributo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return Obtiene el valor del atributo password.
     */
    public String getPassword() {
        return password;
    }
    /**
     * @param password Asigna valor al atributo password.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @return Obtiene el valor del atributo primerApellido.
     */
    public String getPrimerApellido() {
        return primerApellido;
    }
    /**
     * @param primerApellido Asigna valor al atributo primerApellido.
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    /**
     * @return Obtiene el valor del atributo segundoApellido.
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }
    /**
     * @param segundoApellido Asigna valor al atributo segundoApellido.
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    /**
     * @return Obtiene el valor del atributo sexo.
     */
    public String getSexo() {
        return sexo;
    }
    /**
     * @param sexo Asigna valor al atributo sexo.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    /**
     * @return Obtiene el valor del atributo tipoTransaccion.
     */
    public int getTipoTransaccion() {
        return tipoTransaccion;
    }
    /**
     * @param tipoTransaccion Asigna valor al atributo tipoTransaccion.
     */
    public void setTipoTransaccion(int tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
}// end class
