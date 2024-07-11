import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Procesador {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MenuProcesador miMarco = new MenuProcesador();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MenuProcesador extends JFrame {
    public MenuProcesador() {
        setBounds(500, 300, 550, 400);
        LaminaProcesador miLamina = new LaminaProcesador();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaProcesador extends JPanel {
    JTextPane miArea;

    public LaminaProcesador() {
        setLayout(new BorderLayout());
        JPanel laminaMenu = new JPanel();
        JMenuBar miBarra = new JMenuBar();

        //-------------------------------------
        JMenu fuente = new JMenu("Fuente");
        JMenu estilo = new JMenu("Estilo");
        JMenu tamagno = new JMenu("Tamaño");

        //-------------------------------------
        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem courier = new JMenuItem("Courier");
        courier.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                miArea.setFont(new Font("Verdana", Font.PLAIN, 12));
            }

        });
        JMenuItem verdana = new JMenuItem("Verdana");
        fuente.add(arial);
        fuente.add(courier);
        fuente.add(verdana);

        //-------------------------------------
        JMenuItem negrita = new JMenuItem("Negrita");
        JMenuItem cursiva = new JMenuItem("Cursiva");
        estilo.add(negrita);
        estilo.add(cursiva);

        //-------------------------------------
        JMenuItem tam12 = new JMenuItem("12");
        JMenuItem tam14 = new JMenuItem("14");
        JMenuItem tam16 = new JMenuItem("16");
        JMenuItem tam18 = new JMenuItem("18");
        tamagno.add(tam12);
        tamagno.add(tam14);
        tamagno.add(tam16);
        tamagno.add(tam18);

        //-------------------------------------
        miBarra.add(fuente);
        miBarra.add(estilo);
        miBarra.add(tamagno);
        laminaMenu.add(miBarra);
        add(laminaMenu, BorderLayout.NORTH);

        miArea = new JTextPane();
        add(miArea, BorderLayout.CENTER);
    }
}
