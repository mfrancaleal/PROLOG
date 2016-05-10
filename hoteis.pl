%id, nome, Endereço, telefone, estrelas, estação
:- dynamic hotel/6.
hotel(1,othon, 'rua b', 713321333, 3, outono).
hotel(2,merian, 'rua v', 71333333, 5, verão).
hotel(3,plaza, 'rua de traves', 7133222, 2, outono).

%Reservas ID, Data, IdHotel, Idsuite, IdCliente
:-dynamic reserva/4.
reserva(1, '20/07/2014', 1, 3, 1).

suites_disponiveis(Total,Hotel) :- hotel(IdH,Nome, Endereco, Telefone, Estrela, Estacao),
	                           reserva(IdR, Data, IdHotel, IdSuite, IdCliente),
				   hoteis_suites(IdHS, IdHH, Nquarto, Tipo, Valor),
				   Hotel = Nome,
				   IdH  \= IdHotel,
				   IdHH = IdH,
				   IdHS = IdSuite.

%id, nome, telefone, login, senha
cliente(1, carlos, 33, log, 123).


buscaCliente(Login_, Senha_, Nome) :- cliente(Id,Nome, Telefone, Login, Senha),
                        Senha_ = Senha , Login_ = Login.

%Id, IdHotel, NQuarto, Tipo, Valor
hoteis_suites(1, 1, 22, fumante, 33.66).
hoteis_suites(2, 2, 244, não-fumante, 50.66).
hoteis_suites(3, 1, 35, não-fumante, 69.66).
hoteis_suites(4, 3, 45, fumante, 98.99).

%IdHotel, idReserva
reserva_hotel().

%ID_cliente, ID_reserva
reserva_cliente([Ic | Ir], Ic, Ir).

remove_reserva(Elem, [Elem|Cauda],Cauda).

insere_reservas(X, L, [X|L]).

