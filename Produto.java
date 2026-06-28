package br.edu.cafeteria.modelo;

public abstract class Produto {
    private int codigo; private String nome; private double precoBase; private int estoque;
    public Produto(int codigo,String nome,double precoBase,int estoque){this.codigo=codigo;this.nome=nome;this.precoBase=precoBase;this.estoque=estoque;}
    public int getCodigo(){return codigo;} public void setCodigo(int c){codigo=c;}
    public String getNome(){return nome;} public void setNome(String n){nome=n;}
    public double getPrecoBase(){return precoBase;} public void setPrecoBase(double p){precoBase=p;}
    public int getEstoque(){return estoque;} public void setEstoque(int e){estoque=e;}
    public void adicionarEstoque(int q){estoque+=q;} public void baixarEstoque(int q){estoque-=q;}
}
