package com.senai.apiValidation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;

public record EventoDTO(

        @NotBlank(message = "Informe o nome do evento")
        @Size(min = 5, max = 80, message = "O nome do evento precisa ter de {min} a {max} caracteres")
        String nome,

        @NotNull(message = "Informe um e-mail para contato")
        @Email(message = "O e-mail informado não é válido")
        String emailContato,

        @NotNull(message = "Informe a data de ivennício do eto")
        @Future(message = "O evento precisa começar em uma data futura")
        LocalDate dataInicio,

        @NotNull(message = "Informe a quantidade de vagas")
        @Min(value = 10, message = "O evento precisa ter no mínimo {value} vagas")
        @Max(value = 5000, message = "O evento pode ter no máximo {value} vagas")
        Integer vagas,

        @NotNull(message = "Informe o preço do ingresso")
        @PositiveOrZero(message = "O preço do ingresso não pode ser negativo")
        BigDecimal precoIngresso,

        @NotBlank(message = "Informe o logradouro (rua, avenida...)")
        String logradouro,

        @NotBlank(message = "Informe o número do endereço")
        String numero,

        @NotBlank(message = "Informe o CEP")
        @Pattern(regexp = "\\d{5}-\\d{3}", message = "CEP fora do padrão, use XXXXX-XXX")
        String cep
) {
}