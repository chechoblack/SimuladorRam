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
public class ConvertirBinario {
    /**
     * 
     * @param tipoComando
     * @return 
     */
    public String cambiarBinario(String tipoComando){
        if("LOAD".equals(tipoComando) || "AX".equals(tipoComando)){
            return "0001";
        }
        if("STORE".equals(tipoComando) || "BX".equals(tipoComando)){
            return "0010";
        }
        if("MOVE".equals(tipoComando) || "CX".equals(tipoComando)){
            return "0011";
        }
        if("SUB".equals(tipoComando) || "DX".equals(tipoComando)){
            return "0100";
        }
        if("ADD".equals(tipoComando)){
            return "0101";
        }
        else
           return convertir(Integer.parseInt(tipoComando)); 
    }
    /**
     * 
     * @param numero
     * @return 
     */
    public String convertir(int numero){
        int bandera = 0;
        if(numero<0){
            bandera=1;
            numero=numero*-1;
        }
        String binario = "";
        if (numero > 0) {
            while (numero > 0) {
                if (numero % 2 == 0) {
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                numero = (int) numero / 2;
            }
        } else if (numero == 0) {
            binario = "0";
        } else {
            binario = "-1";
        }
        return completarBinario(binario,bandera);
    }
    /**
     * 
     * @param Binario
     * @return 
     */
    private String completarBinario(String Binario,int bandera){
        int contador=8-Binario.length();
        String binarioCompleto=String.valueOf(bandera);
        for(int i=0;i<contador-1;i++){
            binarioCompleto+="0";
        }
        return binarioCompleto+Binario;
    }
}
