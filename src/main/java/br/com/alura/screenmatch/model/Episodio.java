package br.com.alura.screenmatch.model;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {
  private Integer temporada;
  private String titulo;
  private Integer numeroDoEpisodio;
  private double avaliacao;
  private LocalDate dataLancamento;

  public Episodio(Integer numeroTemporada, DadosEpisodio dadosEpisodio) {
    this.temporada = numeroTemporada;
    this.titulo = dadosEpisodio.titulo();
    this.numeroDoEpisodio = dadosEpisodio.numero();

    // Tratamento para avaliacao: pode vir como "N/A"
    try {
      this.avaliacao = Double.parseDouble(dadosEpisodio.avaliacao());
    } catch (NumberFormatException e) {
      this.avaliacao = 0.0;
    }

    // Tratamento para data: pode vir como "N/A" ou inválido
    try {
      this.dataLancamento = LocalDate.parse(dadosEpisodio.lancamento()); // Corrigido: lancamento()
    } catch (DateTimeParseException | NullPointerException e) {
      this.dataLancamento = null;
    }
  }

  public Integer getTemporada() {
    return temporada;
  }

  public void setTemporada(Integer temporada) {
    this.temporada = temporada;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Integer getNumeroDoEpisodio() {
    return numeroDoEpisodio;
  }

  public void setNumeroDoEpisodio(Integer numeroDoEpisodio) {
    this.numeroDoEpisodio = numeroDoEpisodio;
  }

  public double getAvaliacao() {
    return avaliacao;
  }

  public void setAvaliacao(double avaliacao) {
    this.avaliacao = avaliacao;
  }

  public LocalDate getDataLancamento() {
    return dataLancamento;
  }

  public void setDataLancamento(LocalDate dataLancamento) {
    this.dataLancamento = dataLancamento;
  }

  @Override
  public String toString() {
    return "temporada=" + temporada +
        ", titulo='" + titulo + '\'' +
        ", numeroDoEpisodio=" + numeroDoEpisodio +
        ", avaliacao=" + avaliacao +
        ", dataLancamento=" + dataLancamento;
  }
}
