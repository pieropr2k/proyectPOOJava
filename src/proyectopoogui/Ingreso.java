/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoPOOGUI;

import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.text.JTextComponent;
import javax.swing.JOptionPane;
import static proyectoPOOGUI.ProyectoPrueba.notaAñadidaField;

/**
 *
 * @author José Tello
 */
public class Ingreso {
    // In this class we gonna request some dates and 
    // if these are incorrectly tiped, we gonna throw exceptions-errors
    
    // We gonna show this attributes in the app pop-up and in their UI
    static int num_alum;
    static int num_vacants;
    //Pide la nota al usuario de su respectiva practica/examen
    //Requests the note to the user of his respective practice/exam
    //c: we'll fill this textfield and use their content
    static float obtienenota(JTextComponent c)   
    {
        //Boolean value, if it's true we gonna return the 'n' variable
        boolean isValid = false;
        float n = 0;
        //We're gonna check if the note 'n' is between 0 or 20 
        while(isValid==false)
        {
            //Scanner sc = new Scanner(System.in);
            try
            {
                //n = sc.nextFloat();
                //We convert what the textfield contains to a float
                n = Float.parseFloat(c.getText());
                //We empty the textfill content
                //notaAñadida.setText("");
                c.setText("");
                if(n>=0 && n<=20)
                {
                    isValid = true;
                }
                else
                {
                    throw new InputMismatchException();
                    //throw new NumberFormatException();
                    //throw new IllegalArgumentException();
                }
                
            }
            //catch(IllegalArgumentException e)
            catch(InputMismatchException e)
            //catch(NumberFormatException e)
            {
                //System.out.println("El rango de la nota debe ser de 0 a 20!");
                //JOptionPane.showMessageDialog(c, "NO");
                JOptionPane.showMessageDialog(c, "El rango de la nota debe ser de 0 a 20!", "Error", JOptionPane.ERROR_MESSAGE);
                c.requestFocusInWindow() ;
            }
        }
        return n;
    }
    //Requests the number of alumns-users that we will register
    static int num_alum()
    {
        //Scanner sc = new Scanner(System.in);
        //int n=0;
        boolean isValid = false;
        while(isValid == false)
        {
            try {
                //System.out.print("Ingrese numero de alumnos: ");
                //n = sc.nextInt();
                num_alum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de alumnos: "));
                if(num_alum<=1)
                {
                    //throw new InputMismatchException();
                    throw new IllegalArgumentException();
                }
                else
                {   
                    //c.setText(num_alum + "");
                    isValid = true;
                }
            }
            catch (IllegalArgumentException e)
            {   
                JOptionPane.showMessageDialog(null, "Debe ingresar un número ENTERO mayor a 1", "Error", JOptionPane.ERROR_MESSAGE);
            }   
        }
        return num_alum;
    }
    //Requests the number of alumns-users that we will register
    static int num_vac()
    {
        //Scanner sc = new Scanner(System.in);
        //int n=0;
        boolean isValid = false;
        while(isValid == false)
        {
            try {
                num_vacants = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de vacantes: "));
                if(num_vacants<=1)
                {
                    throw new InputMismatchException();
                }
                //Obviously it must be less than the number of students
                else if(num_vacants >= num_alum)
                {
                    throw new IllegalArgumentException();
                }
                else
                {
                    //c.setText(n + " vacantes disponibles");
                    isValid = true;
                }
            }
            catch (InputMismatchException e)
            {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número ENTERO mayor a 1", "Error", JOptionPane.ERROR_MESSAGE);
            }
            catch(IllegalArgumentException e)
            {
                JOptionPane.showMessageDialog(null, "El numero de vacantes debe ser menor al de alumnos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return num_vacants;
    }
    
}

