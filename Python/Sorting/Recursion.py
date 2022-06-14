def factorial(num):
    if num == 0:
        return 1
    else:
        rest_call = factorial(num - 1)
        return num * rest_call


print(factorial(4))  # returns 24
print(factorial(0))  # returns 1
    
