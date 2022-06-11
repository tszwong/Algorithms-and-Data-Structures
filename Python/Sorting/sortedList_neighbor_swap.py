def neighbor_swap(list_nums):
    """
    takes a list as input and sorting it from least to greatest,
    then swapping the element of the list with its neighbor and
    returns the final swapped list
    """

    index = 0
    list_nums.sort()  # sort given list

    if len(list_nums) % 2 == 0:  # list with an even number of elements
        for num in list_nums:
        
            if (index + 1 >= len(list_nums)):  
                break
                
            num = list_nums[index]
            list_nums[index] = list_nums[index + 1]
            list_nums[index + 1] = num

            index += 2
            
    else:                        # list with an odd number of elements
        for num in list_nums:
        
            if (index + 1 >= len(list_nums) - 1):
                break
                
            num = list_nums[index]
            list_nums[index] = list_nums[index + 1]
            list_nums[index + 1] = num

            index += 2

    return list_nums


# print(f"neighbor_swap([1,4,2,3,5,9,10]): {neighbor_swap([1,4,2,3,5,9,10])}")
