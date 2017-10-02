/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcsafree.responsequestions;

/**
 *
 * @author pbibu
 */
public class P5_RLC extends Page3_RandomStringChooser{
    public P5_RLC(String str){
        super(getSingleLetters(str));
    }
    
    public static String[] getSingleLetters(String str){
        int i = 0;
        String[] wordArray = new String[str.length()];
        for(char car : str.toCharArray()){
            wordArray[i++] = car + "";
        }
        return wordArray;
    }
}
