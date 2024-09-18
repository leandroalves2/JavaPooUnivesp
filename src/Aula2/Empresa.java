package Aula2;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Empresa {

    private String nome;
    private String cnpj;
    private String endereco;
    private Date dataFundacao;
    private float faturamento;

    public void Imprimir()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dataFor = sdf.format(dataFundacao);
        System.out.println("Name: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Endereço: " + endereco);

        System.out.println("Data da fundação: " + dataFor);
    }

    public String GetNome()
    {
        return nome;
    }

    public void SetNome(String nome)
    {
        this.nome = nome;
    }

    public String GetCnpj()
    {
        return cnpj;
    }
    public void SetCnpj(String cnpj)
    {
        this.cnpj = cnpj;
    }

    public String GetEndereco()
    {
        return endereco;
    }
    public void SetEndereço(String endereco)
    {
        this.endereco = endereco;
    }

    public Date GetDataFundacao()
    {
        return dataFundacao;
    }
    public void SetDataFundacao(Date dataFundacao)
    {
        this.dataFundacao = dataFundacao;
    }

    public float GetFaturamento()
    {
        return faturamento;
    }
    public void SetFaturamento(float faturamento)
    {
        this.faturamento = faturamento;
    }

    public Empresa() {}
    public Empresa(String nome, String cnpj, String endereco, Date dataFundacao, float faturamento)
    {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.faturamento = faturamento;
    }

}
