#ifndef LISTACANDIDATOS_H_INCLUDED
#define LISTACANDIDATOS_H_INCLUDED
#include "NoCandidato.h"

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
            return qtd;
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
        NoCandidato *it;
        if (head->conteudo->igual)
        {
            return true;
        }

        else
            return false;
    }
};

#endif // LISTACANDIDATOS_H_INCLUDED
