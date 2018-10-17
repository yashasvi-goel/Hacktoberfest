
$unsorted = array(40,21,2,1,9,24,2,99,23,8,7,114,92,59); //Take some unsorted array as example 

function quick_sort($array)
{
	// first find array size
	$length = count($array);
	
	// base case test, if array of length 0 then just return array to the caller
	if($length <= 1){
		return $array;
	}
	else{
	
		// select an item to act as our pivot or initial or fixed point, since list is unsorted first position is easiest to start with
		$pivot = $array[0];
		
		// declare our two arrays to act as partitions
		$left = $right = array();
		
		// lets loop and compare each item in the array to the pivot or fixed value, place item in appropriate partition
		for($i = 1; $i < count($array); $i++)
		{
			if($array[$i] < $pivot){
				$left[] = $array[$i];
			}
			else{
				$right[] = $array[$i];
			}
		}
		
		// Lets use recursion now to sort the left and right lists :)
		return array_merge(quick_sort($left), array($pivot), quick_sort($right)); 
	}
}

$sorted = quick_sort($unsorted);  //called
print_r($sorted); //lets show to the world
