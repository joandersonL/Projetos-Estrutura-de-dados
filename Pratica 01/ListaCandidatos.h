#ifndef LISTACANDIDATOS_H_INCLUDED
#define LISTACANDIDATOS_H_INCLUDED
#include "NoCandidato.h"

#include <stdlib.h>

#include <cstring>
#include <fstream>
#include <iostream>

using namespace std;

class ListaCandidatos
{
  public:
    int qtd;
    NoCandidato *head;

    ListaCandidatos()
    {
        qtd = 0;
        this->head = NULL;
    }

    ListaCandidatos(string arquivo)
    {
        this->qtd = 0;
        ifstream arqEntrada(arquivo.c_str());
        string dados;
        this->head = NULL;
        getline(arqEntrada, dados);

        while (getline(arqEntrada, dados))
        {
            Candidato *c = new Candidato(dados);
            adicioneComoHead(c);
        }
    }
    void adicioneComoHead(Candidato *c)
    {
        this->head = new NoCandidato(c, head);
        qtd++;
    }
    bool estaVazia()
    {
        return (head->conteudo == NULL);
    }
    int tamanho()
    {
        if (head == NULL)
        {
            return 0;
        }
        else
            return this->qtd;
    }
    string toString()
    {

        if (head != NULL)
            return head->toString();
        else
            return "0";
    }
    bool remover(string nome, string sobrenome)
    {
        NoCandidato *it = head;

        if (head->conteudo->igual(nome, sobrenome))
        {
            NoCandidato *aux = head->next;
            delete head;
            head = aux;
            qtd--;
            return true;
        }
        else
        {
            while (it->next != NULL)
            {
                if (it->next->conteudo->igual(nome, sobrenome))
                {
                    free(it->next);
                    it->next = it->next->next;
                    qtd--;
                    return true;
                }
                else
                    it = it->next;
            }
        }
    }

    void filtrarCandidatos(int notaCandidato)
    {
        NoCandidato *it = head;

        while (head != NULL && head->conteudo->nota < notaCandidato)

        {
            NoCandidato *aux = head->next;
            delete head;
            head = aux;
            this->qtd = qtd - 1;
        }

        while (it->next != NULL)
        {
            if (it->next->conteudo->nota < notaCandidato)
            {
                free(it->next);
                it->next = it->next->next;
                this->qtd--;
            }
            else
                it = it->next;
        }
    }
    void concatena(ListaCandidatos *l)
    {

        if (head == NULL)
            head = l->head;
        else

        {
            NoCandidato *nItem = head->next;
            while (nItem->next != NULL)
            {
                nItem = nItem->next;
            }
            qtd = qtd + l->tamanho();
            nItem->next = l->head;
        }
    }
};

#endif // LISTACANDIDATOS_H_INCLUDED
