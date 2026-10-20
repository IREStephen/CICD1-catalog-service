This lab does manage the product catalog 
The port is 8081
End points are the GET /api/products and the POST /api/products
This service stores any product in the List<Product>

db<>fiddle link: https://dbfiddle.uk/Oqn3hZhu

Lab 5

Product has a link to Category 

so now POST /products needs an existing categoryId:

If categoryId isn't there it just wont make a product

