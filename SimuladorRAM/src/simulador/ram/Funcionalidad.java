package simulador.ram;

import java.util.ArrayList;

/**
 *
 * @author Andrey
 */
public class Funcionalidad {

    public Funcionalidad( ArrayList<Comando> Lista) {
           ArrayList <ArrayList> Resultado = new ArrayList<ArrayList>();
           for(int z=0;z<Lista.size();z++){
            ArrayList <String> Temporal = new ArrayList <String>();
            Temporal.add(Lista.get(z).tipoComandoBinario);
            Temporal.add(Lista.get(z).operando1Binario);
            Temporal.add(Lista.get(z).operando2Binario);
            Resultado.add(Lista);
        }
        System.out.println("Tamaño arreglo:"+Resultado.size());;
        return ;
    }
    
}
