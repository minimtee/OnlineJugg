{-

Input Format

You are given two integers, A and B on separate lines.

Output Format

Output an integer that denotes A+B.

-}

solveMeFirst a b = a + b

{- 这可能是Haskell的程序入口-}
main = do
    val1 <- readLn
    val2 <- readLn
    let sum = solveMeFirst val1 val2
    print sum