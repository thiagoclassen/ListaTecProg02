/*
 * Gerente.cpp
 *
 *  Created on: 18 de jun de 2016
 *      Author: Thiago
 */

#include "Gerente.h"

Gerente::Gerente(std::string nome, int cpf, int bonus) :
		Empregado(nome, cpf, "Gerente") {
	this->bonus = bonus;
}

double Gerente::calculaSalario(double horas) {
	//até 176 horas – 30,00/hora + bonus, hora extra – não paga
	double total = bonus;
	if(horas>=176){
		total += 176 * 30;
	}else{
		total+=horas*30;
	}
	return total;
}

void Gerente::mostraDados() {
	//Nome do gerente: xxx, CPF: xxx, bonus: xxx
	std::cout << "Nome: " << this->nome << ", CPF: " << this->cpf << ", bonus: " << this->bonus;
}

