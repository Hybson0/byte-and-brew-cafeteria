package br.edu.cafeteria.modelo;
public class Comida extends Produto{private int tempoPreparo;private boolean vegano,semGluten;public Comida(int c,String n,double p,int e,int t,boolean v,boolean s){super(c,n,p,e);tempoPreparo=t;vegano=v;semGluten=s;}}
