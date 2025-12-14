/* Write your T-SQL query statement below */
SELECT v.customer_id,
Count(customer_id) AS count_no_trans
FROM Visits AS v
LEFT JOIN Transactions AS t
ON v.visit_id = t.visit_id
Where t.transaction_id IS NULL
GROUP BY v.customer_id
ORDER BY Count(customer_id)