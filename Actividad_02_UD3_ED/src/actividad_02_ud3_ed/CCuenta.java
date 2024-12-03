/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Ana
 */
public class CCuenta {


     
    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Número de cuenta
    * @param sal Saldo de cuenta
    * @param tipo Tipo de interés de la cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * Se asigna el nombre del titular de la cuenta
   * 
   * @param nom Nombre titular
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
   /**
   * Se obtiene el nombre del titular de la cuenta
   * 
   * @return El nombre del titular
   */
    public String obtenerNombre()
    {
        return nombre;
    }
    
   /**
   * Se obtiene el estado de la cuenta
   * 
   * @return El saldo de la cuenta
   */
     public double estado ()
    {
        return saldo;
    }
     
   /**
   * Ingesa cantidad en la cuenta. Si la cantidad es negativa, se lanza una excepción
   * 
   * @param cantidad
   * @throws Exception cuando la cuenta es negativa
   */

    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
   * Retira cantidad de la cuenta. Si cantidad negativa, lanza una expeción
   * 
   * @param cantidad
   * @throws Exception si la cantidad es negativa
   */
   
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     * Obtiene el número de cuenta.
     * 
     * @return El número de cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }
    
  /**
  * Establece el número de cuenta.
  * 
  * @param cuenta El número de cuenta
  */

  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }
  
 /**
 * Establece el saldo de cuenta.
 * 
 * @param saldo El saldo de la cuenta
 */ 

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
  
 /**
 * Establece el tipo de interés de la cuenta.
 * 
 * @return tipo de interés
 */

 
  public double getTipoInterés() {
    return tipoInterés;
  }
  
 /**
 * 
 * @param tipoInterés El tipo de interés a establecer
 */

  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
