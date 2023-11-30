/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.cole.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author Laptop
 */
public class QuizCole4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Cancion[] canciones = new Cancion[10];
        canciones[0] = new Cancion(1, "unch it", "Roze Don", "2:16", 2023);
        canciones[1] = new Cancion(2, "Outside", "Calvin Harris", "3:30", 2022);
        canciones[2] = new Cancion(3, "Baby", "Lil Baby", "2:45", 2021);
        canciones[3] = new Cancion(4, "Aqui Ta Smoke", "El Alfa", "3:10", 2023);
        canciones[4] = new Cancion(5, "Clarks", "Kartel", "2:50", 2022);
        canciones[5] = new Cancion(6, "Dindon", "Rochy", "3:15", 2023);
        canciones[6] = new Cancion(7, "Boy Boy", "Yaisel", "2:40", 2023);
        canciones[7] = new Cancion(8, "Persia", "Jossef", "3:24", 2023);
        canciones[8] = new Cancion(9, "Bendecido", "El Alfa", "3:15", 2022);
        canciones[9] = new Cancion(10, "El Dueno De Crocky", "El Alfa", "4:10", 2023);
        // Obtener canciones anteriores al pasado
        int anoActual = 2023;
        for (Cancion cancion : canciones) {
            if (cancion.getAnoCreacion() < anoActual) {
                System.out.println(cancion.getTitulo());
            }
        }

        // Obtener musicas al presente
        for (Cancion cancion : canciones) {
            if (cancion.getAnoCreacion() == anoActual) {
                System.out.println(cancion.getTitulo());
            }
        }

        // Obtener musica posteriores al presente
        for (Cancion cancion : canciones) {
            if (cancion.getAnoCreacion() > anoActual) {
                System.out.println(cancion.getTitulo());
            }
        }

        // Obtener la canción de mayor duración
        Cancion cancionMayorDuracion = canciones[0];
        for (Cancion cancion : canciones) {
            if (cancion.getDuracion().compareTo(cancionMayorDuracion.getDuracion()) > 0) {
                cancionMayorDuracion = cancion;
            }
        }
        JOptionPane.showInputDialog(cancionMayorDuracion.getTitulo ());

        // Obtener el autor de la canción en la primera posición
        String autorPrimeraCancion = canciones[0].getAutor();
        System.out.println(autorPrimeraCancion);

        // El resultado de todas las canciones
        for (Cancion cancion : canciones) {
            JOptionPane.showInputDialog("Id: " + cancion.getIdCancion() + ", Titulo: " + cancion.getTitulo() + ", Autor: " + cancion.getAutor() + ", Duracion: " + cancion.getDuracion() + ", year of creation: " + cancion.getAnoCreacion());
            }

    
    
    

        //llamados a los getters y setters en el programa principal
        Cancion cancion = canciones[0];
        System.out.println(cancion.getTitulo());  
        cancion.setTitulo("Spotify le da la Bienvenida ");  
        System.out.println(cancion.getTitulo());  
    }
}

    
    

