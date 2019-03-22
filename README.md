# MakeChange
### Project
In the cash register we will calculate the amount of change returned to a customer based on the purchase price and the amount tendered. We will also notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change for the customer. Change should be provided using the largest bill and coin denominations as possible. Denominations that are not used should not be displayed.

User Story #1
The user is prompted asking for the price of the item.

User Story #2
The user is then prompted asking how much money was tendered by the customer.

User Story #3
Display an appropriate message if the customer provided too little money or the exact amount.

User Story #4
If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.

### Overview
This is the MakeChange.java project. It requires two different parameters to function correctly. 
First the user is prompted for the items price followed by a prompt for the tendered amount. Depending on both values
the program reacts accordingly. Within the program the system loops through the program as long as the user does not type
"no" when prompted. First, if the tendered value is less then the item price an error messgae is displayed. If the tendered 
amount is equal to the item price a message stating the two values are equal displays. Alternatively, if the tendered amount 
is greater then the item price the program executes the getChange() method. Within the getChange() method the program begins 
comparing the balance to change Denominations array and subtrating each quantity from the total at each counter iterations. 
The program also rounds the values to the nearest whole number using the Math.round function. After the balance = 0 
the monetary values in the Change Bills array are called upon. The print line displays the result total, counter quantity for 
each denominations, and the associated montary face value from the Change Bill String array. 

# OOPs Concepts used  
* Java SE/EE Fundamentals

# Tools Used
* Java
* Git
* Eclipse IDE




