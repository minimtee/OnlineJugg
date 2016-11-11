{-
You are given a list.
Return the sum of odd elements from the given list.
You need to write a function with the recommended method signature.
-}

-- Solution 1
f arr = sum $ filter (odd) arr

main = do
   inputdata <- getContents
   putStrLn $ show $ f $ map (read :: String -> Int) $ lines inputdata
