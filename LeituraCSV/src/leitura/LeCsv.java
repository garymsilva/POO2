
package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;


public class LeCsv {
    public static final int ID = 0;
    public static final int NOME = 1;
    public static final int EMAIL = 2;
    public static final int NASCIMENTO = 3;
    public static final int TELEFONE = 4;
    public static final int TOTAL_COMPRAS = 5;
        
    public LinkedList<Cliente> leCsvClientes() throws IOException {         
      
        LinkedList<Cliente> clientes = new LinkedList<Cliente>();
        String current = new java.io.File( "." ).getCanonicalPath();
        File inputFile = new File(current + "\\src\\arquivo.csv");
        FileReader in = new FileReader(inputFile);
        BufferedReader reader = new BufferedReader(in);

        String line = reader.readLine(); // consome a primeira linha, que contém os cabeçalhos
        String[] splitedLine;
        Cliente cliente;

        while ( (line = reader.readLine()) != null ) { // consome as linhas de dados
            splitedLine = line.split(";");
            cliente = new Cliente(
                splitedLine[ID],
                splitedLine[NOME],
                splitedLine[EMAIL],
                splitedLine[NASCIMENTO],
                splitedLine[TELEFONE],
                splitedLine[TOTAL_COMPRAS]
            );
            clientes.add(cliente);
        }
        reader.close();
        in.close();
        
        return clientes;
    }
}
