--insert into Employee(EmployeeID,EmployeeName,EmployeeDesignation,DepartmentId) values(1,'Karan','Sr Software Engineer',101)
--insert into Employee(EmployeeID,EmployeeName,EmployeeDesignation,DepartmentId) values(2,'Kunal','Sr BigData Engineer',102)
--insert into Employee(EmployeeID,EmployeeName,EmployeeDesignation,DepartmentId) values(3,'Akshat','Intern',null)
---insert into Employee(EmployeeID,EmployeeName,EmployeeDesignation,DepartmentId) values(4,'parth','Engineer',107)
insert into Employee(EmployeeID,EmployeeName,EmployeeDesignation,DepartmentId) values(5,'Dhruv','Mnager',101)
insert into Employee(EmployeeID,EmployeeName,EmployeeDesignation,DepartmentId) values(6,'Anurag','Employee',10


--insert into Department(DepartmentId,DepartmentName) values(101,'Sales')
--insert into Department(DepartmentId,DepartmentName) values(102,'IT')
--insert into Department(DepartmentId,DepartmentName) values(103,'HR')

select * from Department
select * from Employee

update Employee set Salary=9000 where EmployeeID = 6

update Employee set DepartmentId=102 where EmployeeID = 3


select * from Department as dep inner join Employee as emp on dep.DepartmentId = emp.DepartmentId 

select dep.DepartmentName from Department as dep right join Employee as emp on dep.DepartmentId = emp.DepartmentId 

select * from Department as dep  full outer join Employee as emp on dep.DepartmentId = emp.DepartmentId 

select * from Department as dep inner join Employee as emp on dep.DepartmentId = emp.DepartmentId

select max(emp.Salary) as salary,dep.DepartmentId from Department as dep inner join Employee as emp on dep.DepartmentId = emp.DepartmentId
 group by dep.DepartmentId


select dep.DepartmentId,max(emp.Salary),emp.EmployeeID from Department as dep inner join Employee as emp on dep.DepartmentId = emp.DepartmentId
 group by dep.DepartmentId,emp.EmployeeID


select EmployeeName,DepartmentId,Salary,DepartmentId from 
Employee where DepartmentId in 
(select DepartmentId from Employee group by DepartmentId) order by Salary desc


 
 
 
  select e.EmployeeName,e.DepartmentId,e.Salary
		from Employee e 
		inner join
		(select d1.DepartmentId,AVG(e1.Salary) as avgsal from Employee  e1 inner join Department d1 on e1.DepartmentId=d1.DepartmentId group by d1.DepartmentId) as t 
		on e.DepartmentId = t.DepartmentId and e.Salary > avgsal order by e.Salary desc
		
		 select e.EmployeeName,e.DepartmentId,e.Salary
		from Employee e 
		inner join
		(select d1.DepartmentId,Max(e1.Salary) as sal from Employee  e1 inner join Department d1 on e1.DepartmentId=d1.DepartmentId group by d1.DepartmentId) as f on e.DepartmentId = f.DepartmentId
		and e.Salary = sal
		
		Select * from Employee
		
		select * from Employee e1 where 3=
		(select COUNT(distinct e2.salary)from Employee e2 where e2.Salary > e1.Salary)
		
		
		(SELECT MIN(Salary)
                 FROM (
		SELECT DISTINCT TOP (2) Salary
                         FROM   Employee
                         ORDER  BY Salary DESC) as T)
						 
						 
						 
		select e.Name,e.DeptID
		from Employee e 
		inner join
		(select d1.DeptID,Max(e1.Age) as maxAge from Employee  e1 inner join Department d1 on e1.DeptID=d1.DeptID group by d1.DeptID) as f on e.DeptID = f.DeptID
		and e.Age = maxAge
		
		
		
		

		
		
		
