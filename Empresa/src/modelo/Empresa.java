/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
import java.time.LocalDate;
/**
 *
 * @author Administrador
 */
public class Empresa {
    
    private Integer codigo;
    private String nome_fantasia;
    private String razao_social;
    private String horario_abertura;
    private LocalDate data_fundacao;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    @Override
    public String toString() {
        return nome_fantasia ;
    }

    public String getHorario_abertura() {
        return horario_abertura;
    }

    public void setHorario_abertura(String horario_abertura) {
        this.horario_abertura = horario_abertura;
    }

    public LocalDate getData_fundacao() {
        return data_fundacao;
    }

    public void setData_fundacao(LocalDate data_funcionamento) {
        this.data_fundacao = data_funcionamento;
    }
    
}
