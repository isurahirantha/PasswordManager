/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassManager;

/**
 *
 * @author SuperUser
 */
public class InputValidater {
    
    public static void main(String args[]){
        String name = "Isura";
        String fname = "Hirantha";
        String age = "55";
        String home = " ";
        String val[]={name,fname,age,home};
        System.out.println("\tValidater");
        
        boolean tf = validate(val);
        if(tf==true){
        System.out.println(tf+" error found");
        }

    }
    

    
    public static boolean validate(String inputs[])
    {
        //value.isEmpty()||value.equals("")||value.length()==0
        boolean truefalse = false;
        for(String value : inputs)
        {
            if(value.isEmpty()||value.equals("")||value.length()==0||value.trim().length()==0)
            {
                   truefalse = true;  
                   //System.out.println("Error at"+value);
            }else
            {
                   //System.out.println("OK");
                   truefalse =false;
            }
        }
        return truefalse;
    }

}
