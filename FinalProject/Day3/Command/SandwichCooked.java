/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalProject.Day3.Command;

import FinalProject.Day3.SandwichStuff.*;

/**
 *
 * @author pokem
 */
public class SandwichCooked implements Work{
    Sandwich sandwich;
    
    public SandwichCooked(Sandwich sandwich){
        this.sandwich = sandwich;
    }
    
    public void execute(){
        sandwich.Cooked();
    }
}
