# Write your MySQL query statement below
select max(num) As 'num' FROM
(select num from MyNumbers group by(num) having count(num)=1) AS T;