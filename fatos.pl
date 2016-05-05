%Fatos:
%Homem H é verdadeiro quando H é masculino
%Predicado homem/1
%1 é um número de argumentos do predicado denomina-se
%de aridade

homem(jose).
homem(carlos).
homem(pedro).
homem(andre).

%mulher F é verdaideiro quando F é feminino
%predicado mulher/1

mulher(ana).
mulher(carla).
mulher(sandra).

%progenitor P é verdadeiro quando P é o pai ou é a mãe
%predicado progenitor/2
%progenitor(progenitor,filho)

progenitor(carlos,jose).
progenitor(maria,jose).
progenitor(sandra,carlos).
progenitor(pedro,andre).

%Ana é irmã de José
progenitor(maria,ana).
%Ricardo tem avô que é o Pedro
progenitor(andre,ricardo).
%Ricardo e Ana tem avós
progenitor(ana,ricardo).
progenitor(jose,tomaz).

%Regras:
% (  => se
% :- => if
% ,  => and
% ;  => or

%Saber se duas pessoas são irmãos
%Regra - duas pessoas são irmãos se tiverem pelo menos
%um dos pais em comum

irmao(F1,F2) :- progenitor(P1,F1) , progenitor(P1,F2).

%Saber quem está casado
%Regra - para estar casado tem de ter  pelo menos um filho

casado(P1,P2) :- progenitor(P1,F1) , progenitor(P2,F1).

%Descobrir um dos avós
%Regra - é neto se fo filho do filho de alguém (avós)

avo(A,N) :- progenitor(A,Z) , progenitor(Z,N).


