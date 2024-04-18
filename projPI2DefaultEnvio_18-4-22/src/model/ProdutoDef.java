package model;

public class ProdutoDef {
    private int idProduto;
    private int fk_idCategoria;
    private String produto;
    private String tipo;
    private int quantidade;    
    private float vlCompra;
    private float icms;
    private float vlVenda;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getFk_idCategoria() {
        return fk_idCategoria;
    }

    public void setFk_idCategoria(int fk_idCategoria) {
        this.fk_idCategoria = fk_idCategoria;
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