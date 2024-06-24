/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.bean.ProfessorDTO;

/**
 *
 * @author Senai
 */
public class ProfessorDAO {
    public ProfessorDTO login(ProfessorDTO professor) {
        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            stmt = conexao.prepareStatement("SELECT idProfessor FROM professor WHERE email = ? AND senha = ?");
            stmt.setString(1, professor.getEmail());
            stmt.setString(2, professor.getSenha());
            
            rs = stmt.executeQuery();
            if(rs.next()){
                professor.setIdProfessor(rs.getInt("idProfessor"));
            }
            rs.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return professor;
    }
}
