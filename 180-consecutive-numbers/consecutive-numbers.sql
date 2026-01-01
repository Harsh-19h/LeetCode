/* Write your T-SQL query statement below */
select distinct num as ConsecutiveNums
from (select num, 
        Lag(num,1) over (order by id) as prev1,
        Lag(num,2) over (order by id) as prev2
        from Logs
     )t
where num = prev1 and num =prev2
