/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ben
 */
public class WetterModel extends AbstractTableModel {
    private ArrayList<Wetter> wetterstationen = new ArrayList<>();
    private ArrayList<String> cols = new ArrayList<>();
    
    @Override
    public int getRowCount() {
        return wetterstationen.size();
    }

    @Override
    public int getColumnCount() {
        return cols.size();
    }

    @Override
    public String getColumnName(int column) {
        return cols.get(column); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void add(Wetter w){
        wetterstationen.add(w);
        fireTableDataChanged();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       return wetterstationen.get(rowIndex);
    }
    
    public void initCols(){
        cols.add("Place");
        cols.add("Sea Level");
        cols.add("Temperatur");
        cols.add("rel. Humidity");
        fireTableStructureChanged();
    }
    
}
