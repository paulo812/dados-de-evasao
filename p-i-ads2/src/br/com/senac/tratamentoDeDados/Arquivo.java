package br.com.senac.tratamentoDeDados;

import br.com.senac.gui.TelaAplicacao;

public class Arquivo {
    private String turnoMatricula;
    private String situacaoCivilAluno;
    private String sexoAluno;
    private String dataCadastroRequerimento;
    private String motivoRequerimento;
    private String turma;
    private String areaTurma;
    private String caminhoDoArquivo;
    private int total = 1235;
    private int contador;
    private int noturno;
    private int matutino;
    private int integral;
    private int casado;
    private int solteiro;
    private int uniaoEstavel;
    private int divorciado;
    private int masculino;
    private int feminino;
    private int motivo1;
    private int motivo2, motivo3, motivo4, motivo5, motivo6, motivo7, motivo8, motivo9, motivo10, motivo11, motivo12;
    private int motivo13, motivo14, motivo15, motivo16, motivo17;
    private int curso1, curso2, curso3, curso4, curso5, curso6, curso7, curso8, curso9, curso10, curso11, curso12;
    private int area1, area2, area3, area4, area5, area6, area7;

    /* MOTIVOS DE CANCELAMENTO:
        motivo1 = Abandono sem Justificativa
        motivo2 = Adiamento da Programação
        motivo3 = Alteração de Horário
        motivo4 = Cancelamento da Programação
        motivo5 = Cancelamento de Matrícula
        motiVO6 = Dificuldades Financeiras
        motivo7 = Distância / meio de transporte
        motivo8 = Incompatibilidade de horário
        motivo9 = Motivo de Estudo
        motivo10 = Motivo de Saúde
        motivo11 = Motivo de Trabalho
        motivo12 = Motivo de Viagens
        motivo13 = Mudança de Município
        motivo14 = Não se adaptou a metodologia
        motivo15 = Não se identificou com o curso
        motivo16 = Outros Motivos
        motivo17 = Transferência de Programação

        CURSOS
        curso1 = CURSO SUPERIOR DE TECNOLOGIA EM DESIGN GRÁFICO
        curso2 = CURSO SUPERIOR DE TECNOLOGIA EM ESTÉTICA E COSMÉTICA
        curso3 =  Curso Superior de Tecnologia em Fotografia
        curso4 = CURSO SUPERIOR DE TECNOLOGIA EM GESTÃO AMBIENTAL
        curso5 = CURSO SUPERIOR DE TECNOLOGIA EM GESTÃO COMERCIAL
        curso6 = Curso Superior de Tecnologia em Gestão da Tecnologia da Informação
        curso7 = Curso Superior de Tecnologia em Jogos Digitais
        curso8 = CURSO SUPERIOR DE TECNOLOGIA EM LOGÍSTICA
        curso9 = Curso Superior de Tecnologia em Segurança da Informação
        curso10 = Oficina: Formação para a Fábrica de Software Metodologias e Arquitetura
        curso11 = PÓS GRADUAÇÃO LATO SENSU EM DESENVOLVIMENTO DE SOFTWARE
        curso12 = Superior de Tecnologia em Análise e Desenvolvimento de Sistemas

        AREAS
        area1 = Artes
        area2 = Comp p/ CHE
        area3 = Design
        area4 = Gestäo
        area5 = Informática
        area6 = Meio Ambiente (Ambiente e Saúde)
        area7 = Saúde
     */

    public int getIntegral() {
        return integral;
    }

    public void setIntegral(int integral) {
        this.integral = integral;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getNoturno() {
        return noturno;
    }

    public void setNoturno(int noturno) {
        this.noturno = noturno;
    }

    public int getMatutino() {
        return matutino;
    }

    public void setMatutino(int matutino) {
        this.matutino = matutino;
    }

    public int getCasado() {
        return casado;
    }

    public void setCasado(int casado) {
        this.casado = casado;
    }

    public int getSolteiro() {
        return solteiro;
    }

    public void setSolteiro(int solteiro) {
        this.solteiro = solteiro;
    }

    public int getUniaoEstavel() {
        return uniaoEstavel;
    }

    public void setUniaoEstavel(int uniaoEstavel) {
        this.uniaoEstavel = uniaoEstavel;
    }

    public int getDivorciado() {
        return divorciado;
    }

    public void setDivorciado(int divorciado) {
        this.divorciado = divorciado;
    }

    public int getMasculino() {
        return masculino;
    }

    public void setMasculino(int masculino) {
        this.masculino = masculino;
    }

    public int getFeminino() {
        return feminino;
    }

    public void setFeminino(int feminino) {
        this.feminino = feminino;
    }

    public int getMotivo1() {
        return motivo1;
    }

    public void setMotivo1(int motivo1) {
        this.motivo1 = motivo1;
    }

    public int getMotivo2() {
        return motivo2;
    }

    public void setMotivo2(int motivo2) {
        this.motivo2 = motivo2;
    }

    public int getMotivo3() {
        return motivo3;
    }

    public void setMotivo3(int motivo3) {
        this.motivo3 = motivo3;
    }

    public int getMotivo4() {
        return motivo4;
    }

    public void setMotivo4(int motivo4) {
        this.motivo4 = motivo4;
    }

    public int getMotivo5() {
        return motivo5;
    }

    public void setMotivo5(int motivo5) {
        this.motivo5 = motivo5;
    }

    public int getMotivo6() {
        return motivo6;
    }

    public void setMotivo6(int motivo6) {
        this.motivo6 = motivo6;
    }

    public int getMotivo7() {
        return motivo7;
    }

    public void setMotivo7(int motivo7) {
        this.motivo7 = motivo7;
    }

    public int getMotivo8() {
        return motivo8;
    }

    public void setMotivo8(int motivo8) {
        this.motivo8 = motivo8;
    }

    public int getMotivo9() {
        return motivo9;
    }

    public void setMotivo9(int motivo9) {
        this.motivo9 = motivo9;
    }

    public int getMotivo10() {
        return motivo10;
    }

    public void setMotivo10(int motivo10) {
        this.motivo10 = motivo10;
    }

    public int getMotivo11() {
        return motivo11;
    }

    public void setMotivo11(int motivo11) {
        this.motivo11 = motivo11;
    }

    public int getMotivo12() {
        return motivo12;
    }

    public void setMotivo12(int motivo12) {
        this.motivo12 = motivo12;
    }

    public int getMotivo13() {
        return motivo13;
    }

    public void setMotivo13(int motivo13) {
        this.motivo13 = motivo13;
    }

    public int getMotivo14() {
        return motivo14;
    }

    public void setMotivo14(int motivo14) {
        this.motivo14 = motivo14;
    }

    public int getMotivo15() {
        return motivo15;
    }

    public void setMotivo15(int motivo15) {
        this.motivo15 = motivo15;
    }

    public int getMotivo16() {
        return motivo16;
    }

    public void setMotivo16(int motivo16) {
        this.motivo16 = motivo16;
    }

    public int getMotivo17() {
        return motivo17;
    }

    public void setMotivo17(int motivo17) {
        this.motivo17 = motivo17;
    }

    public int getCurso1() {
        return curso1;
    }

    public void setCurso1(int curso1) {
        this.curso1 = curso1;
    }

    public int getCurso2() {
        return curso2;
    }

    public void setCurso2(int curso2) {
        this.curso2 = curso2;
    }

    public int getCurso3() {
        return curso3;
    }

    public void setCurso3(int curso3) {
        this.curso3 = curso3;
    }

    public int getCurso4() {
        return curso4;
    }

    public void setCurso4(int curso4) {
        this.curso4 = curso4;
    }

    public int getCurso5() {
        return curso5;
    }

    public void setCurso5(int curso5) {
        this.curso5 = curso5;
    }

    public int getCurso6() {
        return curso6;
    }

    public void setCurso6(int curso6) {
        this.curso6 = curso6;
    }

    public int getCurso7() {
        return curso7;
    }

    public void setCurso7(int curso7) {
        this.curso7 = curso7;
    }

    public int getCurso8() {
        return curso8;
    }

    public void setCurso8(int curso8) {
        this.curso8 = curso8;
    }

    public int getCurso9() {
        return curso9;
    }

    public void setCurso9(int curso9) {
        this.curso9 = curso9;
    }

    public int getCurso10() {
        return curso10;
    }

    public void setCurso10(int curso10) {
        this.curso10 = curso10;
    }

    public int getCurso11() {
        return curso11;
    }

    public void setCurso11(int curso11) {
        this.curso11 = curso11;
    }

    public int getCurso12() {
        return curso12;
    }

    public void setCurso12(int curso12) {
        this.curso12 = curso12;
    }

    public int getArea1() {
        return area1;
    }

    public void setArea1(int area1) {
        this.area1 = area1;
    }

    public int getArea2() {
        return area2;
    }

    public void setArea2(int area2) {
        this.area2 = area2;
    }

    public int getArea3() {
        return area3;
    }

    public void setArea3(int area3) {
        this.area3 = area3;
    }

    public int getArea4() {
        return area4;
    }

    public void setArea4(int area4) {
        this.area4 = area4;
    }

    public int getArea5() {
        return area5;
    }

    public void setArea5(int area5) {
        this.area5 = area5;
    }

    public int getArea6() {
        return area6;
    }

    public void setArea6(int area6) {
        this.area6 = area6;
    }

    public int getArea7() {
        return area7;
    }

    public void setArea7(int area7) {
        this.area7 = area7;
    }

    public Arquivo() {

    }

    public String getTurnoMatricula() {
        return turnoMatricula;
    }

    public void setTurnoMatricula(String turnoMatricula) {
        this.turnoMatricula = turnoMatricula;
    }

    public String getSituacaoCivilAluno() {
        return situacaoCivilAluno;
    }

    public void setSituacaoCivilAluno(String situacaoCivilAluno) {
        this.situacaoCivilAluno = situacaoCivilAluno;
    }

    public String getSexoAluno() {
        return sexoAluno;
    }

    public void setSexoAluno(String sexoAluno) {
        this.sexoAluno = sexoAluno;
    }

    public String getDataCadastroRequerimento() {
        return dataCadastroRequerimento;
    }

    public void setDataCadastroRequerimento(String dataCadastroRequerimento) {
        this.dataCadastroRequerimento = dataCadastroRequerimento;
    }

    public String getMotivoRequerimento() {
        return motivoRequerimento;
    }

    public void setMotivoRequerimento(String motivoRequerimento) {
        this.motivoRequerimento = motivoRequerimento;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getAreaTurma() {
        return areaTurma;
    }

    public void setAreaTurma(String areaTurma) {
        this.areaTurma = areaTurma;
    }

    public String getCaminhoDoArquivo() {
        return caminhoDoArquivo;
    }

    public void setCaminhoDoArquivo(String caminhoDoArquivo) {
        this.caminhoDoArquivo = caminhoDoArquivo;
    }

    public void incrementaContador(){
        this.contador += 1;
    }



}
