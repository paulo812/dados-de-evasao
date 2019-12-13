package br.com.senac.tratamentoDeDados;

import br.com.senac.connection.ArquivoDao;
import br.com.senac.gui.TelaAplicacao;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
                //turnos
                if (linhaDoArquivo.contains("Matutino")) {
                    arquivo.setMatutino(arquivo.getMatutino() + 1);
                }
                if (linhaDoArquivo.contains("Noturno")) {
                    arquivo.setNoturno(arquivo.getNoturno() + 1);
                }
                if (linhaDoArquivo.contains("Integral")) {
                    arquivo.setIntegral(arquivo.getIntegral() + 1);
                }
                //situação civil
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
                //motivos
                if (linhaDoArquivo.contains("Abandono sem Justificativa")) {
                    arquivo.setMotivo1(arquivo.getMotivo1() + 1);
                }
                if (linhaDoArquivo.contains("Adiamento da Programação")) {
                    arquivo.setMotivo2(arquivo.getMotivo2() + 1);
                }
                if (linhaDoArquivo.contains("Alteração de Horário")) {
                    arquivo.setMotivo3(arquivo.getMotivo3() + 1);
                }
                if (linhaDoArquivo.contains("Cancelamento da Programação")) {
                    arquivo.setMotivo4(arquivo.getMotivo4() + 1);
                }
                if (linhaDoArquivo.contains("Cancelamento de Matrícula")) {
                    arquivo.setMotivo5(arquivo.getMotivo5() + 1);
                }
                if (linhaDoArquivo.contains("Dificuldades Financeiras")) {
                    arquivo.setMotivo6(arquivo.getMotivo6() + 1);
                }
                if (linhaDoArquivo.contains("Distância / meio de transporte")) {
                    arquivo.setMotivo7(arquivo.getMotivo7() + 1);
                }
                if (linhaDoArquivo.contains("Incompatibilidade de horário")) {
                    arquivo.setMotivo8(arquivo.getMotivo8() + 1);
                }
                if (linhaDoArquivo.contains("Motivo de Estudo")) {
                    arquivo.setMotivo9(arquivo.getMotivo9() + 1);
                }
                if (linhaDoArquivo.contains("Motivo de Saúde")) {
                    arquivo.setMotivo10(arquivo.getMotivo10() + 1);
                }
                if (linhaDoArquivo.contains("Motivo de Trabalho")) {
                    arquivo.setMotivo11(arquivo.getMotivo11() + 1);
                }
                if (linhaDoArquivo.contains("Motivo de Viagens")) {
                    arquivo.setMotivo12(arquivo.getMotivo12() + 1);
                }
                if (linhaDoArquivo.contains("Mudança de Município")) {
                    arquivo.setMotivo13(arquivo.getMotivo13() + 1);
                }
                if (linhaDoArquivo.contains("Não se adaptou a metodologia")) {
                    arquivo.setMotivo14(arquivo.getMotivo14() + 1);
                }
                if (linhaDoArquivo.contains("Não se identificou com o curso")) {
                    arquivo.setMotivo15(arquivo.getMotivo15() + 1);
                }
                if (linhaDoArquivo.contains("Outros Motivos")) {
                    arquivo.setMotivo16(arquivo.getMotivo16() + 1);
                }
                if (linhaDoArquivo.contains("Transferência de Programação")) {
                    arquivo.setMotivo17(arquivo.getMotivo17() + 1);
                }
                //cursos
                if (linhaDoArquivo.contains("CURSO SUPERIOR DE TECNOLOGIA EM DESIGN GRÁFICO")) {
                    arquivo.setCurso1(arquivo.getCurso1() + 1);
                }
                if (linhaDoArquivo.contains("CURSO SUPERIOR DE TECNOLOGIA EM ESTÉTICA E COSMÉTICA")) {
                    arquivo.setCurso2(arquivo.getCurso2() + 1);
                }
                if (linhaDoArquivo.contains("Curso Superior de Tecnologia em Fotografia")) {
                    arquivo.setCurso3(arquivo.getCurso3() + 1);
                }
                if (linhaDoArquivo.contains("CURSO SUPERIOR DE TECNOLOGIA EM GESTÃO AMBIENTAL")) {
                    arquivo.setCurso4(arquivo.getCurso4() + 1);
                }
                if (linhaDoArquivo.contains("CURSO SUPERIOR DE TECNOLOGIA EM GESTÃO COMERCIAL")) {
                    arquivo.setCurso5(arquivo.getCurso5() + 1);
                }
                if (linhaDoArquivo.contains("Curso Superior de Tecnologia em Gestão da Tecnologia da Informação")) {
                    arquivo.setCurso6(arquivo.getCurso6() + 1);
                }
                if (linhaDoArquivo.contains("Curso Superior de Tecnologia em Jogos Digitais")) {
                    arquivo.setCurso7(arquivo.getCurso7() + 1);
                }
                if (linhaDoArquivo.contains("CURSO SUPERIOR DE TECNOLOGIA EM LOGÍSTICA")) {
                    arquivo.setCurso8(arquivo.getCurso8() + 1);
                }
                if (linhaDoArquivo.contains("Curso Superior de Tecnologia em Segurança da Informação")) {
                    arquivo.setCurso9(arquivo.getCurso9() + 1);
                }
                if (linhaDoArquivo.contains("Oficina: Formação para a Fábrica de Software Metodologias e Arquitetura")) {
                    arquivo.setCurso10(arquivo.getCurso10() + 1);
                }
                if (linhaDoArquivo.contains("PÓS GRADUAÇÃO LATO SENSU EM DESENVOLVIMENTO DE SOFTWARE")) {
                    arquivo.setCurso11(arquivo.getCurso11() + 1);
                }
                if (linhaDoArquivo.contains("Superior de Tecnologia em Análise e Desenvolvimento de Sistemas")) {
                    arquivo.setCurso12(arquivo.getCurso12() + 1);
                }
                //Áreas
                if (linhaDoArquivo.contains("Artes")) {
                    arquivo.setArea1(arquivo.getArea1() + 1);
                }
                if (linhaDoArquivo.contains("Comp p/ CHE")) {
                    arquivo.setArea2(arquivo.getArea2() + 1);
                }
                if (linhaDoArquivo.contains("Design")) {
                    arquivo.setArea3(arquivo.getArea3() + 1);
                }
                if (linhaDoArquivo.contains("Gestäo")) {
                    arquivo.setArea4(arquivo.getArea4() + 1);
                }
                if (linhaDoArquivo.contains("Informática")) {
                    arquivo.setArea5(arquivo.getArea5() + 1);
                }
                if (linhaDoArquivo.contains("Meio Ambiente (Ambiente e Saúde)")) {
                    arquivo.setArea6(arquivo.getArea6() + 1);
                }
                if (linhaDoArquivo.contains("Saúde")) {
                    arquivo.setArea7(arquivo.getArea7() + 1);
                }
                //define variáveis
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
