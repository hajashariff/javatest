package com.kgisl.qs1;
public class Static {    
    public Static() {
        System.out.println("Static Constructor");
    }    
    static {
        System.out.println("Static static block");    
    }    
    {
        System.out.println("Static initialisation  block");
    }
}

 class Dynamic extends Static {    
    {
        System.out.println("Dynamic initialisation block");
    }
    static {
        System.out.println("Dynamic static block");
    }

    public Dynamic() {
        System.out.println("Dynamic Constructor");
    }    
    public static void main(String[] args) {
        new Dynamic();    
    }
}