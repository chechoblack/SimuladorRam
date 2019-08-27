/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador.ram;

/**
 *
 * @author ser
 */
public class Comando {
    String tipoComando,operando1,operando2;
    String tipoComandoBinario,operando1Binario,operando2Binario;
    /**
     * 
     * @param tipocomando
     * @param tipoComandoBinario
     * @param operando1
     * @param operando1Binario
     * @param operando2
     * @param operando2Binario 
     */
    public Comando(String tipocomando, String tipoComandoBinario, String operando1, String operando1Binario,String operando2, String operando2Binario) {
        this.tipoComando=tipocomando;
        this.operando1=operando1;
        this.operando2=operando2;
        this.tipoComandoBinario=tipoComandoBinario;
        this.operando1Binario=operando1Binario;
        this.operando2Binario=operando2Binario;
    }
    /**
     * 
     * @return tipoComando normal
     */
    public String getTipoComando() {
        return tipoComando;
    }
    /**
     * 
     * @param tipoComando 
     */
    public void setTipoComando(String tipoComando) {
        this.tipoComando = tipoComando;
    }
    /**
     * 
     * @return 
     */
    public String getOperando1() {
        return operando1;
    }
    /**
     * 
     * @param operando1 
     */
    public void setOperando1(String operando1) {
        this.operando1 = operando1;
    }
    /**
     * 
     * @return 
     */
    public String getOperando2() {
        return operando2;
    }
    /**
     * 
     * @param operando2 
     */
    public void setOperando2(String operando2) {
        this.operando2 = operando2;
    }
    /**
     * 
     * @return 
     */
    public String getTipoComandoBinario() {
        return tipoComandoBinario;
    }
    /**
     * 
     * @param tipoComandoBinario 
     */
    public void setTipoComandoBinario(String tipoComandoBinario) {
        this.tipoComandoBinario = tipoComandoBinario;
    }
    /**
     * 
     * @return 
     */
    public String getOperando1Binario() {
        return operando1Binario;
    }
    /**
     * 
     * @param operando1Binario 
     */
    public void setOperando1Binario(String operando1Binario) {
        this.operando1Binario = operando1Binario;
    }
    /**
     * 
     * @return 
     */
    public String getOperando2Binario() {
        return operando2Binario;
    }
    /**
     * 
     * @param operando2Binario 
     */
    public void setOperando2Binario(String operando2Binario) {
        this.operando2Binario = operando2Binario;
    }
}
