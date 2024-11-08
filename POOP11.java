/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Clase principal que gestiona la creación y manipulación de archivos y 
 * la lista de alumnos.
 * 
 * @autor poo03alu16
 */
public class POOP11 {

    public static void main(String[] args) {
        File archivo = new File("archivo.txt");

        // Verificar si existe
        System.out.println(archivo.exists());

        // Creando el archivo
        try {
            boolean seCreo = archivo.createNewFile();
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("############### FileWriter ###############");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe texto para el archivo: ");
            String texto = br.readLine();
            System.out.println(texto);

            // Escribe o sobreescribe sobre el archivo llamado archivo.txt
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);

            salida.println(texto);
            salida.println("Esta es la segunda Linea");

            for (int i = 0; i < 10; i++) {
                salida.println("Linea " + i);
            }

            for (int i = 0; i < 10; i++) {
                salida.println("Cargando archivo: " + i * 10 + "%");
            }

            salida.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("############### FileReader ###############");

        try {
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es: ");
            
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            fr.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("############### StringTokenizer ###############");

        String alumnoParseado = "Eric Fernando,Soto,Bolaños,321302740,18,3";
        StringTokenizer tokenizador = new StringTokenizer(alumnoParseado, ",");
        while (tokenizador.hasMoreTokens()) {
            System.out.println(tokenizador.nextToken());
        }

        System.out.println("############### Clase alumno ###############");

        // Creando 5 alumnos
        Alumno alumno1 = new Alumno("Alan", "Hernandez", "Flores", 321302740, 19, 3);
        Alumno alumno2 = new Alumno("Halley", "Mendoza", "Sanchez", 321254601, 19, 3);
        Alumno alumno3 = new Alumno("Juan", "Fernandez", "Marquez", 323568532, 20, 4);
        Alumno alumno4 = new Alumno("Jose", "Gonzales", "Gutierrez", 335779423, 18, 1);
        Alumno alumno5 = new Alumno("Maria", "Escalante", "Flores", 323578953, 20, 2);

        ArrayList<Alumno> lista = new ArrayList<>();
        lista.add(alumno1);
        lista.add(alumno2);
        lista.add(alumno3);
        lista.add(alumno4);
        lista.add(alumno5);

        System.out.println(lista);

        System.out.println("\nEscribiendo en el archivo txt\n");

        try {
            FileWriter fw = new FileWriter("alumnos.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);

            for (Alumno alumno : lista) {
                salida.println(alumno);
            }

            salida.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
