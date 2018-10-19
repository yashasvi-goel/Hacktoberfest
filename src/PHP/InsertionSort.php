<?php

/*
*Function for sorting an array with insertion sort algorithms
*/


function sortInsertion($array) {
    $sortedArray = array();
    for ($i = 0 ; $i &lt; count($array); $i++) {
        $element = $array[$i];
        $j = $i;
        while($j &gt; 0 &amp;&amp; $sortedArray[$j-1] &gt; $element) {
           $sortedArray[$j] = $sortedArray[$j-1];
            $j = $j-1;
        }&lt;
        $sortedArray[$j] = $element;
    }
    return $sortedArray;
}

$unsorted = [5,2,6,8,4];
$val = sortInsertion($unsorted);
print_r($val);

?>
