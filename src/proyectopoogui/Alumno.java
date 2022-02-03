/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoPOOGUI;

import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author José Tello
 */
public class Alumno implements Comparable  //Clase alumno
{
    // Attributes from the Alumno object:
    //Todos los alumnos simulados no tiene codigo, solo el usuario
    //Todos los alumnos simulados no tiene codigo, solo el usuario
    String codigo = ""; 
    //Arreglo de todas las notas 
    //Array from all the notes
    float[] notas = new float[10];
    //Variable que acumula el promedio del arreglo de notas
    //Variable that stores the average of the notes array 
    float promedio=0;
    //Variable that stores the lowest note of the student
    float minor_note_value = 21;
    //Variable that stores the lowest note index of the student
    int minor_note_index = 0;
    
    //obtiene el promedio de las 'n' primeras notas ingresadas
    //Obtains the average of the first 'n' notes entered
    void getpromedio(int n)
    {
        //Variable que acumula la suma del arreglo de notas
        //Variable that accumulates the sum of the notes array 
        float suma = 0;
        for(int i=0; i<n; ++i)
        {
            // We evaluate if the note is the lowest, if it is, we store it
            // only we considerate 'PC' exams from 1 to 6, not 'Parcial' and 'Final'
            if (i!=2 && i!=5 && i<8)
            {
                if (notas[i]<minor_note_value){
                    minor_note_value = notas[i];
                    minor_note_index = i;
                }
                
            }
            // NOTE WEIGHTS:
            // We put the respective weight to each note-exam
            if (i==2)
            {
                suma += 2*notas[i];
            }
            else if(i==5)
            {
                suma += 4*notas[i];
            }
            else if(i==9)
            {
                suma+= 6*notas[i];
            }
            else
            {
                suma += notas[i];
            }
            // Here we delete the lowest note to the sum
            if (i==7)
            {
                suma -= minor_note_value;
            }
            
            // STUDENT AVERAGE:
            // These notes are from the PC1, PC2
            if(n<3)
            {
                promedio = suma/ n;
            }
            // We considerate the 'Parcial' note
            if (n>= 3 && n<6)
            {  
                // 'Parcial' note has double weight
                promedio = suma/((n-1) + 2);
            }
            // We considerate the 'Parcial2' note
            if (n>= 6 && n<8)
            {
                // 'Parcial' note has weight 4
                promedio = suma/((n-2) + 2 + 4);
            }
            // We don't considerate the lowest note
            if (n>= 8 && n<10)
            {
                promedio = suma/((n-2) + 2 + 4 - 1);
            }
            if (n==10)
            {
                // 18 = 7 + 2 + 4 + 6 - 1
                //promedio = suma/18;
                promedio = suma/((n-3) + 2 + 4 + 6 - 1);
                // 19 = 7 + 2 + 4 + 6
                //promedio = suma/19;
            }
            
        }
    }
    
    //pide ingresar un codigo al usuario para ser identificado
    //Requests enter a code to the user to be identificated 
    void getcodigo()    
    {
        //Scanner sc = new Scanner(System.in);
        //this.codigo = sc.nextLine();
        boolean isValid = false;
        
        while(isValid == false)
        {
            //System.out.print("\nIngrese su codigo: ");
            //this.codigo = sc.nextLine();
            this.codigo = JOptionPane.showInputDialog("Ingrese su codigo: ");
            if(this.codigo==null)
            {
                //System.out.print("ERROR: Ingrese el código nuevamente");
                JOptionPane.showMessageDialog(null, "ERROR: Ingrese el código nuevamente", "Error", JOptionPane.ERROR_MESSAGE);
                //sc.nextLine();
            }
            else
            {
                isValid = true;
            }
        }
        
    }
    
    
    @Override
    //Sobreescribe el metodo compareTo() para que la comparacion de clases Alumno sea mediante la comparacion de sus promedios
    //Overrides the compareTo() method so that comparison of Alumno classes 
    //is by through the comparison of their averages
    public int compareTo(Object obj)    
    {
        Alumno i = (Alumno)obj;
        if(this.promedio < i.promedio) return -1;
        if(this.promedio > i.promedio) return 1;
        return 0;
    }
}

