based(prolog,logic).
based(haskell,maths).
likes(max,logic).
likes(clare,maths).
likes(X,L) :- based(L,Y), likes(X,Y).
