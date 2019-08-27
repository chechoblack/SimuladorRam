package simulador.ram;

import java.util.ArrayList;

/**
 *
 * @author Andrey
 */
public class Funcionalidad {

    public Funcionalidad( ArrayList<Comando> Lista) {
         System.out.println("hola mundo");
           ArrayList <ArrayList> Resultado = new ArrayList<ArrayList>();
           for(int z=0;z<Lista.size();z++){
            ArrayList <String> Temporal = new ArrayList <String>();
            Temporal.add(Lista.get(z).tipoComandoBinario);
            System.out.println(Lista.get(z).operando1Binario);
            System.out.println(Lista.get(z).operando2Binario);
        }
        return ;
    }
    
}
