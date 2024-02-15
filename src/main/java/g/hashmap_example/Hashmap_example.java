/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package g.hashmap_example;

import java.util.HashMap;

/**
 *
 * @author zafer
 */
public class Hashmap_example {
    
    public static void main(String[] args) {
        HashMap<String, String> sozluk = new HashMap<String, String>();
        sozluk.put("book", "kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");
        //System.out.println(sozluk.get("book"));
        //sozluk.remove("book");
        //System.out.println(sozluk);
        //System.out.println(sozluk.size());

        for (String item : sozluk.keySet()) {
            System.out.println("Eleman-" + item + " Değer-" + sozluk.get(item));
        }
        
    }
}
