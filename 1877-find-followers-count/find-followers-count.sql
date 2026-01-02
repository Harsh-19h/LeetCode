/* Write your T-SQL query statement below */
select distinct user_id,
count(follower_id) over (partition by user_id) as followers_count
from Followers
group by user_id,follower_id
order by user_id

