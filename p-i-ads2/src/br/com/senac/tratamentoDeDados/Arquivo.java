package br.com.senac.tratamentoDeDados;


public class Arquivo {
    private String turnoMatricula;
    private String situacaoCivilAluno;
    private String sexoAluno;
    private String dataCadastroRequerimento;
    private String motivoRequerimento;
    private String turma;
    private String areaTurma;
    private String caminhoDoArquivo;
    private int id = 1;

    public Arquivo(String turnoMatricula, String situacaoCivilAluno, String sexoAluno, String dataCadastroRequerimento,
                   String motivoRequerimento, String turma, String areaTurma, String caminhoDoArquivo) {
        this.turnoMatricula = turnoMatricula;
        this.situacaoCivilAluno = situacaoCivilAluno;
        this.sexoAluno = sexoAluno;
        this.dataCadastroRequerimento = dataCadastroRequerimento;
        this.motivoRequerimento = motivoRequerimento;
        this.turma = turma;
        this.areaTurma = areaTurma;
        this.caminhoDoArquivo = caminhoDoArquivo;
    }

    public Arquivo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void incrementaId() {
        this.id += 1;
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
}
