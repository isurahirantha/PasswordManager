
package PassManager;

import java.io.IOException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import sun.misc.BASE64Encoder;
import sun.misc.BASE64Decoder;

public class Encryption {
    
    private static final String ALGO = "AES";
    private final byte[] keyValue;
    
    public Encryption(String key){
        keyValue = key.getBytes();
    }
    
    public  String encryptData(String data) throws IllegalBlockSizeException, BadPaddingException{    
        try{
                Key key = generateKey();
                Cipher c = Cipher.getInstance(ALGO);
                c.init(Cipher.ENCRYPT_MODE, key);
                byte[] encVal = c.doFinal(data.getBytes());
                String encyptedVal = new BASE64Encoder().encode(encVal);
        }catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException ex)
        {
            System.out.println(ex);
        }
        String encyptedVal = null;
        return encyptedVal;

        
    }
    
    public String decryptData(String encryptedData){

        try
        {

                Key key = generateKey();
                Cipher c = Cipher.getInstance(ALGO);
                c.init(Cipher.DECRYPT_MODE, key);
                byte[] decodeVal = new BASE64Decoder().decodeBuffer(encryptedData);
                byte[] decVal = c.doFinal(decodeVal);
                String decryptedVal = new String(decVal);
        }
        catch(NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IOException | IllegalBlockSizeException | BadPaddingException e)
        {
            System.out.println(e);
        }
        String decryptedVal = null;

                
        return decryptedVal;
    }
    
    private   Key generateKey(){
        Key key = new SecretKeySpec(keyValue,ALGO);
        return key;
    }
    
    public static void main(String args[]){
        try
        {
        Encryption enc = new Encryption("1234qwertyuiopas");
        String ecnData = enc.encryptData("Isura");
        System.out.println("Encrption: "+ecnData);
        Encryption dec = new Encryption("1234qwertyuiopas");
        String decDat = enc.decryptData(ecnData);
        System.out.println("Decyption: "+decDat);
        }
        catch(IllegalBlockSizeException | BadPaddingException ex)
        {
        Logger.getLogger(Encryption.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
}
