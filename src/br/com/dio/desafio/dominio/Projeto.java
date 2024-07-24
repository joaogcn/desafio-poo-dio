package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Projeto extends Conteudo {
    private LocalDate dataInicio;
    private LocalDate dataFim;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 30d;
    }

    public Projeto() {
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                '}';
    }
}