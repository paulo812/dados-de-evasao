package br.com.senac.gui;

import br.com.senac.connection.ArquivoDao;
import br.com.senac.connection.Conectar;
import br.com.senac.tratamentoDeDados.Arquivo;
import br.com.senac.tratamentoDeDados.TratamentoCSV;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAplicacao {
    private JPanel panelPrincipal;
    private JPanel panelBtn;
    private JPanel panelDados;
    private JTable tableDados;
    private JScrollPane panelTable;
    private JButton resetarBdButton;
    private JButton carregarCSVButton;
    private JComboBox comboBoxGraficos;
    private JTextArea textArea;
    public static DefaultTableModel defaultTableModel;
    private int linha, coluna;
    private static String header[] = new String[]{"Turno", "Situação Civil", "Sexo", "Data Requerimento", "Motivo", "Turma",
            "Area"};

    public TelaAplicacao() {
        //modelagem tabela
        defaultTableModel = new DefaultTableModel(header, 0);
        tableDados.setModel(defaultTableModel);

        carregarCSVButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try {
                    TratamentoCSV.subirNaMemoria();
                    TratamentoCSV.adicionarNaTabela();
                    addTextoEstatistico();


                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }

            }
        });
        resetarBdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ArquivoDao.resetarBancoDeDados();
            }
        });
        comboBoxGraficos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }
    public void addTextoEstatistico(){
        Arquivo a = new Arquivo();
        textArea.setText("Total de Alunos evadidos do período noturno" + a.getNoturno());
    }



    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException,
            InstantiationException, IllegalAccessException {
        JFrame frame = new JFrame("TelaAplicacao");
        frame.setContentPane(new TelaAplicacao().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());



        //Conexão com BD...
        Conectar.getConexao();


    }

}