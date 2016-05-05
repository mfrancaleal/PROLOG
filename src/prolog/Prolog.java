/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog;

import java.util.Hashtable;
import jpl.*;
import org.jpl7.Query;


/**
 *
 * @author Michel
 */
public class Prolog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        /*String t1 = "consult('fatos.pl')";
        Query q1 = new Query(t1);
        System.out.println( t1 + " " + (q1.hasMoreSolutions() ? "Sucess" : "failed"));
        
        String t2 = "irmao(jose, ana)";
        Query q2 = new Query(t2);
                */

        // Create an instance of the test application
        new Menu();
    }
    
}
