package com.sptech.projeto_individual_fisio4life.repositories;

import com.sptech.projeto_individual_fisio4life.entities.Fisioterapeuta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class FisioterapeutaRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public FisioterapeutaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Fisioterapeuta> getAll(){

        String sql = "SELECT * FROM Fisioterapeuta;";

        try {
            return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Fisioterapeuta.class));
        } catch (Exception e){
            System.out.println("Erro ao listar fisioterapeutas!");
            return null;
        }
    }

    public Integer create(Fisioterapeuta fisioterapeuta){

        String sql = """
                    INSERT INTO Fisioterapeuta (nome, cpf, data_nascimento, sexo, especialidade, clinica_id, ativo) VALUES
                    (?, ?, ?, ?, ?, ?, ?)
                """;
        try {
            return jdbcTemplate.update(
                    sql,
                    fisioterapeuta.getNome(),
                    fisioterapeuta.getCpf(),
                    fisioterapeuta.getData_nascimento(),
                    fisioterapeuta.getSexo(),
                    fisioterapeuta.getEspecialidade(),
                    fisioterapeuta.getClinica_id(),
                    fisioterapeuta.getAtivo()
            );
        } catch (Exception e) {
            System.out.println("Erro ao inserir fisioterapeuta: " + e.getMessage());
            return null;
        }

    }
}
