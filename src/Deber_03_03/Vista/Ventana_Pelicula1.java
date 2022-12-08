/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03_03.Vista;

import Deber_03_03.Control.PeliculaControl;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Juano
 */
public class Ventana_Pelicula1 extends JFrame implements ActionListener {

    private PeliculaControl peliculaControl;
    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;
    public List<JButton> jButtonList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public Ventana_Pelicula1(String title) throws HeadlessException {
        this.setTitle("BorderLayout");
        this.setSize(375, 300);
        this.setLocation(600, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        //this.iniciarJTextFields();
        //this.iniciarJComboBox();
        //this.iniciarJButtons();

        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);

    }

    public void iniciarPaneles() {

        this.peliculaControl = new PeliculaControl();
        
        this.jPanelList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();
        this.jButtonList = new ArrayList<>();
        this.jComboBoxList = new ArrayList<>();
        this.jRadioButtonList = new ArrayList<>();
        this.jCheckBoxList = new ArrayList<>();

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

        this.jButtonList.add(new JButton("Guadar"));
        this.jButtonList.add(new JButton("Listar"));

        this.jTextFieldList.add(new JTextField("", 20));
        this.jTextFieldList.add(new JTextField("", 20));
        this.jTextFieldList.add(new JTextField("", 5));

        this.jLabelList.add(new JLabel("Ingrese el nombre de la pelicula: "));
        this.jLabelList.add(new JLabel("Ingrese el genero: "));
        this.jLabelList.add(new JLabel("Ingrese el año de lanzamiento: "));
        this.jLabelList.add(new JLabel("Ingrese el idioma: "));
        this.jLabelList.add(new JLabel("Ingrese la clasificacion: "));
        this.jLabelList.add(new JLabel("Ingrese la duracion: "));
        this.jLabelList.add(new JLabel("Reseña positiva: "));

        var listaPaises = new String[4];
        listaPaises[0] = "ACCION";
        listaPaises[1] = "COMEDIO";
        listaPaises[2] = "TERROR";
        listaPaises[3] = "ROMANTICA";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaPaises)));

        var ButtonGroup = new ButtonGroup();
        this.jRadioButtonList.add(new JRadioButton("Español"));
        this.jRadioButtonList.add(new JRadioButton("Ingles"));
        this.jRadioButtonList.add(new JRadioButton("Italiano"));

        ButtonGroup.add(this.jRadioButtonList.get(0));
        ButtonGroup.add(this.jRadioButtonList.get(1));
        ButtonGroup.add(this.jRadioButtonList.get(2));

        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));

        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(0).add(this.jComboBoxList.get(0));

        this.jPanelList.get(0).add(this.jLabelList.get(2));
        this.jPanelList.get(0).add(this.jTextFieldList.get(1));

        this.jPanelList.get(0).add(this.jLabelList.get(3));
        this.jPanelList.get(0).add(this.jRadioButtonList.get(0));
        this.jPanelList.get(0).add(this.jRadioButtonList.get(1));
        this.jPanelList.get(0).add(this.jRadioButtonList.get(2));

        var listaClasificacion = new String[4];
        listaPaises[0] = "Qatar";
        listaPaises[1] = "Ecuador";
        listaPaises[2] = "Paises Bajos";
        listaPaises[3] = "Senegal";

        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaPaises)));

        this.jPanelList.get(0).add(this.jLabelList.get(4));
        this.jPanelList.get(0).add(this.jComboBoxList.get(1));

        this.jPanelList.get(0).add(this.jLabelList.get(5));
        this.jPanelList.get(0).add(this.jTextFieldList.get(2));

        this.jCheckBoxList.add(new JCheckBox("SI", true));

        this.jPanelList.get(0).add(this.jLabelList.get(6));
        this.jPanelList.get(0).add(this.jCheckBoxList.get(0));

        this.jPanelList.get(0).add(this.jButtonList.get(0));

        this.jPanelList.get(0).add(this.jButtonList.get(0));
        this.jPanelList.get(0).add(this.jButtonList.get(1));

        this.jButtonList.get(0).addActionListener(this);
        this.jButtonList.get(1).addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.jButtonList.get(0))) {
            var datos = new String[7];

            datos[0] = this.jTextFieldList.get(0).getText();
            datos[1] = this.jComboBoxList.get(0).getSelectedItem().toString();
            datos[2] = this.jTextFieldList.get(1).getText();
            //  datos[3] = this.jRadioButtonList.get(1).getText();

            if (this.jRadioButtonList.get(0).isSelected()) {
                datos[3] = "Español";

            } else {
                if (this.jRadioButtonList.get(1).isSelected()) {
                    datos[3] = "Ingles";
                } else {
                    if (this.jRadioButtonList.get(2).isSelected()) {
                        datos[3] = "Italiano";
                    } else {

                    }
                }
            }
            datos[4] = this.jComboBoxList.get(1).getSelectedItem().toString();
            datos[5] = this.jTextFieldList.get(2).getText();
            datos[6] = this.jCheckBoxList.toString();

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
