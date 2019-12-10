package br.com.senac.connection;

import br.com.senac.tratamentoDeDados.Arquivo;
import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArquivoDao {


    public static boolean inserirNoBanco(Arquivo arquivo) {
        try {
            String sql = "INSERT INTO tabeladados (turno, situaçãoCivil, sexo, dataRequerimento, motivoRequerimento," +
                    " turma, areaTurma) values (?, ?, ?, ?, ?, ?, ?)";
            Connection connection = Conectar.getConnection();
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, arquivo.getTurnoMatricula());
            pstm.setString(2, arquivo.getSituacaoCivilAluno());
            pstm.setString(3, arquivo.getSexoAluno());
            pstm.setString(4, arquivo.getDataCadastroRequerimento());
            pstm.setString(5, arquivo.getMotivoRequerimento());
            pstm.setString(6, arquivo.getTurma());
            pstm.setString(7, arquivo.getAreaTurma());
            pstm.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir..." + e.getMessage());
            return false;
        }
    }


}

