def find_duplicates_nested_loop(dog: list) -> list:
    i=0
    j=0
    cat=[]
    
    while i<len(dog):
        j=i+1
        while j<len(dog):
            if dog[i] == dog[j]:
                cat.append(dog[i])
                break
            j+=1
        i+=1
    return cat

if __name__ == "__main__":
    sample1 = [3,7,5,6,7,4,8,5,7,66]
    sample2 = [3,5,6,4,4,5,66,6,7,6]
    sample3 = [3,0,5,1,0]
    sample4 = [3]

    print("Sample 1:", find_duplicates_nested_loop(sample1))
    print("Sample 2:", find_duplicates_nested_loop(sample2))
    print("Sample 3:", find_duplicates_nested_loop(sample3))
    print("Sample 4:", find_duplicates_nested_loop(sample4))