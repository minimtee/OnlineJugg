# Given two integers, X and Y, identify whether X < Y or X > Y or X = Y.
read x
read y
if [ $x -gt $y ];then
	echo "X is greater than Y"
	exit
elif [ $x -lt $y ];then
	echo "X is less than Y"
	exit
else
	echo "X is equal to Y"
fi