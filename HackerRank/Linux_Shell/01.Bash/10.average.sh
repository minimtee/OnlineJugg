# Given N integers, compute their average correct to three decimal places.

echo "Input the number of lines:"
read count
for ((x=0; x <=count-1; x+=1))
do
    echo "Input number:"
    read val
    total=$((total+val))
done
printf "The average of all numbers is %.3f" $(echo $total/$count | bc -l)