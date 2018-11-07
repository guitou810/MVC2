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
    private char lettre;
      
    public Discount_Code(char lettre,float pourcentage){
        this.lettre= lettre;
        this.pourcentage=pourcentage;
    }
    
    
    public float GetPourcentage(){
        return pourcentage;
    }
    
    public char GetLettre(){
        return lettre;
    }
}
