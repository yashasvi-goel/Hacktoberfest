import random

arrSize = 10
j = 0
arr = []
for i in range(0, arrSize):
    arr.append(random.randint(1, 10)) # set the range for random numbers in array

while True:
    sorted = True
    for i in range(j, arrSize - 1):
        if arr[i] > arr[i + 1]:
            sorted = False
            arr[i], arr[i + 1] = arr[i + 1], arr[i]
    for i in range(arrSize - 2, j - 1, -1):
        if arr[i] > arr[i + 1]:
            sorted = False
            arr[i], arr[i + 1] = arr[i + 1], arr[i]
    if sorted:
        break
    arrSize -= 1
    j += 1

    print(arr)
    