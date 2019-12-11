package br.com.senac.tratamentoDeDados;

import br.com.senac.connection.ArquivoDao;
import br.com.senac.gui.TelaAplicacao;
import lombok.Data;
import lombok.Validate;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

@Data

public class TratamentoCSV {
    public static String caminhoDoArquivo;
    public static ArrayList<Arquivo> listaDeDados = new ArrayList<>();

    public static JFileChooser lerArquivo() throws FileNotFoundException {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Selecionar arquivo...");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".csv, .txt", "csv", "txt");
        fileChooser.setFileFilter(filter);

        return fileChooser;
    }

    public static void subirNaMemoria() throws FileNotFoundException {
        JFileChooser fileChooser = lerArquivo();
        int retorno = fileChooser.showOpenDialog(null);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            File arquivoCSV = fileChooser.getSelectedFile();
//			String caminhoDoArquivo = arquivoCSV.getPath();
            String linhaDoArquivo;
            Scanner arquivoLidoEmTexto = new Scanner(arquivoCSV);
            arquivoLidoEmTexto.nextLine();

            while (arquivoLidoEmTexto.hasNext()) {

                linhaDoArquivo = arquivoLidoEmTexto.nextLine();

                String[] dadosEntreVirgulas = linhaDoArquivo.split(",");
                Arquivo arquivo = new Arquivo();
                if (linhaDoArquivo.contains("Matutino")) {
                    arquivo.setMatutino(arquivo.getMatutino() + 1);
                }
                if (linhaDoArquivo.contains("Noturno")) {
                    arquivo.setNoturno(arquivo.getNoturno() + 1);
                }
                if (linhaDoArquivo.contains("Integral")) {
                    arquivo.setIntegral(arquivo.getIntegral() + 1);
                }
                if (linhaDoArquivo.contains("Solteiro(a)")) {
                    arquivo.setSolteiro(arquivo.getSolteiro() + 1);
                }
                if (linhaDoArquivo.contains("Casado(a)")) {
                    arquivo.setCasado(arquivo.getCasado() + 1);
                }
                if (linhaDoArquivo.contains("Divorciado(a)")) {
                    arquivo.setDivorciado(arquivo.getDivorciado() + 1);
                }
                if (linhaDoArquivo.contains("União Estável")) {
                    arquivo.setUniaoEstavel(arquivo.getUniaoEstavel() + 1);
                }
                arquivo.setTurnoMatricula(dadosEntreVirgulas[0]);
                arquivo.setSituacaoCivilAluno(dadosEntreVirgulas[1]);
                arquivo.setSexoAluno(dadosEntreVirgulas[2]);
                arquivo.setDataCadastroRequerimento(dadosEntreVirgulas[3]);
                arquivo.setMotivoRequerimento(dadosEntreVirgulas[4]);
                arquivo.setTurma(dadosEntreVirgulas[5]);
                arquivo.setAreaTurma(dadosEntreVirgulas[6]);


                listaDeDados.add(arquivo);
                ArquivoDao.inserirNoBanco(arquivo);
            }
            arquivoLidoEmTexto.close();
        }
    }

    public static void adicionarNaTabela() {

        for (int i = 0; i < listaDeDados.size(); i++) {
            String turnoMatricula = listaDeDados.get(i).getTurnoMatricula();
            String situacaoCivil = listaDeDados.get(i).getSituacaoCivilAluno();
            String sexoAluno = listaDeDados.get(i).getSexoAluno();
            String dataCadastroRequerimento = listaDeDados.get(i).getDataCadastroRequerimento();
            String motivoRequerimento = listaDeDados.get(i).getMotivoRequerimento();
            String turma = listaDeDados.get(i).getTurma();
            String areaTurma = listaDeDados.get(i).getAreaTurma();

            Object[] dados = {turnoMatricula, situacaoCivil, sexoAluno, dataCadastroRequerimento, motivoRequerimento,
                    turma, areaTurma};
            TelaAplicacao.defaultTableModel.addRow(dados);
        }
    }
}
