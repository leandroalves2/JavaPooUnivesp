package Aula2;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

// Aula de classes e objetos

public class MainClasses {

    public static void main(String[] args)
    {
        List<Empresa> listEmpresa = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas empresas serão cadastradas? ");
        int n = sc.nextInt();
        sc.nextLine();


        for(int i = 0; i < n; i++)
        {
            System.out.println("Nome da empresa: ");
            String nome = sc.nextLine();
            System.out.println("CNPJ: ");
            String cnpj = sc.nextLine();
            System.out.println("Endereço: ");
            String endereco = sc.nextLine();
            System.out.println("Data de fundação: ");
            String dataText = sc.nextLine();
            Date date = null;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            try {
                date = sdf.parse(dataText);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println("Faturamento: ");
            float faturamento = sc.nextFloat();
            listEmpresa.add(new Empresa(nome, cnpj, endereco, date, faturamento));
            sc.nextLine();

        }
        for (Empresa item : listEmpresa)
        {
            item.Imprimir();
        }
    }

}
