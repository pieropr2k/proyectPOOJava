/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoPOOGUI;
import java.lang.Math;
/**
 *
 * @author José Tello
 */
public class Stat {
    //calcula la media de los promedios de los alumnos que estan en los primeros lugares
    // This method calculates the media of the student averages who are in the first places
    static float media(Alumno[] alumnos, int n, int vacantes)   
    {
        float suma=0;
        for(int i=n-vacantes; i<n;++i)
        {
            suma+= alumnos[i].promedio;
        }
        return suma/vacantes;
    }
    //calcula la desviacion estandar de los promedios de los alumnos que estan en los primeros lugares
    public static double desv_est(Alumno[] alumnos, float media, int n, int vacantes) 
    {
        float suma=0;
        for(int i=n-vacantes; i<n; ++i)
        {
            suma += Math.pow((double)(alumnos[i].promedio - media), 2)/(vacantes-1);
        }
        return Math.sqrt(suma/vacantes);
    }
    
}

