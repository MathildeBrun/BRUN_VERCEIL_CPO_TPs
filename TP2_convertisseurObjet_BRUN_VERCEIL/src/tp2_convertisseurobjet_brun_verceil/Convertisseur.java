/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_convertisseurobjet_brun_verceil;

/**
 *
 * @author Mathilde
 */
public class Convertisseur {
    
    int nbConversions;    
    
    public Convertisseur () { 
        nbConversions = 0 ;
    }
    
    public double CelciusVersKelvin (double tCelcius) {
        nbConversions=nbConversions+1;
        return tCelcius += 274.15;
        }
    
    public double KelvinVersCelcius (double tKelvin) {
        nbConversions=nbConversions+1;
        return tKelvin -= 274.15;
        }
    
    public double FarenheitVersCelcius (double tFarenheit) {
        nbConversions=nbConversions+1;
        return tFarenheit = (tFarenheit - 32) / 1.8;
        }
    
    public double CelciusVersFarenheit (double tCelcius) {
        nbConversions=nbConversions+1;
        return tCelcius = (tCelcius*1.8) + 32;
        }
    
    public double KelvinVersFarenheit (double tKelvin) {
        nbConversions=nbConversions+1;
        return tKelvin = CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
        }
    
    public double FarenheitVersKelvin (double tFarenheit) {
        nbConversions=nbConversions+1;
        return tFarenheit = FarenheitVersCelcius (CelciusVersKelvin(tFarenheit));
        }
    
    @Override 
    public String toString () { 
        return "nb de conversions"+ nbConversions;
    }

}

