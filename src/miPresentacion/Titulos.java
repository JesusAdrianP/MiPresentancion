package miPresentacion;

import javax.swing.*;
import java.awt.*;

public class Titulos extends JLabel {
    public Titulos(String titulo, Color colorDeFondo){
        this.setText(titulo);
        this.setBackground(colorDeFondo);
        this.setForeground(Color.white);
        this.setFont(new Font(Font.DIALOG,Font.BOLD+Font.ITALIC, 28));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setOpaque(true);
    }
}
