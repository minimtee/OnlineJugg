{- Solution 1 -}
-- hello_worlds n = mapM_ putStrLn $ replicate n "Hello World"

{- Solution 2 -}
hello_worlds 1 = putStrLn "Hello World"
hello_worlds n = do
    putStrLn "Hello World"
    hello_worlds (n-1)

main = do
   n <- readLn -- :: IO Int
   hello_worlds n
