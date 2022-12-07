/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_03.Vista;

import Deber_03_03.Control.PeliculaControl;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author Juano
 */
public class Ventana_Prueba extends JFrame implements ActionListener {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;
    private PeliculaControl peliculaControl;

    public Ventana_Prueba(String title) throws HeadlessException {
        this.setTitle("Grid Layout");
        this.setSize(830, 650);
        this.setLocation(300, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarJlabels();
        this.iniciarJComboBox();
        this.iniciarJButtons();
        this.iniciarJTextFields();
        this.iniciarJCheckBox();

        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarPaneles() {
        this.peliculaControl = new PeliculaControl();
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setLayout(null);
        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).setBackground(Color.white);

        this.jPanelList.get(1).setBackground(new Color(0, 102, 153));
        this.jPanelList.get(1).setBorder(new BevelBorder(BevelBorder.RAISED));
        this.jPanelList.get(1).setBounds(new Rectangle(3, 2, 810, 35));

        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(2).setBounds(new Rectangle(15, 45, 300, 30));
        this.jPanelList.get(2).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(9));
        this.jPanelList.get(9).setBounds(new Rectangle(305, 45, 500, 30));
        this.jPanelList.get(9).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(9).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(3).setBounds(new Rectangle(15, 75, 300, 30));
        this.jPanelList.get(3).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(10));
        this.jPanelList.get(10).setBounds(new Rectangle(305, 75, 500, 30));
        this.jPanelList.get(10).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(10).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(4).setBounds(new Rectangle(15, 104, 300, 30));
        this.jPanelList.get(4).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(11));
        this.jPanelList.get(11).setBounds(new Rectangle(305, 104, 500, 30));
        this.jPanelList.get(11).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(11).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(5).setBounds(new Rectangle(15, 134, 300, 30));
        this.jPanelList.get(5).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(15));
        this.jPanelList.get(15).setBounds(new Rectangle(305, 134, 500, 30));
        this.jPanelList.get(15).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(15).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(6).setBounds(new Rectangle(15, 164, 300, 30));
        this.jPanelList.get(6).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(12));
        this.jPanelList.get(12).setBounds(new Rectangle(305, 164, 500, 30));
        this.jPanelList.get(12).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(12).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(7).setBounds(new Rectangle(15, 194, 300, 30));
        this.jPanelList.get(7).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(13));
        this.jPanelList.get(13).setBounds(new Rectangle(305, 194, 500, 30));
        this.jPanelList.get(13).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(13).setBackground(Color.white);

        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(8).setBounds(new Rectangle(15, 224, 300, 30));
        this.jPanelList.get(8).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(0).add(this.jPanelList.get(14));
        this.jPanelList.get(14).setBounds(new Rectangle(305, 224, 500, 30));
        this.jPanelList.get(14).setBorder(new LineBorder(Color.lightGray));
        this.jPanelList.get(14).setBackground(Color.white);
        
        this.jPanelList.get(0).add(this.jPanelList.get(27));
        this.jPanelList.get(0).add(this.jPanelList.get(28));

    }

    public void iniciarJlabels() {
        this.jLabelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();

        this.jLabelList.add(new JLabel("MENU PELICULA"));
        this.jLabelList.get(0).setForeground(Color.white);
        this.jLabelList.get(0).setFont((new Font("Times New Roman", Font.BOLD, 20)));
        this.jPanelList.get(1).add(this.jLabelList.get(0));

        this.jLabelList.add(new JLabel("Codigo de Genero:                                     "));
        this.jLabelList.get(1).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(2).add(this.jLabelList.get(1));

        this.jLabelList.add(new JLabel("Nombre Pelicula:                                        "));
        this.jLabelList.get(2).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(3).add(this.jLabelList.get(2));

        this.jLabelList.add(new JLabel("Año de lanzamiento:                                    "));
        this.jLabelList.get(3).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(4).add(this.jLabelList.get(3));

        this.jLabelList.add(new JLabel("Idioma:                                                        "));
        this.jLabelList.get(4).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(5).add(this.jLabelList.get(4));

        this.jLabelList.add(new JLabel("Clasificacion:                                              "));
        this.jLabelList.get(5).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(6).add(this.jLabelList.get(5));

        this.jLabelList.add(new JLabel("Duracion:                                                   "));
        this.jLabelList.get(6).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(7).add(this.jLabelList.get(6));

        this.jLabelList.add(new JLabel("Reseña Postiva:                                         "));
        this.jLabelList.get(7).setFont((new Font("Times New Roman", Font.BOLD, 15)));
        this.jPanelList.get(8).add(this.jLabelList.get(7));

    }

    public void iniciarJTextFields() {
        this.jTextFieldList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField(20));
        this.jLabelList.add(new JLabel("                                                                           "));
        this.jPanelList.get(18).add(this.jTextFieldList.get(0));
        this.jPanelList.get(18).add(this.jLabelList.get(0));
    }

    public void iniciarJComboBox() {
        this.jLabelList = new ArrayList<>();
        this.jComboBoxList = new ArrayList<>();
        var listaAutorizacion = new String[2];
        listaAutorizacion[0] = "[1]";
        listaAutorizacion[1] = "[2]";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaAutorizacion)));
        this.jComboBoxList.get(0).setBackground(Color.white);
        this.jLabelList.add(new JLabel("                                                                                                                             "));
        this.jPanelList.get(9).add(this.jComboBoxList.get(0));
        this.jPanelList.get(9).add(this.jLabelList.get(0));

        var listaJornada = new String[2];
        listaJornada[0] = "MATUTINA";
        listaJornada[1] = "VESPERTINA";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaJornada)));
        this.jComboBoxList.get(1).setBackground(Color.white);
        this.jLabelList.add(new JLabel("                                                                                                            "));
        this.jPanelList.get(22).add(this.jComboBoxList.get(1));
        this.jPanelList.get(22).add(this.jLabelList.get(1));

        var listaCambio = new String[2];
        listaCambio[0] = "SI";
        listaCambio[1] = "NO";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCambio)));
        this.jComboBoxList.get(2).setBackground(Color.white);
        this.jLabelList.add(new JLabel("                                                                                                                             "));

        this.jPanelList.get(26).add(this.jComboBoxList.get(2));
        this.jPanelList.get(26).add(this.jLabelList.get(2));
    }

    public void iniciarJCheckBox() {

        this.jCheckBoxList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();
        this.jCheckBoxList.add(new JCheckBox("Nuevos"));
        this.jCheckBoxList.get(0).setBackground(Color.white);
        this.jLabelList.add(new JLabel("                                                                                                                        "));
        this.jPanelList.get(24).add(this.jCheckBoxList.get(0));
        this.jPanelList.get(24).add(this.jLabelList.get(0));
    }

    public void iniciarJButtons() {
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.get(0).setFont((new Font("Times New Roman", Font.BOLD, 17)));
        this.jButtonList.get(0).setBackground(new Color(0, 102, 153));
        this.jButtonList.get(0).setForeground(Color.white);
        this.jPanelList.get(27).add(this.jButtonList.get(0));

        this.jButtonList.add(new JButton("Mostrar"));
        this.jButtonList.get(1).setFont((new Font("Times New Roman", Font.BOLD, 17)));
        this.jButtonList.get(1).setBackground(new Color(0, 102, 153));
        this.jButtonList.get(1).setForeground(Color.white);
        this.jPanelList.get(28).add(this.jButtonList.get(1));

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.jButtonList.get(0))) {
            var datos = new String[7];
            datos[0] = this.jTextFieldList.get(0).getText();
            datos[1] = this.jTextFieldList.get(1).getText();
            datos[2] = this.jTextFieldList.get(2).getText();
            datos[3] = this.jTextFieldList.get(3).getText();
            datos[4] = this.jTextFieldList.get(4).getText();
            datos[5] = this.jTextFieldList.get(5).getText();
            datos[6] = this.jTextFieldList.get(6).getText();

            this.peliculaControl.crear(datos);

        }

        if (e.getSource().equals(this.jButtonList.get(1))) {
            System.out.println("--------------------------------");

            for (var pelicula : peliculaControl.Listar()) {
                System.out.println("Pelicula=" + pelicula.toString());

            }
        }
    }

}
