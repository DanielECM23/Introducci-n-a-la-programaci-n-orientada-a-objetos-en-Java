package uniandes.cupi2.sistemapacientes.interfaz;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelDatosPaciente extends JPanel {

    private JLabel lblNombre;
    private JLabel lblEdad;
    private JLabel lblGenero;
    private JLabel lblIdentificacion;
    private JLabel lblDireccion;
    private JLabel lblTelefono;

    private JLabel lblFoto;

    public PanelDatosPaciente() {

        setLayout(new BorderLayout());

        TitledBorder border = BorderFactory.createTitledBorder("Datos del paciente");
        border.setTitleColor(Color.BLUE);
        setBorder(border);

        JPanel panelInformacion = new JPanel();
        JPanel panelFoto = new JPanel();

        add(panelInformacion, BorderLayout.CENTER);
        add(panelFoto, BorderLayout.EAST);

        panelInformacion.setLayout(new GridLayout(6, 2));

        lblNombre = new JLabel("Nombre:");
        panelInformacion.add(lblNombre);
        panelInformacion.add(new JLabel("")); 

        lblEdad = new JLabel("Edad:");
        panelInformacion.add(lblEdad);
        panelInformacion.add(new JLabel(""));

        lblGenero = new JLabel("Género:");
        panelInformacion.add(lblGenero);
        panelInformacion.add(new JLabel(""));

        lblIdentificacion = new JLabel("Identificación:");
        panelInformacion.add(lblIdentificacion);
        panelInformacion.add(new JLabel(""));

        lblDireccion = new JLabel("Dirección:");
        panelInformacion.add(lblDireccion);
        panelInformacion.add(new JLabel(""));

        lblTelefono = new JLabel("Teléfono:");
        panelInformacion.add(lblTelefono);
        panelInformacion.add(new JLabel(""));

        lblFoto = new JLabel("FOTO");
        lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
        lblFoto.setVerticalAlignment(SwingConstants.CENTER);
        lblFoto.setPreferredSize(new Dimension(100, 120));
        panelFoto.add(lblFoto);
    }
}
