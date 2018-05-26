journey(A,B,A,B,[]).
journey(A,B,X,Y,[u|L]) :- C is B+1, journey(A,C,X,Y,L).
journey(A,B,X,Y,[r|L]) :- C is A+1, journey(C,B,X,Y,L).
