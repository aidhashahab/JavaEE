
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class SevereExample {
    
    
    Logger log = Logger.getLogger(SevereExample.class.getName());
    double aNumber;

    public SevereExample() {
    }

    public SevereExample(double aNumber) {
        this.aNumber = aNumber;
    }
 
    
    double divide (int divider){
        log.info("Mulai memproses");
        if(aNumber==0)
            log.warning("Angka yang dibagi masih default");
        if(divider==0)
            log.severe("Pembagi dengan 0. Danger!!!");
    return this.aNumber/divider;    
    }
}
