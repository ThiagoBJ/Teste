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
public class AdapterMonitor extends AdaptadorVga{
    private AdaptadorHdmi adaptadorHdmi;
    
    public AdapterMonitor(AdaptadorHdmi adaptadorHdmi){
        this.adaptadorHdmi = adaptadorHdmi;
    }
    @Override
    public void ligarNoAdaptadorVga(){
        adaptadorHdmi.ligarNoAdaptadorHdmi();
    }
}
