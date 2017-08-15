/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassManager;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author SuperUser
 */
public class Jsoup1{

    /**
     *
     */
     static String url = "http://www.javatpoint.com";
     
    /**
     *
     * @param address
     * @return
     * @throws java.io.IOException
     */
    public static String scapper(String address)throws IOException{{

                Document doc = Jsoup.connect(address).get();  
                String title = doc.title();          
                return title;
                       

}
}
    public static void main(String args[]) throws IOException{
    String result = scapper(url);
    System.out.println(result);
    }
}