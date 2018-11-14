/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOO;

/**
 *
 * @author pedago
 */
public class Discount_Code {
    private float pourcentage ;
    private String lettre;
      
    public Discount_Code(String l,float pourcentage){
        this.lettre= l;
        this.pourcentage=pourcentage;
    }
    
    
    public float getPourcentage(){
        return this.pourcentage;
    }

    public String getLettre() {
        return this.lettre;
        }
    
    

}
