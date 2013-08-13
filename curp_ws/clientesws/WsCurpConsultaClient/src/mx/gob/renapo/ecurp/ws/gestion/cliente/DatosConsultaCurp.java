/*
 * @(#) DatosConsultaCurp.java                       02/11/2004
 *
 * Copyright 2004 Sigtao Software S.A. de C.V. Todos los derechos reservados.
 * upd
 */
package mx.gob.renapo.ecurp.ws.gestion.cliente;

/**
 * Clase que actúa como Bean y encapsula los datos que se envían como parámetros
 * para realizar la consulta por curp
 * 
 * @author Dalma Casas Vargas
 * @since 1.0
 * @version 1.0, 02-nov-2004
 */
public class DatosConsultaCurp
{
    private String   direccionIp;
    private int      tipoTransaccion;
    private String   usuario;
    private String   password;
    private String   cveCurp;
    private String   cveEntidadEmisora;
    //private String   dn;

    /**
     * Constructor nulo
     * 
     */
    public DatosConsultaCurp() {
        super();
    }
    
    
    /**
     * Constructor sin entidad emisora
     * @param direccionIp
     * @param tipoTransaccion
     * @param usuario
     * @param password
     * @param cveCurp
     */
    public DatosConsultaCurp(String direccionIp, int tipoTransaccion,
            String usuario, String password, String cveCurp) {
        this.direccionIp = direccionIp;
        this.tipoTransaccion = tipoTransaccion;
        this.usuario = usuario;
        this.password = password;
        this.cveCurp = cveCurp;
    }
    
    
    /**
     * Constructor
     * @param direccionIp
     * @param tipoTransaccion
     * @param usuario
     * @param password
     * @param cveCurp
     * @param cveEntidadEmisora
     */
    public DatosConsultaCurp(String direccionIp, int tipoTransaccion,
            String usuario, String password, String cveCurp,
            String cveEntidadEmisora) {
        this.direccionIp = direccionIp;
        this.tipoTransaccion = tipoTransaccion;
        this.usuario = usuario;
        this.password = password;
        this.cveCurp = cveCurp;
        this.cveEntidadEmisora = cveEntidadEmisora;
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
     * @return Obtiene el valor del atributo cveCurp.
     */
    public String getCveCurp() {
        return cveCurp;
    }
    /**
     * @param cveCurp Asigna valor al atributo cveCurp.
     */
    public void setCveCurp(String cveCurp) {
        this.cveCurp = cveCurp;
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
    /**
     * @return Obtiene el valor del atributo usuario.
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * @param usuario Asigna valor al atributo usuario.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


  /*public void setDn(String dn)
  {
    this.dn = dn;
  }


  public String getDn()
  {
    return dn;
  }*/
}