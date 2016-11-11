{-
For a given list with N integers, return a new list removing the elements at odd positions.
-}

f :: [Int] -> [Int]
f (x:y:ys) = y: (f ys)
f _ = []


main = do
   inputdata <- getContents
   mapM_ (putStrLn. show). f. map read. lines $ inputdata
