{-
Count the number of elements in an array without using count, size or length operators.
-}

len :: [a] -> Int
-- Solution 1
len lst = sum [1 | _ <- lst]