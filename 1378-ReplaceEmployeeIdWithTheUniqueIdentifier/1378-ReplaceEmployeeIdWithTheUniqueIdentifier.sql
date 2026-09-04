-- Last updated: 9/4/2026, 4:51:31 PM
select unique_id, name from Employees Left join EmployeeUNI on Employees.id = EmployeeUNI.id
