import java.io.BufferedReader;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.IOException;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class texto {

    public static void main(String[] args) throws IOException {

        System.out.println("############# ARQUIVO TXT ##############");

        System.out.println("");

        /* local do arquivo */

        File arquivo = new File("teste.txt");

        StringBuilder conteudo = new StringBuilder();

        BufferedReader reader;

        try {

            reader = new BufferedReader(new FileReader(arquivo));

            String text;

            // repete enquanto existir linhas

            while ((text = reader.readLine()) != null) {

                conteudo.append(text).append(System.getProperty("line.separator"));

            }

            System.out.println(conteudo.toString());

            reader.close();

        } catch (FileNotFoundException e) {

            System.out.println("Arquivo não encontrado!");

        } catch (IOException e) {

            System.out.println("Falha ao tentar ler arquivo! " + e.getMessage());
        }
        System.out.println("###############################################");
        System.out.println("");

        /* armazenar o arquivo em arrayList */

        List<String[]> lista = new ArrayList<>();

        FileReader ent = new FileReader("arquivo.txt");

        BufferedReader br = new BufferedReader(ent);

        String linha;

        while ((linha = br.readLine()) != null) {

            String[] registro = linha.split(" ");

            lista.add(registro);

            // Menu

            int opção;

            System.out.println("============================");

            System.out.println("|          OPÇÃO           |")
;
            System.out.println("============================");

            System.out.println(" 1 Bubble Sort  ");

            System.out.println(" 2 Selection Sort  ");

            System.out.println(" 3 Insertion Sort  ");

            System.out.println("============================");

            Scanner entrada = new Scanner(System.in);

            System.out.print(" DESEJA ORDENAR COM QUAL ALGORITMO :");

            opção = entrada.nextInt();

            switch (opção) {

                case 1:

                    // Ordenação
                    long tempoInicial = System.currentTimeMillis();

                    for (int i = 0; i <= registro.length; i++) {

                        for (int c = i + 1; c < registro.length; c++) {

                            int compareTo = registro[i].compareTo(registro[c]);

                            if (compareTo > 0) {

                                String temp = registro[i];

                                registro[i] = registro[c];

                                registro[c] = temp;
                            }

                        }

                    }

                    for (String string : registro) {

                        for (String valor : registro) {

                            System.out.println(valor);
                        }

                    }

            }

            long tempoFinal = System.currentTimeMillis();

            System.out.print("TEMPO DE EXECUÇÃO DO BUBLLE SORT:");

            long tempoInicial = 0;

            System.out.println(tempoFinal - tempoInicial / 1000.0);

            break;

        }

    }

    case 2:


        for (int i = 0;i< registro.length ;i++){

                int iMenor = i;

        for (int j = 0; j < registro.length; j++) {

            if (registro[j] < registro[iMenor]) {

                iMenor = j;

            }

            int iMaior = 0;

            if (iMenor != iMaior) {

                String temp = registro[i];

                registro[i] = registro[iMenor];

                registro[iMenor] = temp;
            }

        }

        for (String string : registro) {

            for (String valor : registro) {

                System.out.println(valor);
            }

        }

    }

    break;



case 3:

       for(int fixo = 1;fixo< registro.length ;fixo++){

        int x = fixo - 1;

        int y = fixo;

        while (y != 0 && registro[x] > registro[y]) {

            long a = registro[x];

            registro[x] = registro[y];

            registro[y] = a;

            x--;

            y--;

        }


    for (String string : registro) {

    for (String valor : registro) {

    System.out.println(valor);

        }

    }


break;

       }

}