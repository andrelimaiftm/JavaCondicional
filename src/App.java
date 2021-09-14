import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        //estrutura condiconal -> para que programa possa realizar escolha;

        //operadores de comparação
        // == igual a que
        // != diferente de
        // > maior que
        // < menor que
        // >= maior igual
        // <= menor igual

        //operadores logicos
        // && -> AND -> (E) 
        // || -> OR -> (OU)
        // ! -> not -> (negação logica)

        //condicional
        // SE (condicao){
            ///executa o comendo
        //}
        /*boolean estaChuvendo = false;
        boolean estaLavandoChao = true;
        if (estaChuvendo == true) 
            System.out.println("Se está chovendo então o chão esta molhado."); 
        else if(estaChuvendo == false && estaLavandoChao == true)
            System.out.println("Não está chovendo porem o chão está molhado");
        else
            System.out.println("Se não está chovendo então o chão não está molhado"); */      
        
        //ler um número e, se ele for maior do que 20, então eu faço imprenssão da metado 
        //do numero

        /*String entrada = JOptionPane.showInputDialog(null, "Digite um numero: ");
        int numero = Integer.parseInt(entrada);
        if( numero >= 20){
            float resultado = (float) numero/2;
            System.out.println("metade: "+ resultado);
        }*/

        //programa vai ler um numero e vai imprimir se ele é par ou ímpar
        /*String entrada2 = JOptionPane.showInputDialog(null, "Digite um numero: ");
        int numero2 = Integer.parseInt(entrada2);
        if(numero2 % 2 == 0){
            System.out.println("O numero é PAR");
        }else{
            System.out.println("O numero é IMPAR");
        }*/

        /*int hora = 0;
        String entrada3 = JOptionPane.showInputDialog(null, "Digite um numero: ");
        hora = Integer.parseInt(entrada3);

        if(hora >= 6 && hora < 12){
            System.out.println("Bom dia");
        }else if(hora >= 12 && hora <18){
            System.out.println("boa tarde");
        }else if(hora >= 18 && hora < 0){
            System.out.println("boa noite");
        }else{
           System.out.println("boa madruga");
        }*/    

    //Codicional switch
    /*switch(expressão avaliar){
        case x:
            //bloco de codigo
            break;
        case y:
            //bloco de codigo
            break;
        default:
            //bloco de codico;
    }*/
        /*int dia = 8;
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
        
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3: 
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
            }
        } */
        
        int idade = 18;
        if(idade <= 20){            
            if(idade < 18 && idade >= 13){
                System.out.println("Voce é um adolescente.");
            }else if(idade > 5 && idade <13){
                System.out.println("Voce é uma crianca");
            }else if(idade <= 5){
                System.out.println("Voce é um bebe");

            }else{
                System.out.println("Voce é adulto jovem");
            }
        }
    }    
}
