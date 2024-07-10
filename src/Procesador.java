import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Procesador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuProcesador miMarco=new MenuProcesador();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MenuProcesador extends JFrame{
	public MenuProcesador() {
		setBounds(500,300,550,400);
		LaminaProcesador miLamina=new LaminaProcesador();
		add(miLamina);
		setVisible(true);
	}
}
class LaminaProcesador extends JPanel{
	public LaminaProcesador() {
		setLayout(new BorderLayout());
		JPanel laminaMenu=new JPanel();
		JMenuBar miBarra=new JMenuBar();
		JMenu fuente=new JMenu("Fuente");
		JMenu estilo=new JMenu("Estilo");
		JMenu tamagno=new JMenu("Tamaño");
		miBarra.add(fuente);
		miBarra.add(estilo);
		miBarra.add(tamagno);
		laminaMenu.add(miBarra);
		add(laminaMenu, BorderLayout.NORTH);
	}
}