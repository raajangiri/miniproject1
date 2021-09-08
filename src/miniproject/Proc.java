/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;
import miniproject.Io;


/**
 *
 * @author IAmNotIntrovert
 */
public class Proc {
    
    public static void main(String[] args) {
        
        Io io=new Io();
        boolean b;
        char c;
        byte b1;
        short s1;
        int i1;
        long l1;
        double d1;
        String str1;
        //read and display
        io.printMessage("Enter boolean value");
        b=io.readBoolean();
        io.printMessage("Enter a character");
        c=io.readcharacter();
        io.printMessage("Enter byte");
        b1=io.readByte();
        io.printMessage("Enter short");
        s1=io.readShort();
        io.printMessage("Enter integer");
        i1=io.readInt();
        io.printMessage("Enter Long");
        l1=io.readLong();
       
        io.printMessage("Enter string");
        str1=io.readString();
        
        //display values
        io.printMessage("Boolean", b1);
        io.newLine();
        io.printMessage("Character", c);
        io.newLine();
        io.printMessage("Byte", b1);
        io.newLine();
        io.printMessage("Short", s1);
        io.newLine();
        io.printMessage("Integer", i1);
        io.newLine();
        io.printMessage("Long", l1);
       
       
        io.newLine();
        io.printMessage("String", str1);
        
        //Person Test
      
        
    
}
