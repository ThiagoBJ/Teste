/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Thiago
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AdaptadorHdmi Hdmi = new AdaptadorHdmi();
        AdaptadorVga Vga = new AdaptadorVga();
        
        AdapterMonitor a = new AdapterMonitor(Hdmi);
        a.ligarNoAdaptadorVga();
        

    }
    
}
