sameLength([],[]).
sameLength([X|T1],[Y|T2]) :- sameLength([T1],[T2]).
same(A,[B,C]).
