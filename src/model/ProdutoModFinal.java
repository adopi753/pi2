package model;

public class ProdutoModFinal {
    private String idProduto;
    private String Categoria;
    private String produto;
    private String tipo;
    private int quantidade;    
    private float vlCompra;
    private float icms;
    private float vlVenda;

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getVlCompra() {
        return vlCompra;
    }

    public void setVlCompra(float vlCompra) {
        this.vlCompra = vlCompra;
    }

    public float getIcms() {
        return icms;
    }

    public void setIcms(float icms) {
        this.icms = icms;
    }

    public float getVlVenda() {
        return vlVenda;
    }

    public void setVlVenda(float vlVenda) {
        this.vlVenda = vlVenda;
    }

    
   }