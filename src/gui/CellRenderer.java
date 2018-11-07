/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Ben
 */
public class CellRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Wetter w = (Wetter) value;
        JLabel label = new JLabel();
        int colCount = table.getColumnCount();

        if (colCount == 4) {
            switch (column) {
                case 0:
                    label.setText(w.getPlace());
                    break;
                case 1:
                    label.setText("" + w.getSealevel() + "m");
                    break;
                case 2:
                    label.setText("" + w.getTemp() + "°");
                    break;
                case 3:
                    label.setText("" + w.getHumidity() + "%");
            }
        } else {
            switch (column) {
                case 0:
                    label.setText(w.getPlace());
                    break;
                case 1:
                    label.setText("" + w.getTemp() + "°");
                    break;
                case 2:
                    label.setText("" + w.getHumidity() + "%");
            }
        }

        label.setOpaque(true);
        label.setBackground(Color.gray);
        label.setForeground(Color.white);

        if (w.getTemp() > 25 && w.getHumidity() < 20) {
            label.setBackground(Color.yellow);
        }
        if (w.getTemp() < 0 && w.getHumidity() < 30) {
            label.setBackground(Color.blue);
        }
        if (w.getTemp() >= 0 && w.getTemp() <= 25 && w.getHumidity() > 50) {
            label.setBackground(Color.green);
        }

        if (isSelected) {
            label.setBackground(Color.black);
            label.setForeground(Color.white);
        }

        return label;
    }

}
