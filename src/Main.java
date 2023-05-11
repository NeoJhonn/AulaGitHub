package src;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Exercício 1
        List<Integer> numberList = new ArrayList<Integer>();
        var tec = new Scanner(System.in);

        for(int i=0; i < 5; i++){
            System.out.printf("Digite o número de posição %s: ", i + 1);
            numberList.add(tec.nextInt());
        }

        System.out.println("Ordenação inicial: "+ numberList);
        Collections.reverse(numberList);
        System.out.println("Ordem ao contrário: "+ numberList);

        //Exercício 2
        List<Integer> numList = new ArrayList<Integer>();
        List<Integer> positionExcluded = new ArrayList<Integer>();
        Boolean finished = Boolean.FALSE;
        System.out.println("Quantos índices tem o array ?");
        var arrayLength = tec.nextInt();

        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Digite o número inteiro: ");
            numList.add(tec.nextInt());
        }

        for (int i = 0; i < arrayLength - 1; i++) {
            if(numList.size() > 0) {
                var num1 = numList.get(i);
                List<Integer> auxNumList = new ArrayList<Integer>(numList);
                auxNumList.remove(i);


                for (int num2 : auxNumList) {
                    if (num1 + num2 == 10
                            && !positionExcluded.contains(numList.indexOf(num1))) {

                        positionExcluded.add(numList.indexOf(num2));
                        finished = Boolean.TRUE;
                        System.out.printf("Par que soma 10 encontrado, são eles: %s e %s", num1, num2);
                        System.out.printf("\n");
                    }
                }
            }
        }

        if(!finished){
            System.out.println("Não há pares cuja soma seja igual a 10");
        }

    }

}
