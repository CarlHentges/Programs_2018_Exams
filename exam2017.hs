power2 x
    | x <= 0 = False
    | x == 1 = True
    | x >  1 = if (odd x) then False else (power2 (x `div` 2))

powers x = x : (powers (2 * x))

check x [] = False
check x (h:t)
    | x == h = True
    | x >  h = (check x t)
    | otherwise = False

pow2 x = check x (powers 1) 