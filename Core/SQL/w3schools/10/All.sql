SQL Wildcard
-- Select all records where the second letter of the City is an "a".
SELECT * FROM Customers WHERE City LIKE '_a%';

-- Select all records where the first letter of the City is an "a" or a "c" or an "s".
SELECT * FROM Customers WHERE City LIKE '[acs]%';

-- Select all records where the first letter of the City starts with anything from an "a" to an "f".
SELECT * FROM Customers WHERE City LIKE '[a-f]%';

-- Select all records where the first letter of the City is NOT an "a" or a "c" or an "f".
SELECT * FROM Customers WHERE City LIKE '[!acf]%';


SQL In
The IN operator allows you to specify multiple values in a WHERE clause.

-- Use the IN operator to select all the records where Country is either "Norway" or "France".
SELECT * FROM Customers WHERE Country IN ('Norway','France');


-- Use the IN operator to select all the records where Country is NOT "Norway" and NOT "France".
SELECT * FROM Customers WHERE Country NOT IN ('Norway', 'France');

SQL Between 

-- Use the BETWEEN operator to select all the records where the value of the Price column is between 10 and 20.
SELECT * FROM Products WHERE Price BETWEEN 10 AND 20;

-- Use the BETWEEN operator to select all the records where the value of the Price column is NOT between 10 and 20.
SELECT * FROM Products WHERE Price  NOT BETWEEN 10 AND 20;

-- Use the BETWEEN operator to select all the records where the value of the ProductName column is alphabetically between 'Geitost' and 'Pavlova'.
SELECT * FROM Products WHERE ProductName  BETWEEN 'Geitost' AND 'Pavlova';

SQL Alias 
SQL aliases are used to give a table, or a column in a table, a temporary name. An alias is created with the AS keyword.

-- When displaying the Customers table, make an ALIAS of the PostalCode column, the column should be called Pno instead.
SELECT CustomerName,Address,PostalCode AS Pno FROM Customers;

-- When displaying the Customers table, refer to the table as Consumers instead of Customers.
SELECT * FROM Customers AS Consumers;



