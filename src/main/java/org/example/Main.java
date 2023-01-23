package org.example;

import org.example.model.Empresa;
import org.example.model.Vagas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Empresa empresaA = new Empresa();
        Vagas vagaA = new Vagas();
        empresaA.setNome("Amor e brigradeiro");
        empresaA.setCnpj("123456789-10");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse("29/01/2018", formato);
        empresaA.setDataFundacao(data);
        empresaA.setSenhaEmpresa("SemRelavancia");
        empresaA.setQuantidadeFuncionario(50);
        vagaA.setTitulo("Desenvovedor Senior");
        vagaA.setDescricaoVaga("VocÊ vai virar noites acordados para realizar seu sonho");
        vagaA.setSalario(5000d);
        vagaA.setLocalizacao("Remoto");
        vagaA.setTipoContrato("CLT");
        vagaA.setLiked(0);
        empresaA.setVaga(vagaA);

        Empresa empresaB = new Empresa();
        Vagas vagaB = new Vagas();
        empresaB.setNome("Sorverteria ");
        empresaB.setCnpj("123123098-12");
        LocalDate dataA = LocalDate.parse("01/10/2000", formato);
        empresaB.setDataFundacao(dataA);
        empresaB.setSenhaEmpresa("SemRelavancia");
        empresaB.setQuantidadeFuncionario(20);
        vagaB.setTitulo("Analista Beck-end Junior");
        vagaB.setDescricaoVaga("VocÊ vai virar noites acordados para descobrir bug que você inventou");
        vagaB.setSalario(2500d);
        vagaB.setLocalizacao("presencial");
        vagaB.setTipoContrato("CLT");
        vagaB.setLiked(0);
        empresaB.setVaga(vagaB);

        Vagas vagaC = new Vagas ();
        vagaC.setTitulo("Desenvovedor front-end");
        vagaC.setDescricaoVaga("VocÊ vai virar noites acordados para trocar cor de botão");
        vagaC.setSalario(4500d);
        vagaC.setLocalizacao("Remoto");
        vagaC.setTipoContrato("CLT");
        vagaC.setLiked(0);
        empresaB.setVaga(vagaC);




        System.out.println(empresaB);
        empresaB.MostarVagsPublicadas();

        System.out.println(empresaA);
        System.out.println(empresaA.getVaga());

































    }
}