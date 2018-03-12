/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2ed;

import java.util.LinkedList;

/**
 *
 * @author joanderson
 */
class Mergesort {
    static void split(LinkedList<Integer> lista, LinkedList<Integer> lista_divisao_1, LinkedList<Integer> lista_divisao_2) {
        int fim = lista.size();
        int meio = lista.size() / 2;
        int inicio = 0;

        for (int i = inicio; i < meio; i++) {
            lista_divisao_1.add(lista.get(i));
        }
        //System.out.println("D1"+lista_divisao_1+"\n");

        for (int i = meio; i < fim; i++) {
            lista_divisao_2.add(lista.get(i));
        }       
        //System.out.println("D2"+lista_divisao_2+"\n");

    }
    
    static LinkedList<Integer> merge(LinkedList<Integer> lista_divisao_1, LinkedList<Integer> lista_divisao_2) {

        LinkedList<Integer> listaNova = new LinkedList<>();

        int fim_divisao_1 = lista_divisao_1.size();
        int fim_divisao_2 = lista_divisao_2.size();
        int inicio = 0;

        int i = inicio, j = inicio, k = inicio;
        while (k < (fim_divisao_1 + fim_divisao_2)) {
            if (i >= lista_divisao_1.size()) {
                listaNova.add(lista_divisao_2.get(j));
                j++;
                k++;
            } else if (j >= lista_divisao_2.size()) {
                listaNova.add(lista_divisao_1.get(i));
                i++;
                k++;
            } else if (lista_divisao_1.get(i) < lista_divisao_2.get(j)) {
                listaNova.add(lista_divisao_1.get(i));
                i++;
                k++;
            } else {
                listaNova.add(lista_divisao_2.get(j));
                j++;
                k++;
            }
        }
        return listaNova;
    }
    static LinkedList<Integer> mergesort(LinkedList<Integer> lista) {
        if (lista.size() > 1) {
            LinkedList<Integer> lista_divisao_1 = new LinkedList<>();
            LinkedList<Integer> lista_divisao_2 = new LinkedList<>();
            split(lista, lista_divisao_1, lista_divisao_2);
            lista_divisao_1 = mergesort(lista_divisao_1);
            lista_divisao_2 = mergesort(lista_divisao_2);
            return merge(lista_divisao_1, lista_divisao_2);
        } else {
            return lista;
        }
    }    
}
