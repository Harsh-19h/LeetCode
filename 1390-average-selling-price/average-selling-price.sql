/* Write your T-SQL query statement below */
SELECT p.product_id,
    ROUND(COALESCE(sum(p.price*u.units)*1.0/ sum(u.units),0),2)
     as average_price
FROM prices AS p
LEFT JOIN UnitsSold  AS u
ON p.product_id = u.product_id
and u.purchase_date between p.start_date and p.end_date
GROUP BY p.product_id