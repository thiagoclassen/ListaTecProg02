//============================================================================
// Name        : TecProgEX46.cpp
// Author      : Thiago
//============================================================================

#include "Faxineiro.h"
#include "Gerente.h"
#include <iostream>
using namespace std;

int main() {
	int op;
	int cpf;
	double bonus;
	double horas;
	std::string nome;
	std::string cargo;

	Empregado* funcionario;
	cout << "1 - Faxineiro" << endl;
	cout << "2 - Empregado" << endl;
	cout << "3 - Gerente" << endl;

	cin >> op;

	switch (op) {
	case 1:
		cout << "Nome" << endl;
		cin >> nome;
		cout << "CPF" << endl;
		cin >> cpf;
		funcionario = new Faxineiro(nome, cpf);
		break;
	case 2:
		cout << "Nome" << endl;
		cin >> nome;
		cout << "CPF" << endl;
		cin >> cpf;
		cout << "Cargo" << endl;
		cin >> cargo;
		funcionario = new Empregado(nome, cpf, cargo);
		break;
	case 3:
		cout << "Nome" << endl;
		cin >> nome;
		cout << "CPF" << endl;
		cin >> cpf;
		cout << "Bonus" << endl;
		cin >> bonus;
		funcionario = new Gerente(nome, cpf, bonus);
		break;
	}

	cout << "Quantas horas nesse mes?" << endl;
	cin >> horas;
	cout << "Salario nesse mes: " << funcionario->calculaSalario(horas) << endl;
	funcionario->mostraDados();

	return 0;
}
