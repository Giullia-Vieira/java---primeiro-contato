package aulaDois;

public class Media {
    public static void main(String[] args) {
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double media = (10 + 10)/2;
        System.out.println("o valor da média é: " + media);
      
        //Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double a = 20.2;
        int b = (int) a;
        System.out.println("valor de B é: " + b);

        //Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'B';
        String palavra = "bala";

        String mensagem = "A letra é: " + letra + " e a palavra é: " + palavra;
        System.out.println(mensagem);

        // Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
            
        double precoProd = 15.0;
        int qntd = 5;
        double valorToral = precoProd * qntd;
        System.out.println("valor total de produtos é: " + valorToral);

        // Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
  
        double valorEmDolares = 1;
        double valorEmReal = 4.94;

        double conversao = valorEmDolares * valorEmReal;
        System.out.println("o valor do dólar convertido em real é: " + conversao);

        // Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
    
        double precoOriginal = 25.90;
        double percentualDesconto = 0.15;
        System.out.println("valor original: " + precoOriginal);
        double valorComDesconto = precoOriginal - (percentualDesconto * precoOriginal);
        System.out.println("o novo valor será: " + valorComDesconto);
    }
}
