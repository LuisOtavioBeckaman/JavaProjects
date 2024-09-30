package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando um estacionamento
        Estacionamento estacionamento = new Estacionamento();

        // Criando veículos
        Veiculo carro1 = new Veiculo("ABC-1234");
        Veiculo carro2 = new Veiculo("XYZ-5678");
        Veiculo carro3 = new Veiculo("LMN-9012");

        // Registrando entradas
        estacionamento.registrarEntrada(carro1);
        estacionamento.registrarEntrada(carro2);

        // Simulando um atraso de 2 horas
        try {
            Thread.sleep(7200000); // 2 horas
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Registrando a entrada do carro3
        estacionamento.registrarEntrada(carro3);

        // Registrando a saída do carro1
        estacionamento.registrarSaida(carro1);

        // Registrando a saída do carro2
        estacionamento.registrarSaida(carro2);

        // Listando veículos que estão há mais de 2 horas
        System.out.println("Veículos há mais de 2 horas no estacionamento:");
        List<Veiculo> veiculosLongaPermanencia = estacionamento.listarVeiculosMaisDeDuasHoras();
        veiculosLongaPermanencia.forEach(System.out::println);
    }
}
