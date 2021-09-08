/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.text.DecimalFormat;

/**
 *
 * @author IAmNotIntrovert
 */
public class Util {
    public static double round( double value ){
      DecimalFormat df=new DecimalFormat("##0.00");
        //double average=100.465;
        double final_average=Double.parseDouble(df.format(value));
        System.out.println(final_average);
        
        return(final_average);
    }
    
}
