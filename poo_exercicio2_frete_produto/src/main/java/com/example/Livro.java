package com.example;

public class Livro extends Produto implements Transportavel{

  //Calcular frete
  @Override
  public double CalcularFrete(){
    return 2;
  }

  //Calcular peso
@Override
public double CalcularPeso() {
    return 0.5;




























    }
}

