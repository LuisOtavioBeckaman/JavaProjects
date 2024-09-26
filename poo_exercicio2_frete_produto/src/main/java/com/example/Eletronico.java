package com.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class Eletronico extends Produto implements Transportavel{

  //Atributo  
    private double volume;
    private double peso;

    public Eletronico(String nome, double preco, double volume) {
        super(nome, preco);
        this.volume = volume;
        
    }

  //Calcular Peso
  
  @Override
  public double CalcularPeso(){
    double peso = volume*150;
    return peso;
  }  

  //Calcular frete

  @Override
  public double CalcularFrete(){
    double valorFrete = CalcularPeso()*1;
    return valorFrete;
  }
}
