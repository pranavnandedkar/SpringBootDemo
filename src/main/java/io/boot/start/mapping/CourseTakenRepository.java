package io.boot.start.mapping;

import org.springframework.data.repository.CrudRepository;

public interface CourseTakenRepository extends CrudRepository<CourseTaken, String>{

	CourseTaken findByStudentIdAndCourseId(String studentId, String courseId);
	Iterable<CourseTaken> findAllByStudentId(String studentId);

}
