# Write your MySQL query statement below
select email as Email from person tabel group by email having count(email)>1;
