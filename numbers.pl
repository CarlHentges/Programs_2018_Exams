num(0).
num(N) :- M is (N-1), num(M).
mean(A,B,C) :- C is (A+B)/2.
even(2).
even(N) :- M is (N-2),M>0,even(M).

