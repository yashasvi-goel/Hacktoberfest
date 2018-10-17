package main

func quicksort(arr []int) {
	qsort(arr, 0, len(arr)-1)
}

// Quicksort implementation based on Lumuto's method
// Performance will degrade when the input array contains elements of the same value
func qsort(arr []int, lo, hi int) {
	if lo >= hi {
		return
	}
	pivotIdx := partition(arr, lo, hi)
	qsort(arr, 0, pivotIdx-1)
	qsort(arr, pivotIdx, hi)
}

func partition(arr []int, lo, hi int) int {
	pivot := arr[lo]

	left, right := lo, lo+1
	for right <= hi {
		if !(pivot < arr[right]) {
			left++
			arr[left], arr[right] = arr[right], arr[left]
		}
		right++
	}

	arr[lo], arr[left] = arr[left], arr[lo]
	return left + 1
}
