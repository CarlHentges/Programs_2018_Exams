%zip([],L,[]).
%zip(L,[],[]).
zip([],[]).
zip([H|T],[C|R],[(H,C)|L]) :- zip(T,R,L).
