/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcsafree.responsequestions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pbibus
 */
public class Page3_RandomStringChooser {

    private List list = new ArrayList();

    public Page3_RandomStringChooser(String[] array) {
        for (String word : array) {
            list.add(word);
        }
    }

    public String getNext() {
        if (!list.isEmpty()) {
            int selectedIndex = (int) (Math.random() * list.size());
            String send = list.get(selectedIndex).toString();
            list.remove(selectedIndex);
            return send;
        }
        return "NONE";
    }
}
