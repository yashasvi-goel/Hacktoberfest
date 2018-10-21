#!/bin/sh
# contribuitor: siuannybsr
# hacktoberfest 2018

bubble_sort() {
	array=$1
	array_length=${#array[@]}

	for (( i=0; i<$array_length; i++ )) do
	    for (( j=1; j<$array_length - i; j++ )) do
	        if [ ${array[$j - 1]} -gt ${array[$j]} ]; then
	            swap
	        fi
	    done
	done
}

swap() {
	temp=${array[$j - 1]}
	array[$j - 1]=${array[$j]}
	array[$j]=$temp
}

main() {
	array=("1" "3" "2" "1" "5" "13" "4" "8" "34" "21" "55")
	bubble_sort $array
	echo ${array[@]} | tr " " " "
}

main
