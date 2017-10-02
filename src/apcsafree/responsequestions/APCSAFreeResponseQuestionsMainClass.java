/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcsafree.responsequestions;

/**
 *
 * @author pbibus
 */
public class APCSAFreeResponseQuestionsMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] wordArray = {"wheels", "on", "the", "bus"};
        Page3_RandomStringChooser rsc = new Page3_RandomStringChooser(wordArray);
        for(int k = 0; k < 6; k++){
            System.out.println(rsc.getNext() + " ");
        }
    }
    
}
