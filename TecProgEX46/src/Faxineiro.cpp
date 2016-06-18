/*
 * Faxineiro.cpp
 *
 *  Created on: 18 de jun de 2016
 *      Author: Thiago
 */

#include "Faxineiro.h"

Faxineiro::Faxineiro(std::string nome, int cpf):Empregado(nome, cpf, "Faxineiro") {

}

double Faxineiro::calculaSalario(double horas){
	//até 176 horas – 4,50/hora, hora extra – 6,00/hora
	double total = 0;
	if(horas>176){
		double extra = horas - 176;
		total += extra*6;
	}
	total += horas*4.5;
	return total;
}

void Faxineiro::mostraDados(){
	//Nome do faxineiro: xxx, CPF: xxx
	std::cout << "Nome: " << this->nome << ", CPF: " << this->cpf;
}

