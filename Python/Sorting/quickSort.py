def quickSort(arr, start, end):
    if start == end:  # check if the partition only contains one element
        return
    else:
        part = partition(arr, start, end)
        quickSort(arr, start, part)  # sort the left side of pivot
        quickSort(arr, part, end)  # sort the right side of pivot


def partition(arr, start, end):
    pivot = arr[end]  # use last element as pivot
    i = start - 1  # place the first pointer outside of the array
    for j in range(end):
        if arr[j] < pivot:  # swap if the element belongs to right side of pivot
            i += 1
            arr[i], arr[j] = arr[j], arr[i]  # swap
    arr[i+1], arr[end] = arr[end], arr[i+1]  # place pivot into the correct slot
    return i + 1  # index of pivot


def test():
    arr = [9, -3, 5, 2, 6, 8, -6, 1, 3]
    quickSort(arr, 0, len(arr)-1)


test()
