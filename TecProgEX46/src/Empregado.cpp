/*
 * Empregado.cpp
 *
 *  Created on: 18 de jun de 2016
 *      Author: Thiago
 */

#include "Empregado.h"

Empregado::Empregado(std::string nome, int cpf, std::string cargo) {
	this->nome = nome;
	this->cpf = cpf;
	this->cargo = cargo;
}
double Empregado::calculaSalario(double horas){
	return 415.00;
}

void Empregado::mostraDados(){
	//Nome: xxx, CPF: xxx, Cargo: xxx
	std::cout << "Nome: " << this->nome << ", CPF: " << this->cpf << ", cargo: " << this->cargo;
}

