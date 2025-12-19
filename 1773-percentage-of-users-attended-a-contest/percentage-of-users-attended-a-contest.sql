/* Write your T-SQL query statement below */
select contest_id,
round(count(distinct user_id)*100*1.0/(select count(user_id)from users),2)
as percentage
from Register
group by contest_id
order by percentage desc,contest_id asc