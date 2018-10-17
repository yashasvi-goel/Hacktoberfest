package main

import (
	"sort"
	"testing"
)

func TestQuicksort(t *testing.T) {
	t.Run("random array", func(t *testing.T) {
		arr := []int{2, 5, 1, 4, 6, 0, 3, 9}

		quicksort(arr)
		if !sort.IntsAreSorted(arr) {
			t.Fail()
		}
	})

	t.Run("descendingly-sorted array", func(t *testing.T) {
		arr := []int{7, 6, 5, 4, 3, 2, 1, 0}

		quicksort(arr)
		if !sort.IntsAreSorted(arr) {
			t.Fail()
		}
	})

	t.Run("ascendingly sorted array", func(t *testing.T) {
		arr := []int{1, 2, 3, 4, 5, 6, 7}

		quicksort(arr)
		if !sort.IntsAreSorted(arr) {
			t.Fail()
		}
	})
}
