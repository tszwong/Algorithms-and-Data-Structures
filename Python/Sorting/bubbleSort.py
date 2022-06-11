def bubbleSort(arr):

    length_list = len(arr)
    i = 0

    for item in range(length_list):
        for i in range(length_list):
            if i + 1 >= length_list:
                break
            if arr[i] > arr[i+1]:
                swap_num = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = swap_num
            i += 1

    return arr


arr = [1, 34, 5, 34, 55, 11, 29]
print(f"arr = [1, 34, 5, 34, 55, 11, 29]:  {bubbleSort(arr)}")
