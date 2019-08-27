/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador.ram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author ser
 */
public class archivo {
    
    private ArrayList<Comando> arregloComandos = new ArrayList();
    private String tipoComando="",operando1 = "",operando2 = "";
    ConvertirBinario Cambio = new ConvertirBinario();
    //lee el archivo de txt
    /**
     * 
     * @param direccion
     * @return 
     */
    public ArrayList<String> leerTxt(String direccion){ //direccion del archivo
        ArrayList<String>  texto = new ArrayList<>();
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){ 
                //haz el ciclo, mientras bfRead tiene datos
                texto.add(bfRead); //guardado el texto del archivo
            }
        }catch(Exception e){ 
            System.err.println("No se encontro archivo");
        }
        
        return texto;
        
    }
    /**
     * 
     * @param resultado 
     */
    //crea cada linea del txt en objeto
    public void crearObjestos(ArrayList<String> resultado){
         for(int i=0; i<resultado.size();i++){
            String Linea = resultado.get(i);
            String [] palabra = Linea.split(" ");//convierte la linea en lista 
            for(int x=0;x<palabra.length-1;x++){
                String [] palabras = palabra[1].split(",");// si contiene un registro y un numero los separa
                tipoComando=palabra[x];
                if(palabras.length==2){
                    operando1=palabras[0];
                    operando2=palabras[1];
                }
                else{
                    operando1=palabras[0];
                    operando2="0";
                }
            }
            Comando lista=new Comando(tipoComando,Cambio.cambiarBinario(tipoComando),
                    operando1,Cambio.cambiarBinario(operando1),
                    operando2,Cambio.cambiarBinario(operando2));//crea el objeto comando que es la linea del txt en objeto
            arregloComandos.add(lista);//almacenas los objetos en una arreglo
        }
    }
    /**
     * 
     * @return arreglo de componentes
     */
    public ArrayList<Comando> getArregloComandos() {
        return arregloComandos;
    }
}
