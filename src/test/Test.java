package test;
import miniproject.Io;
import classes.Person;
import classes.Student;
import java.text.DecimalFormat;
import miniproject.Global;
public class Test {
    public static void main(String[] args) {
        /*
        IO io=new IO();
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
        c=io.readCharacter();
        io.printMessage("Enter byte");
        b1=io.readByte();
        io.printMessage("Enter short");
        s1=io.readShort();
        io.printMessage("Enter integer");
        i1=io.readInteger();
        io.printMessage("Enter Long");
        l1=io.readLong();
        io.printMessage("Enter double");
        d1=io.readDouble();
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
        io.printMessage("Double", d1);
        io.newLine();
        io.printMessage("String", str1);
        
        //Person Test
        Person p=new Person();
        IO io=new IO();
        io.printMessage("Enter id : ");
        p.setId(io.readInteger());
        io.printMessage("Enter fullname : ");
        p.setFullName(io.readString());
        io.printMessage(p.toString());
        */
        
        //create an object Student class
        //read all values
        int id=1;
        String name="", grade="";
        char section='A';
        double m1=0, m2=0, m3=0, m4=0;
        //read values
        Io io=new I0();
        Student []students=new Student[Global.MAX_STUDENTS];
        for(int i=0; i<2; i++){
            System.out.println("Student "+(i+1)+" Details");
            io.printMessage("Enter id ");
            id=io.readInt();
            io.printMessage("Enter name");
            name=io.readString();
            io.printMessage("Enter grade");
            grade=io.readString();
            io.printMessage("Enter section");
            section=io.readcharacter();
            io.printMessage("Enter Mark-1");
            m1=io.readDouble();
            io.printMessage("Enter Mark-2");
            m2=io.readDouble();
            io.printMessage("Enter Mark-3");
            m3=io.readDouble();
            io.printMessage("Enter Mark-4");
            m4=io.readDouble();
            Student s=new Student(id, name, grade, section, m1, m2, m3, m4);
            students[i]=s;
        }
        //Process
        for(int i=0; i<2; i++){
            Student s=students[i];
            s.prucessResult();
            students[i]=s;
        }
        
        //print
        for(int i=0; i<2; i++){
            Student s=students[i];
            System.out.println(s);
        }