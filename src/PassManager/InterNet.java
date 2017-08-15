/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassManager;

import java.awt.HeadlessException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author SuperUser
 */
public class InterNet {
    public static void main(String args[]){
        boolean tf = netCheck();
        if(tf==false)
            System.out.println("NotConnected");
        else
            System.out.println("Connected");            
    }
    
    public static boolean netCheck(){
        boolean bool;
    Socket sc = new Socket();
    InetSocketAddress addr;
        addr = new InetSocketAddress("www.google.com", 80);
        try
        {
       sc.connect(addr,3000);
            bool = true;
       // System.out.println("OK");
       //javax.swing.JOptionPane.showMessageDialog(null, true);
        }catch(IOException | HeadlessException e){
            bool = false;
         //System.out.println("NO");
        //javax.swing.JOptionPane.showMessageDialog(null, false);       
        }finally{
                try
                {
                sc.close();
                }catch(Exception e)
                {
                
                }
                
                }
    return bool;
    }
}
