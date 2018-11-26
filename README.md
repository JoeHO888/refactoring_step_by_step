# refactoring_step_by_step

##### private => public

- create a getter 
- Run Test
- find usage
- Run Test
- change .age to getAge() inside Police Class
- Run Test
- change private to public in Driver

##### Change function name 
- Find usage
- Run Test
- Change function name

##### Add new vaiable to denote a const 
- Create a private const variable with value = 18
- Run Test
- Change 18 in constructor to this variable

##### Eliminate if else
- Find Usage
- change if else expression to (driver.getAge()>=adultAgeThreshold)
