package com.example;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Estacionamento {
    private Map<String, LocalDateTime> registros;
    private static final double VALOR_HORA = 5.0; // Valor por hora

    public Estacionamento() {
        registros = new HashMap<>();
    }

    // Método para registrar a entrada do veículo
    public void registrarEntrada(Veiculo veiculo) {
        registros.put(veiculo.getPlaca(), LocalDateTime.now());
        System.out.println("Entrada registrada: " + veiculo);
    }

    // Método para registrar a saída do veículo e calcular o valor a ser pago
    public void registrarSaida(Veiculo veiculo) {
        LocalDateTime horaEntrada = registros.remove(veiculo.getPlaca());
        if (horaEntrada != null) {
            Duration duracao = Duration.between(horaEntrada, LocalDateTime.now());
            long horas = (long) Math.ceil(duracao.toHours());
            double valorAPagar = horas * VALOR_HORA;
            System.out.println("Saída registrada: " + veiculo + ", Tempo de permanência: " + horas + " horas, Valor a pagar: R$ " + valorAPagar);
        } else {
            System.out.println("Veículo não encontrado: " + veiculo);
        }
    }

    // Método para listar veículos que estão há mais de 2 horas no estacionamento
    public List<Veiculo> listarVeiculosMaisDeDuasHoras() {
        LocalDateTime agora = LocalDateTime.now();
        return registros.entrySet().stream()
                .filter(entry -> Duration.between(entry.getValue(), agora).toHours() > 2)
                .map(entry -> new Veiculo(entry.getKey()))
                .collect(Collectors.toList());
    }
}
