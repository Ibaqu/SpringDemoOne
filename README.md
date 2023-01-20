# Learning Spring Framework

## Exercise 1

- Learned how to install Spring and Tomcat
- Worked on 'Inversion of Control'
	- Created a Spring Bean in the `applicationContext.xml` file
	- Used to it specify which class must be used and demonstrated in `HelloSpringApp`
	- Defined a new Class implementing Coach and changed the config file to see if the scenario still works
	
## Exercise 2

- Learned how to make use of Spring Dependency injection by defining a new bean linking a 'Happy Fortune' class 
	- The new bean makes use of a `constructor-arg` in the `applicationContext.xml` file. 
- Learned how to make use of Spring Setter injection by defining a new bean linking it to the Cricket Coach class
	- The new bean makes use of a `property` in the `applicationContext.xml` file.
