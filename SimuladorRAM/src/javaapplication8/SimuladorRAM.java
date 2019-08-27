/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador.ram;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author ser
 */
public class SimuladorRAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, UnsupportedLookAndFeelException {
        // TODO code application logic here
        UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
        Inicio y = new Inicio();
        y.setVisible(true);
    }
}
