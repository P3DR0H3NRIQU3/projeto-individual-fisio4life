package com.sptech.projeto_individual_fisio4life.entities;

import java.util.Date;

public class Fisioterapeuta {

    private Integer id;
    private String nome;
    private String cpf;
    private Date data_nascimento;
    private String sexo;
    private String especialidade;
    private Integer clinica_id;
    private Boolean ativo;

    public Fisioterapeuta() {
    }

    public Fisioterapeuta(Integer id, String nome, String cpf, Date data_nascimento, String sexo, String especialidade, Integer clinica_id, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.clinica_id = clinica_id;
        this.ativo = ativo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Integer getClinica_id() {
        return clinica_id;
    }

    public void setClinica_id(Integer clinica_id) {
        this.clinica_id = clinica_id;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
