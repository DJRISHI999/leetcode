'''a) Write a Python program to connect to a SQLite database called store.db. After connecting, create a table named "products" with the following columns: 
 product_id (INTEGER, primary key), product_name (TEXT), price (REAL), quantity (INTEGER)
b) Write a Python program to insert the following data into the "products" table: 
 product_name: "Laptop" 
 price: 800.50 
 quantity: 10
 c) Write a Python program to add a "description" column (TEXT) to the "products" table.
d) Write a Python program to count how many products are there in the "products" table.
e) Write a Python program to retrieve all products from the "products" table where the price is greater than '''



import sqlite3
#creating a connection to the SQLite database
conn = sqlite3.connect('store.db')
#creating a cursor object to execute SQL commands
cursor = conn.cursor()
#creating a table named "products" with the specified columns
cursor.execute('''
CREATE TABLE IF NOT EXISTS products (
    product_id INTEGER PRIMARY KEY,
    product_name TEXT,
    price REAL,
    quantity INTEGER
)''')
#inserting data into the "products" table

cursor.execute('''
INSERT INTO products (product_name, price, quantity)
VALUES (?, ?, ?)
''', ('Laptop', 800.50, 10))
#committing the changes to the database
conn.commit()
#adding a "description" column to the "products" table
cursor.execute('''
ALTER TABLE products
ADD COLUMN description TEXT
''')
#committing the changes to the database
conn.commit()
#counting how many products are in the "products" table
cursor.execute('''
SELECT COUNT(*) FROM products
''')
count = cursor.fetchone()[0]
#printing the count of products
print(f'Total number of products: {count}')

#retrieving all products from the "products" table where the price is greater than 500
cursor.execute('''
SELECT * FROM products WHERE price > ?
''', (500,))
