%Fatos:
%Homem H � verdadeiro quando H � masculino
%Predicado homem/1
%1 � um n�mero de argumentos do predicado denomina-se
%de aridade

homem(jose).
homem(carlos).
homem(pedro).
homem(andre).

%mulher F � verdaideiro quando F � feminino
%predicado mulher/1

mulher(ana).
mulher(carla).
mulher(sandra).

%progenitor P � verdadeiro quando P � o pai ou � a m�e
%predicado progenitor/2
%progenitor(progenitor,filho)

progenitor(carlos,jose).
progenitor(maria,jose).
progenitor(sandra,carlos).
progenitor(pedro,andre).

%Ana � irm� de Jos�
progenitor(maria,ana).
%Ricardo tem av� que � o Pedro
progenitor(andre,ricardo).
%Ricardo e Ana tem av�s
progenitor(ana,ricardo).
progenitor(jose,tomaz).

%Regras:
% (  => se
% :- => if
% ,  => and
% ;  => or

%Saber se duas pessoas s�o irm�os
%Regra - duas pessoas s�o irm�os se tiverem pelo menos
%um dos pais em comum

irmao(F1,F2) :- progenitor(P1,F1) , progenitor(P1,F2).

%Saber quem est� casado
%Regra - para estar casado tem de ter  pelo menos um filho

casado(P1,P2) :- progenitor(P1,F1) , progenitor(P2,F1).

%Descobrir um dos av�s
%Regra - � neto se fo filho do filho de algu�m (av�s)

avo(A,N) :- progenitor(A,Z) , progenitor(Z,N).


