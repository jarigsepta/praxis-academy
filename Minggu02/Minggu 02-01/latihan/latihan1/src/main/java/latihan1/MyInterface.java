/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;
public class MyInterface implements MyInterface2{
public void run()
        {
            System.out.println("Tes");
        }
/**
 *
 * @author jarig
 */
public static void main(String[] args) {
    MyInterface a = new MyInterface();    
    a.doIt();
    MyInterface2.doItStatically();
}
}