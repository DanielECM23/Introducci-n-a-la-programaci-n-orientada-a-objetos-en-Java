package uniandes.cupi2.sistemapacientes.interfaz;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import uniandes.cupi2.sistemapacientes.mundo.SistemaPacientes; 

public class InterfazSistemaPacientes extends JFrame {
	
    public static void main(String[] args) {
        InterfazSistemaPacientes ventana = new InterfazSistemaPacientes();
        ventana.setVisible(true);
    }
	
    private SistemaPacientes sistema;
    
    private PanelDatosPaciente panelDatosPaciente;
    private PanelDatosMuestra panelDatosMuestra;
    private PanelExtenciones panelExtenciones;

    public InterfazSistemaPacientes() {

        setTitle("Sistema de Pacientes");
        setSize(700, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        sistema = new SistemaPacientes();
        
        panelDatosPaciente = new PanelDatosPaciente();
        panelDatosMuestra = new PanelDatosMuestra();
        panelExtenciones = new PanelExtenciones();
        
        add(panelDatosPaciente, BorderLayout.NORTH);
        add(panelDatosMuestra, BorderLayout.CENTER);
        add(panelExtenciones, BorderLayout.SOUTH);
    }
}
