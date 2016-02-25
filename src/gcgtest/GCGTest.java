/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcgtest;

import gcgtest.message.Message;

/**
 *
 * @author Gustavo
 */
public class GCGTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Message msj = new Message("Hello World!!!");
        System.out.println(msj.getMsg());
                
    }
    
}
