data Color = RED | GREEN | BLUE | INDIGO | VIOLET

myFun = head([2,3])*4
myFun2 x [y] = head[y] * x

xList x (h:t)
    |t == []   = [h*x]
    |otherwise = (h*x) : xList x t

xyList (h:t) x
    |t == [] = [xList h x]
    |otherwise  = (xList h x) : xyList t x

multTable x = xyList x x