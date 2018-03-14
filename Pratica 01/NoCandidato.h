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

    string toString(){
     stringstream stream;
     stream << this->conteudo->toString() ;//<< this->next->conteudo->toString();
     if(this->next->conteudo!=NULL){
        stream<<" -> "<<this->next->conteudo->toString();
     }
     stream<<" -> 0";


     return stream.str();
  }

};


#endif // NOCANDIDATO_H_INCLUDED
