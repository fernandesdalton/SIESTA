/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estacionamento;

import java.sql.Date;

/**
 *
 * @author daltonfernandes
 */
public class Estacionamento {
    
    private int codigo;
    private String nome;
    private String CNPJ;
    private String endereco;
    private String cidade;
    private String UF;
    private int vagas;
    private double tfHora;
    private double tfMes;
    private Date dataReg;
    
    public Estacionamento(int codigo, String nome, String CNPJ, String endereco, String cidade, String UF, int vagas, double tfHora, double tfMes, Date dataReg){
        this.codigo = codigo;
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.cidade = cidade;
        this.UF = UF;
        this.vagas = vagas;
        this.tfHora = tfHora;
        this.tfMes = tfMes;
    }
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the UF
     */
    public String getUF() {
        return UF;
    }

    /**
     * @param UF the UF to set
     */
    public void setUF(String UF) {
        this.UF = UF;
    }

    /**
     * @return the vagas
     */
    public int getVagas() {
        return vagas;
    }

    /**
     * @param vagas the vagas to set
     */
    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    /**
     * @return the tfHora
     */
    public double getTfHora() {
        return tfHora;
    }

    /**
     * @param tfHora the tfHora to set
     */
    public void setTfHora(double tfHora) {
        this.tfHora = tfHora;
    }

    /**
     * @return the tfMes
     */
    public double getTfMes() {
        return tfMes;
    }

    /**
     * @param tfMes the tfMes to set
     */
    public void setTfMes(double tfMes) {
        this.tfMes = tfMes;
    }

    /**
     * @return the dataReg
     */
    public Date getDataReg() {
        return dataReg;
    }

    /**
     * @param dataReg the dataReg to set
     */
    public void setDataReg(Date dataReg) {
        this.dataReg = dataReg;
    }

}
