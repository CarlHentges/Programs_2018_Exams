myappend([],Y,Y).
myappend([H|T],Y,[H|U]):- myappend(T,Y,U).

