# SpringBootDemo
This is a standalone project which uses spring boot and JPA. I used in memory database so that if someone want to run this from an eclipse they can run without installing anything. 
1.	This project creates three tables in the database Student, Courses and CoursesTaken. All of them are mapped with @Entity tag with each having primary key as id.
2.	All tables have ORM mapping with Repository class for CRUD operations. 
3.	Course/Students can be added with post method as follows
   

4.	Student can only add courses which are already added…
5.	If the student is removed all the entries of student in CoursesTaken will be removed.
6.	


7.		2.1). add a new student along with their course registrations.
                         You can fire away following json with POST method on url: localhost:8080/students to add a student.
		 

	2.2). Delete a student.
	 

	2.3).Get all students, sorted by their name, for a given course with course name as input.
		 

 
	2.4). What if we want to record course scores?  What possible changes need to be made? 
                       Explain briefly.
		This is taken care of in CourseTaken table. (Which is not a good way to do it..)
		This should be done in a different table Like MarkSheet.
	2.5). How to find all students who don’t register for a given course?  
		We have CoursesTakenTable we can execute
		Select CoursesTaken.studentId from CoursesTaken where coursed=’givenId’
		Once we have all the students for course we can compare existing courses like following….
 

