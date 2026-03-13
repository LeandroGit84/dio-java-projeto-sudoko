package br.com.dio.ui.custom.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class FinishGAmeButton extends JButton {

    public FinishGAmeButton(final ActionListener actionListener) {
        this.setText("Concluir");
        this.addActionListener(actionListener);

    }
}
