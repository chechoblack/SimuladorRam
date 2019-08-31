package simulador.ram;

import java.util.ArrayList;

/**
 *
 * @author Andrey
 */
public class Funcionalidad {
    
    int Posicion;//posicion en tabla
    String Comando;//move,add,etc
    String Registro;//ax,bx
    String Operando;//numero
    String Binario;//todos los datos en binario
    
    public Funcionalidad(int Posicion, String Comando,String Registro, String Operando,String Binario) {
      this.Posicion=Posicion;
      this.Comando=Comando;
      this.Registro=Registro;
      this.Operando=Operando;
      this.Binario= Binario;
      
    }

    public String getBinario() {
        return Binario;
    }

    public void setBinario(String Binario) {
        this.Binario = Binario;
    }

    public int getPosicion() {
        return Posicion;
    }

    public void setPosicion(int Posicion) {
        this.Posicion = Posicion;
    }

    public String getComando() {
        return Comando;
    }

    public void setComando(String Comando) {
        this.Comando = Comando;
    }

    public String getRegistro() {
        return Registro;
    }

    public void setRegistro(String Registro) {
        this.Registro = Registro;
    }

    public String getOperando() {
        return Operando;
    }

    public void setOperando(String Operando) {
        this.Operando = Operando;
    }
    
    
}
