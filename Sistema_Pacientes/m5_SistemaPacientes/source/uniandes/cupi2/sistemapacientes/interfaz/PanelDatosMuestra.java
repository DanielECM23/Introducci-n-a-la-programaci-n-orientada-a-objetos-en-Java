package uniandes.cupi2.sistemapacientes.interfaz;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class PanelDatosMuestra extends JPanel{
	
	public PanelDatosMuestra() {
		
		setLayout(new BorderLayout());
		TitledBorder border = BorderFactory.createTitledBorder("Datos del paciente");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
	}
}
