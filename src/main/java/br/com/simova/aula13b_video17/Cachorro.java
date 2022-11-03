package br.com.simova.aula13b_video17;

public class Cachorro extends Lobo {

    @Override
    public void emitirSom() {

        System.out.println("Som de cachorro: Au! Au! Au!");
    }

    public void reagir(String frase) {

        String[] frases = {"Comida", "Carinho"};

        if (frase.equals(frases[0]) || frase.equals(frases[1]))
            System.out.println("m1-1-> Abanar e latir!");
        else
            System.out.println("m1-2 -> Rosnar");
    }

    public void reagir(int hora, int minuto) {

        if (hora < 12)
            System.out.println("m2-1 -> Abanar o rabo");
        else if (hora >= 18)
            System.out.println("m2-2 -> Ignorar");
        else
            System.out.println("m2-3 -> Abanar e latir");
    }

    public void reagir(boolean dono) {

        if (dono)
            System.out.println("m3-1 -> Abanar");
        else {
            System.out.println("m3-2 -> Rosnar e latir");
            emitirSom();
        }


    }

    public void reagir(int idade, float peso) {

        if (idade < 5) {
            if (peso < 10)
                System.out.println("m4-1 -> Abanar");
            else
                System.out.println("m4-2 -> Latir");
        } else if (peso < 10)
            System.out.println("m4-3 -> Rosnar");
        else
            System.out.println("m4-4 -> Ignorar");
    }
}
