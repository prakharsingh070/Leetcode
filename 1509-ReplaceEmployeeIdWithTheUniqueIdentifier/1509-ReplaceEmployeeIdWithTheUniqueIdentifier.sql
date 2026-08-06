-- Last updated: 8/6/2026, 12:14:46 PM
select unique_id, name from Employees Left join EmployeeUNI on Employees.id = EmployeeUNI.id
