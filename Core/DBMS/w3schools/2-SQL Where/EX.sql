-- Select all records where the City column has the value "Berlin".
SELECT * FROM Customers WHERE City = 'Berlin';

-- Use the NOT keyword to select all records where City is NOT "Berlin".
SELECT * FROM Customers WHERE NOT City  = 'Berlin';

-- Select all records where the CustomerID column has the value 32.
SELECT * FROM Customers Where CustomerID  = 32;

-- Select all records where the City column has the value 'Berlin' and the PostalCode column has the value 12209.
Select * FROM Customers Where City = 'Berlin' and PostalCode = 12209;

-- Select all records where the City column has the value 'Berlin' or 'London'.
Select * FROM Customers Where City = 'Berlin' or City = 'London';

