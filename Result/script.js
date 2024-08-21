 document.addEventListener('DOMContentLoaded', function() { 
 let productDetail = {
  name: "", description: "",  title: ""   };  
 
   const setProductDetail = (details) => { 
   productDetail = { ...productDetail, ...details }; 
  document.getElementById('product-name').textContent = productDetail.name;
   document.getElementById('product-description').textContent = productDetail.description;
        document.getElementById('product-title').textContent = productDetail.title;
     }; 
 
 
 const handleProductClick = (description, name, title) => { 
         setProductDetail({ description, name, title });
     };  

 
    document.getElementById('product1-img').addEventListener('click', function() { 
         handleProductClick("Description for Product 1", "Product1", "title1"); 
     }); 

    document.getElementById('product2-img').addEventListener('click', function() { 
         handleProductClick("Description for Product 2", "Product2", "title2");
     }); 
}); 
 
