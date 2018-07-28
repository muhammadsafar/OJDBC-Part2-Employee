/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author MUHAMMAD BIN ZANDRA
 */
public class Validation {
    
    public boolean isNumber(String input){
        char put[] = input.toCharArray();
        for (char c : put) {
            if ((int) c < 49 || (int) c > 57) {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkLength(String input, int length){

        return input.length() <= length; 
    }
}
