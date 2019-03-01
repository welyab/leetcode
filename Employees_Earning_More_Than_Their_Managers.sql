# https://leetcode.com/problems/employees-earning-more-than-their-managers/
select e.name as Employee
from employee e
join employee m on m.id = e.managerid
where e.salary > m.salary