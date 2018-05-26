fib n |n == 0 = 0
      |n == 1 = 1
      |n >  1 = fib (n-1) + fib (n-2)

sign n | n <  0 = show "negative"
       | n == 0 = show "equal"
       | n >  0 = show "positive"
