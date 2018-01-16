package ru.shapovalov.example;

public class ExampleOne {
    //Пример пул строк
    //Так же на эту тему зачем .intern();  в
    // com.sun.org.apache.xerces.internal.impl.XMLScanner:395
    //protected final static String fVersionSymbol = "version".intern();
    //
    // а ответ:
    //
    // It prevents the field being a compile time constant.
    //References to final String fields which are compile time constants are compiled as a literal, not as an access to the field.
    //In the example, if there was no .intern(), anything referencing the library would have to be recompiled when the
    // value of the schema namespace is updated. So the authors added 'intern()', making the value not a compile time constant,
    // so the client code desn't have to be rebuilt whhen the library is updated.
    //
    //Но такое вопрос маловероятен на собеседовании =)

    public static void main(String args[]) {
       String cat1 = "Cat";
       String cat2 = "Cat";

       String cat3 = new String("Cat");
       String cat4 = cat3.intern();
       System.out.println(cat1==cat2);//true
       System.out.println(cat1==cat3);//false
       System.out.println(cat1==cat4);//true
    }
}
