/*
 * Faxineiro.h
 *
 *  Created on: 18 de jun de 2016
 *      Author: Thiago
 */

#ifndef FAXINEIRO_H_
#define FAXINEIRO_H_

#include "Empregado.h"

class Faxineiro: public Empregado {
public:
	Faxineiro(std::string nome, int cpf);
	virtual void mostraDados();
	virtual double calculaSalario(double);
};

#endif /* FAXINEIRO_H_ */
