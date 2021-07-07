package dataclass;


import java.util.Objects;

public class ProdutoJ {

    private int cod;
    private String nome;
    private double preco;

    public ProdutoJ(final int cod, final String nome, final double preco) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof ProdutoJ)) return false;
        final ProdutoJ produtoJ = (ProdutoJ) o;
        return getCod() == produtoJ.getCod() &&
                Double.compare(produtoJ.getPreco(), getPreco()) == 0 &&
                Objects.equals(getNome(), produtoJ.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCod(), getNome(), getPreco());
    }
}
