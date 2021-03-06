# Challenge Summary
- Creating a class called `AnimalShelter` which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
- You have to implement the following methods
1. enqueue
- Arguments: animal. 
- `animal` can be either a dog or a cat object.

2. dequeue
- Arguments: pref
- `pref` can be either "`dog`" or "`cat`"
- Return: either a `dog` or a `cat`, based on preference.
- If pref is not "dog" or "cat" then return `null`.

## Whiteboard Process
![stack-queue-animal-shelter](stack-queue-animal-shelter.png)

## Approach & Efficiency
1. **Big O for enqueue method**
- Time: O(1)
- Space:O(1)
2. **Big O for dequeue method**
- Time: O(1)
- Space: O(1)

## Solution
- [The Code of the challenge](src/main/java/codeChallenge12/AnimalShelter.java)
- [The Test Code for the methods](src/test/java/codeChallenge12/AppTest.java)