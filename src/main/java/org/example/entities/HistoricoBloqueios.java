package org.example.entities;

public class HistoricoBloqueios {
    private String id_categoria;
    private String nome;
    private Integer quantidade_bloqueios;

    public HistoricoBloqueios(String id_categoria, String nome, Integer quantidade_bloqueios) {
        this.id_categoria = id_categoria;
        this.nome = nome;
        this.quantidade_bloqueios = quantidade_bloqueios;
    }

    public HistoricoBloqueios() {
    }

    public String getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(String id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade_bloqueios() {
        return quantidade_bloqueios;
    }

    public void setQuantidade_bloqueios(Integer quantidade_bloqueios) {
        this.quantidade_bloqueios = quantidade_bloqueios;
    }

    @Override
    public String toString() {
        return """
                    Historico de Bloqueios
                    
                Nome da categoria: %s
                Quantidade de bloqueios: %d
                """.formatted(nome, quantidade_bloqueios);

    }
}
