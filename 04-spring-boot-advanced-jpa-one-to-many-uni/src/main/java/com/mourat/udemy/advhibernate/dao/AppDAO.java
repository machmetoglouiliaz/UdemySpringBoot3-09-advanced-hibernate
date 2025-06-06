package com.mourat.udemy.advhibernate.dao;

import com.mourat.udemy.advhibernate.entity.Course;
import com.mourat.udemy.advhibernate.entity.Instructor;
import com.mourat.udemy.advhibernate.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {

    void saveInstructor(Instructor instructor);

    Instructor findInstructorById(int id);

    void deleteInstructorById(int id);

    void saveInstructorDetail(InstructorDetail detail);

    InstructorDetail findInstructorDetailById(int id);

    void deleteInstructorDetailById(int id);

    List<Course> findCoursesByInstructorId(int id);

    Instructor findInstructorByIdJoinFetch(int id);

    void update(Instructor instructor);

    void deleteCourseById(int id);

    void deleteCourse(Course course);

    void saveCourse(Course course);

    Course findCourseById(int id);

}
