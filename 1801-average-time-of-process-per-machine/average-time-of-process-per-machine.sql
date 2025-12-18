# Write your MySQL query statement below
select machine_id,round(avg(timestamp),3) processing_time from 
(select machine_id,process_id,
sum(case when activity_type='start' then -timestamp else timestamp 
end) timestamp
from Activity

group by machine_id,process_id) as x
group by machine_id;