package br.com.senac.gui;

import br.com.senac.connection.Conectar;
import br.com.senac.tratamentoDeDados.TratamentoCSV;
import javafx.scene.chart.Chart;
import lombok.SneakyThrows;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;

public class TelaAplicacao {
    private JPanel panelPrincipal;
    private JTable tableDados;
    private JScrollPane panelTable;
    private JButton gerarGráficosButton;
    private JButton carregarCSVButton;
    private JComboBox comboBoxGraficos;
    public static DefaultTableModel defaultTableModel;
    private int linha, coluna;
    private static String header[] = new String[]{"Turno", "Situação Civil", "Sexo", "Data Requerimento", "Motvo", "Turma",
            "Area"};

    public static void criaGrafico(JPanel panelPrincipal) {
        int fatia1 = 2, fatia2 = 4, fatia3 = 0, fatia4 = 0, fatia5 = 0;
        DefaultPieDataset pizza = new DefaultPieDataset();
        pizza.setValue("fatia1", fatia1);
        pizza.setValue("fatia2", fatia2);

        JFreeChart grafico = ChartFactory.createPieChart("Gráfico pizza", pizza, true, true, false);
        ChartPanel chart = new ChartPanel(grafico);
        JFrame frame = new JFrame();
        // frame settings like size, close operation etc.
        JPanel panel = new JPanel();
        // init textfields and buttons
        // add listeners or whatever
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(panel);
        panel.setLayout(layout);
        // layout settings goes here
        frame.add(chart);
        frame.setVisible(true);

        //panelPrincipal.add(chart);
        chart.setVisible(true);
    }

    public TelaAplicacao() {
        //modelagem tabela
        defaultTableModel = new DefaultTableModel(header, 0);
        tableDados.setModel(defaultTableModel);

        carregarCSVButton.addActionListener(new ActionListener() {
            @SneakyThrows
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try {
                    TratamentoCSV.subirNaMemoria();
                    TratamentoCSV.adicionarNaTabela();


                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }

            }
        });
        gerarGráficosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                criaGrafico(panelPrincipal);
            }
        });
        comboBoxGraficos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TelaAplicacao");
        frame.setContentPane(new TelaAplicacao().panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



        //Conexão com BD...
        Conectar conectar = Conectar.getConexao();


    }

}