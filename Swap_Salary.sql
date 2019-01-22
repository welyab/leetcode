# https://leetcode.com/problems/swap-salary/
# Write your MySQL query statement below
update salary s 
set s.sex =
case when s.sex = 'm' then 'f'
     else 'm'
end