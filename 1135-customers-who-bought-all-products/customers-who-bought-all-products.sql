# Write your MySQL query statement below
Select customer_id
from Customer
group by Customer_id
having count(distinct product_key) = (select count(*) from Product)