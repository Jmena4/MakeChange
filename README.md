# MakeChange
This is the MakeChange.java project for week one. It requires two different parameters to function correctly. 
First the user is prompted for the items price followed by a prompt for the tendered amount. Depending on both values
the program reacts accordingly. Within the program the system loops through the program as long as the user does not type
"no" when prompted. First, if the tendered value is less then the item price an error messgae is displayed. If the tendered 
amount is equal to the item price a message stating the two values are equal displays. Alternatively, if the tendered amount 
is greater then the item price the program executes the getChange() method. Within the getChange() method the program begins 
comparing the balance to change Denominations array and subtrating each quantity from the total at each counter iterations. 
The program also rounds the values to the nearest whole number using the Math.round function. After the balance = 0 
the monetary values in the Change Bills array are called upon. The print line displays the result total, counter quantity for 
each denominations, and the associated montary face value from the Change Bill String array. 


