append([],L,L).
append([X|L],Y,[X|Z]):- append(L,Y,Z).

