package org.example;

import javax.imageio.IIOException;
import java.io.IOException;

public class MainE2 {
    public static void main(String[] args) {

        LeerArchivo2 lectura = new LeerArchivo2();
        try {
        lectura.metodoUno("datos2.txt");
    }catch (IOException e){
            e.printStackTrace();
        }


        }
}