/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolog.view;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Michel
 */
class HoteisTable extends AbstractTableModel {

    private ArrayList<HotelList> hotel;
    private String[] colunas = {"Nome", "Endereço", "Telefone", "Estrelas", "Suites disponíves", "Status", "Visualizar"};

    public HoteisTable() {
        hotel = new ArrayList<HotelList>();
    }

    public HoteisTable(ArrayList<HotelList> lista) {
        this();
        hotel.addAll(lista);
    }

    @Override
    public int getRowCount() {
        return hotel.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        HotelList h = (HotelList) hotel.get(rowIndex);
        return h;
    }
}
