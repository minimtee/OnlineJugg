# Given three integers (X, Y , Z and ) representing the three sides of a triangle, identify whether the triangle is Scalene, Isosceles, or Equilateral.

read a
read b
read c

if [ $a == $c ] && [ $a == $b ] && [ $c == $b ]
    then echo "EQUILATERAL"
elif [ $a == $b ] || [ $a == $b ] || [ $a == $b ]
    then echo "ISOSCELES"
else 
    echo "SCALENE"
fi