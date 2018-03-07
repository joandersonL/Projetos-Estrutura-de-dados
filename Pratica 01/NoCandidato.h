#ifndef NOCANDIDATO_H_INCLUDED
#define NOCANDIDATO_H_INCLUDED
#include "Candidato.h"

class NoCandidato{
public:
    Candidato *conteudo;
    NoCandidato *next;
    NoCandidato(Candidato *novo,NoCandidato *proximo){
        this->conteudo =novo;
        this->next = proximo;
    }

};


#endif // NOCANDIDATO_H_INCLUDED
