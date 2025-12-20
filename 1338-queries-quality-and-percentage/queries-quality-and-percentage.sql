/* Write your T-SQL query statement below */
select query_name,
ROUND(avg(rating*1.0/position),2) AS quality,
ROUND(avg(case when rating < 3 then 1.0 else 0 end)*100,2) AS poor_query_percentage 
FROM Queries 
group by query_name
