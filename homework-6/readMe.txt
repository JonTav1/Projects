Nim game

To not make this long,because its only 3 points,
 i basically gave the human and computer a value of 1 and 0 to alternate which one goes after each turn. 
for the computer moves, for the "easy" difficulty i made a random number generator with bounds (n/2)+ 1 to make it impossible
to have 0 as a move and make it so having a max move of n/2 is possible since just n/2 would only make the top bound
n/2-1. for the "smart" computer, i set up 2 main or statements, although it isnt the most optimal thing, it was the easiest for
me lol. basically one main or statement to see if the marbles left are a power of 2-1, so the computer chooses a random int, and if 
that one didnt go through, another if statement that chose a random integer, and if the value of the marbles left after subtracting
the integer wasnt a power of 2-1, the computer kept "thinking" of choices until it got a valid value. 


Zipcode

Zip to barcode 

i set up an array with all the half and full lines for each digit, which coincided with the index in the array, so array 0 had
"||:::", for zipcode i just found each character in the zipcode and matched it with the valid index in the array, copying that to a 
new array, then made a string with the array that would be returned 

barcode to zip

i used the same array with all the ::||| tings as before, but now i had to set up a bunch of if and for statements
to be able to set up a substring for each value from the barcode, then iterated through the "codes" array to match it with a one of 
the strings in the array i made. then, i basically made a new array with the indexes of the parts of the barcode that matched with
the arrar, resulting in the zipcode. 
