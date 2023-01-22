package org.example;

import org.example.model.Empresa;
import org.example.model.Vagas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Vagas vaga = new Vagas();
        empresa.setNome("Amor e brigradeiro");
        empresa.setCnpj("123456789-10");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse("29/01/2918", formato);
        empresa.setDataFundacao(data);
        empresa.setSenha("SemRelavancia");
        empresa.setQuantidadeFuncionario(50);
        vaga.setTitulo("Desenvovedor Senior");
        vaga.setDescricaoVaga("VocÊ vai virar noites acordados para realizar seu sonho");
        vaga.setSalario(5000d);
        vaga.setLocalizacao("Remoto");
        vaga.setTipoContrato("CLT");
        vaga.setLiked(0);
        empresa.setVaga(vaga);

        System.out.println(empresa);
        System.out.println(empresa.getVaga());

































    }
}