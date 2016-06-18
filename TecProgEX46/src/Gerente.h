/*
 * Gerente.h
 *
 *  Created on: 18 de jun de 2016
 *      Author: Thiago
 */

#ifndef GERENTE_H_
#define GERENTE_H_

#include "Empregado.h"

class Gerente: public Empregado {
private:
	int bonus;
public:
	Gerente(std::string nome, int cpf, int bonus);
	virtual void mostraDados();
	virtual double calculaSalario(double);
};

#endif /* GERENTE_H_ */
