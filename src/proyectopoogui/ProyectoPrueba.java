/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoPOOGUI;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author LENOVO
 */
public class ProyectoPrueba extends javax.swing.JFrame {
    
    static Random rand = new Random();
    static int n=0;   //Numero de alumnos postulantes
    static int vacantes=0;    //Numero de vacantes
    static Alumno[] postulantes;
    static String COD;

    /**
     * Creates new form ProyectoPrueba
     */
    public ProyectoPrueba() {
        initComponents();
        totalAlumnosField.setText(Ingreso.num_alum + "");
        vacantesLabel.setText("El número de vacantes disponibles es " + Ingreso.num_vacants);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bienvenidaLabel = new javax.swing.JLabel();
        notaSeleccionadaLabel = new javax.swing.JLabel();
        listaNotas = new javax.swing.JComboBox<>();
        notaSeleccionadaField = new javax.swing.JTextField();
        añadirNotaLabel = new javax.swing.JLabel();
        notaAñadidaField = new javax.swing.JTextField();
        añadirNota = new javax.swing.JButton();
        ingresoFinalField = new javax.swing.JTextField();
        ingresoFinalLabel = new javax.swing.JLabel();
        promedioTotalLabel = new javax.swing.JLabel();
        promedioTotalField = new javax.swing.JTextField();
        puestoLabel = new javax.swing.JLabel();
        puestoField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalAlumnosLabel = new javax.swing.JLabel();
        totalAlumnosField = new javax.swing.JTextField();
        vacantesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de notas CEPRE UNI");
        setBackground(new java.awt.Color(255, 51, 51));

        bienvenidaLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bienvenidaLabel.setText("Bienvenido al sistema de notas de Cepre UNI");

        notaSeleccionadaLabel.setText("Seleccione el nombre del examen para ver su nota respectiva:");

        listaNotas.setBackground(new java.awt.Color(255, 255, 153));
        listaNotas.setEnabled(false);
        listaNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaNotasActionPerformed(evt);
            }
        });

        notaSeleccionadaField.setEditable(false);
        notaSeleccionadaField.setBackground(new java.awt.Color(255, 255, 153));
        notaSeleccionadaField.setText("Ingrese su nota primero");
        notaSeleccionadaField.setFocusable(false);

        añadirNotaLabel.setText("Ingrese nota de la PC1:");

        notaAñadidaField.setBackground(new java.awt.Color(255, 255, 153));
        notaAñadidaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                notaAñadidaFieldKeyTyped(evt);
            }
        });

        añadirNota.setBackground(new java.awt.Color(255, 153, 102));
        añadirNota.setText("Añadir al Registro");
        añadirNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirNotaActionPerformed(evt);
            }
        });

        ingresoFinalField.setEditable(false);
        ingresoFinalField.setBackground(new java.awt.Color(255, 255, 153));
        ingresoFinalField.setText("Sale al final");
        ingresoFinalField.setOpaque(false);

        ingresoFinalLabel.setText("Ingreso:");

        promedioTotalLabel.setText("Promedio Total: ");

        promedioTotalField.setEditable(false);
        promedioTotalField.setBackground(new java.awt.Color(255, 255, 153));
        promedioTotalField.setText("Ingrese su nota");
        promedioTotalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promedioTotalFieldActionPerformed(evt);
            }
        });
        promedioTotalField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                promedioTotalFieldKeyTyped(evt);
            }
        });

        puestoLabel.setText("Puesto General:");

        puestoField.setEditable(false);
        puestoField.setBackground(new java.awt.Color(255, 255, 153));
        puestoField.setText("Ingrese su nota");
        puestoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puestoFieldActionPerformed(evt);
            }
        });
        puestoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                puestoFieldKeyTyped(evt);
            }
        });

        jLabel1.setText("Examen:");

        jLabel2.setText("Nota:");

        jLabel3.setText("La PC7 de Humanidades no se puede eliminar.");

        totalAlumnosLabel.setText("Numero de alumnos:");

        totalAlumnosField.setEditable(false);
        totalAlumnosField.setBackground(new java.awt.Color(255, 255, 153));
        totalAlumnosField.setText("Ingrese su nota");
        totalAlumnosField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalAlumnosFieldActionPerformed(evt);
            }
        });
        totalAlumnosField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                totalAlumnosFieldKeyTyped(evt);
            }
        });

        vacantesLabel.setText("n vacantes disponibles");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ingresoFinalLabel)
                                .addGap(26, 26, 26)
                                .addComponent(ingresoFinalField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(añadirNota)
                            .addComponent(bienvenidaLabel)
                            .addComponent(notaSeleccionadaLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(añadirNotaLabel)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(notaAñadidaField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(listaNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(notaSeleccionadaField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(promedioTotalLabel)
                                    .addComponent(puestoLabel)
                                    .addComponent(totalAlumnosLabel)
                                    .addComponent(vacantesLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(promedioTotalField)
                                    .addComponent(puestoField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalAlumnosField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(bienvenidaLabel)
                .addGap(30, 30, 30)
                .addComponent(notaSeleccionadaLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(notaSeleccionadaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(promedioTotalLabel)
                    .addComponent(promedioTotalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puestoLabel)
                    .addComponent(puestoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAlumnosLabel)
                    .addComponent(totalAlumnosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(vacantesLabel)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadirNotaLabel)
                    .addComponent(notaAñadidaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(añadirNota)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresoFinalLabel)
                    .addComponent(ingresoFinalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // We gonna increase this value after we register a note-practice
    private int count = 0;
    //Bucle que se repite por cada practica que de el postulante 
    //This events's gonna be ejecuted as a loop for each practice that the candidate register
    private void añadirNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirNotaActionPerformed
        // TODO add your handling code here:
        // When we add the first note 'PC1', the 'listaNotas' options tag
        // will be enabled to use
        listaNotas.setEnabled(true);
        // To generate all the notes of each participant-student
        genera_notas(count, n, postulantes, COD);
        // To add the name of each exam to the 'listaNotas' options tag
        listaNotas.addItem(nombreExamen(count)[0]);
        // Shows what happens in each exam in a pop-up
        salida(count, n, postulantes, COD);
        añadirNotaLabel.setText(nombreExamen(count+1)[1]);
        count++;
        // When we have registered all the exams, the add note's elements will be disabled
        if(count==10) {
            añadirNota.setEnabled(false);
            notaAñadidaField.setEnabled(false);
        }
    }//GEN-LAST:event_añadirNotaActionPerformed

    private void listaNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaNotasActionPerformed
        // TODO add your handling code here:
        //Bucle que busca al alumno con el codigo puesto anteriormente
        //Loop that searches to the student with the code COD posted before
        for(int j=0; j<n; ++j)
            {
                if(postulantes[j].codigo == COD) 
                {
                    // Set the text from 'notaSeleccionadaField' when we change
                    // the value from the 'listaNotas' option tag to a note.
                    // The note depends on the option's index
                    notaSeleccionadaField.setText(postulantes[j].notas[listaNotas.getSelectedIndex()]+"");
                }
            }
    }//GEN-LAST:event_listaNotasActionPerformed

    private void notaAñadidaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_notaAñadidaFieldKeyTyped
        // TODO add your handling code here:
        char c = evt .getKeyChar();
        if (c!='0' && c!='1' && c!='2' && c!='3' && c!='4' && c!='5' && c!='6' && c!='7' && c!='8' && c!='9' && c!='.' && c!='+' && c!='-') evt.consume() ;
    }//GEN-LAST:event_notaAñadidaFieldKeyTyped

    private void promedioTotalFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_promedioTotalFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_promedioTotalFieldKeyTyped

    private void promedioTotalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promedioTotalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promedioTotalFieldActionPerformed

    private void puestoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puestoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_puestoFieldActionPerformed

    private void puestoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_puestoFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_puestoFieldKeyTyped

    private void totalAlumnosFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalAlumnosFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalAlumnosFieldActionPerformed

    private void totalAlumnosFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalAlumnosFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_totalAlumnosFieldKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProyectoPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        // Firstly we request this data
        n = Ingreso.num_alum();
        vacantes = Ingreso.num_vac();
        
        //Alumno[] postulantes = new Alumno[n];
        //Crea n clases de tipo Alumno.java
        //Creates n Alumno.java type classes
        postulantes = new Alumno[n];
        //Inicializa al primer elemento del arreglo de Alumnos como la clase perteneciente al usuario
        //Initializes the first Alumnos array element as the class that belongs to the user
        postulantes[0] = new Alumno();
        //Obtiene codigo del usuario
        //Obtains the user's code
        postulantes[0].getcodigo();    
        //Guarda el codigo para buscar al usuario en el arreglo ordenado por notas que se generara despues
        //Saves the code to search the user in the array sorted by notes that will be generated later
        COD = postulantes[0].codigo;     
        // We put these data to te app UI in the ProyectoPrueba class
        
        //Inicializa los siguientes n-1 Alumnos 
        //Initializes the following n-1 Alumnos
        for(int i=1; i<n;++i)
        {
            postulantes[i] = new Alumno();
        }
        
        
        /*for(int i=0; i<10; ++i)     //Bucle que se repite por cada practica que de el postulante 
        {
            genera_notas(i, n, postulantes, COD);
            salida(i, n, postulantes, COD);
            
        }*/
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoPrueba().setVisible(true);
            }
        });
    }
    
    static void genera_notas(int i, int n, Alumno[] postulantes, String COD)
    {
            //Bucle que genera una nota aleatoria para cada postulante simulado
            //Loop that generates an aleatory note for each simulated candidate
            for(int j=0; j<n; ++j)     
            {
                //Busca la clave del usuario para obtener su nota 
                //Search who user matches his code with the COD variable, all to obtain their note
                if(postulantes[j].codigo == COD)
                {
                    
                    postulantes[j].notas[i] = Ingreso.obtienenota(notaAñadidaField);
                }
                else
                {
                    // Random note to the users who dosen't match his code with the variable
                    postulantes[j].notas[i] =rand.nextInt(21);  //nota aleatoria
                }
                // obtiene la nota promedio del estudiante 'j'
                // Gets the average note from the student 'j'
                postulantes[j].getpromedio(i+1);
            }
            //Utiliza el metodo sort() de Arrays para ordenar el arreglo de postulantes segun sus notas
            //Uses the sort() method from Arrays to sort the candidates according to their notes
            Arrays.sort(postulantes);

    }
    
    static String[] nombreExamen(int k){
        //Este array tiene lo que tendra el Label y los elementos del Checkbox de notas: 2 elementos
        //This array contains what the Label and the Checkbox element of the notes will have
        String nombreExamen = "", label = "";
        if (k < 2) {
            nombreExamen = "PC"+(k+1);
            label = "Ingrese nota de la PC" + (k + 1);
        }
        if (k > 2 && k < 5) {
            nombreExamen = "PC"+(k);
            label = "Ingrese nota de la PC" + (k);
        }
        if (k > 5 && k < 9) {
            nombreExamen = "PC"+(k-1);
            label = "Ingrese nota de la PC" + (k - 1);
        }
        if (k == 2) {
            nombreExamen = "Parcial 1";
            label = "\nIngrese nota del 1er Examen Parcial (PESO 2)";
        }
        if (k == 5) {
            nombreExamen = "Parcial 2";
            label = "Ingrese nota del 2do Examen Parcial (PESO 4)";
                }
        if (k == 9) {
            nombreExamen = "Final";
            label = "Ingrese nota del Examen Final (PESO 6)";
        }
        String[] arr = new String[2];
        arr[0] = nombreExamen;
        arr[1] = label;
        return arr;
    }
    
    // i: Number of exam
    // n: Total number of exams
    // postulantes: array of students-candidates
    // COD: user's code
    // This method's gonna show what happens in each exam in a pop-up
    static void salida(int i, int n, Alumno[] postulantes, String COD)
    {
        // To approx the numbers to 3 digits
        NumberFormat num = NumberFormat.getNumberInstance();
        num.setMinimumFractionDigits(3);
        
        for(int k=0; k<n;++k)
        {
            // Busca los datos del usuario en el arreglo de postulantes
            // Search the user data in the array of candidates
            if(postulantes[k].codigo == COD)
                {
                    // This string's gonna be showed in the pop-up
                    String datosASaberPostulante="";
                    // Shows the user's place and average on this fields
                    puestoField.setText((n-k)+"");
                    promedioTotalField.setText(num.format(postulantes[k].promedio)+"");
                    // Fill the string with what happens in each exam
                    datosASaberPostulante+= "\nCodigo: " + COD;
                    datosASaberPostulante+= "\nPromedio: " + num.format(postulantes[k].promedio);
                    datosASaberPostulante+= "\nPuesto: " + (n-k);  
                    datosASaberPostulante+= "\nNumero total de inscritos: " + Ingreso.num_alum;
                    datosASaberPostulante+= "\nMejor promedio: " + num.format(postulantes[n-1].promedio);
                    
                    // Tells about the lowest 'PC' note to delete before the PC7
                    if(i==7)
                    {
                        datosASaberPostulante+= 
                                "\nSe elimina la nota: " + num.format(postulantes[k].minor_note_value)
                                +" de la " + nombreExamen(postulantes[k].minor_note_index)[0];
                    }
                    
                    // En caso de que el usuario no este entre los primeros alumnos:
                    // In case the user is not between the first places to get a vacant
                    // user-avg < minimum_avg-able-to-get-a-vacant
                    if(postulantes[k].promedio < postulantes[n-vacantes].promedio) 
                    {
                        // When we registered all the exams the app stops
                        // putting the hope to get a vacant
                        if(i!=9)
                        {
                            // Hope to get a vacant
                            datosASaberPostulante+="\nPara alcanzar una vacante, debe superar el promedio " + postulantes[n-vacantes].promedio;
                        }   
                        else
                        {
                            datosASaberPostulante+="\nNO ALCANZO VACANTE";
                            ingresoFinalField.setText("NO ALCANZO VACANTE");
                        }
                        
                        
                    }
                    // In case the user is between the first places to get a vacant
                    else    //En caso que el usuario se encuentre entre los primeros alumnos:
                    {
                        if(i!=9)
                        {
                            //Obtiene la media de los promedios de los primeros estudiantes
                            //Obtains the media of the averages of the first places to get a vacant
                            float media = Stat.media(postulantes, n, vacantes);
                            //Obtiene la desviacion estandar de los promedios de los primeros alumnos
                            //Obtiene the standard deviation of the averages of the first places to get a vacant
                            double desv_est= Stat.desv_est(postulantes, media, n, vacantes);
                            //Tells you what range you have to be in
                            //to still be able to get a vacant
                            datosASaberPostulante+="\nPara mantenerse debe mantener una nota en el rango de [";
                            datosASaberPostulante+=num.format(media - 2*desv_est) + "; " + num.format(media + 2*desv_est) + "]";
                        }   
                        else    
                        {
                            datosASaberPostulante+="\nALCANZO VACANTE";
                            ingresoFinalField.setText("ALCANZO VACANTE");
                        }
                    }
                    JOptionPane.showMessageDialog(null, datosASaberPostulante);
                }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirNota;
    private javax.swing.JLabel añadirNotaLabel;
    private javax.swing.JLabel bienvenidaLabel;
    private static javax.swing.JTextField ingresoFinalField;
    private javax.swing.JLabel ingresoFinalLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> listaNotas;
    public static javax.swing.JTextField notaAñadidaField;
    private javax.swing.JTextField notaSeleccionadaField;
    private javax.swing.JLabel notaSeleccionadaLabel;
    public static javax.swing.JTextField promedioTotalField;
    private javax.swing.JLabel promedioTotalLabel;
    public static javax.swing.JTextField puestoField;
    private javax.swing.JLabel puestoLabel;
    public static javax.swing.JTextField totalAlumnosField;
    private javax.swing.JLabel totalAlumnosLabel;
    private static javax.swing.JLabel vacantesLabel;
    // End of variables declaration//GEN-END:variables
}
