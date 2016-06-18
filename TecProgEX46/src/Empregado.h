/*
 * Empregado.h
 *
 *  Created on: 18 de jun de 2016
 *      Author: Thiago
 */

#include <iostream>
#ifndef EMPREGADO_H_
#define EMPREGADO_H_

class Empregado {
protected:
	std::string nome;
	std::string cargo;
	int cpf;
public:
	Empregado(std::string nome, int cpf, std::string cargo);
	virtual void mostraDados();
	virtual double calculaSalario(double);
};

#endif /* EMPREGADO_H_ */
