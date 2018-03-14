#ifndef LISTACANDIDATOS_H_INCLUDED
#define LISTACANDIDATOS_H_INCLUDED
#include "NoCandidato.h"

class ListaCandidatos
{
public:
    int qtd;
    NoCandidato* head;
    ListaCandidatos()
    {
        qtd = 0;
        this-> head = new NoCandidato(NULL,NULL);
    }
    void adicioneComoHead(Candidato* c)
    {
        this-> head = new NoCandidato(c,head);
        qtd++;

    }
    bool estaVazia()
    {
        return (head->conteudo==NULL);
    }
    int tamamho()
    {
        return qtd;
    }

};


#endif // LISTACANDIDATOS_H_INCLUDED
