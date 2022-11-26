package com.digitalfactory.technicaltest.service;

import com.digitalfactory.technicaltest.mapper.PlotMapper;
import com.digitalfactory.technicaltest.repository.PlotIrrigationDetailsRepository;
import com.digitalfactory.technicaltest.repository.PlotRepository;
import com.digitalfactory.technicaltest.service.impl.PlotServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class PlotServiceTest {

  private final String COURSE_NAME = "gcp";
  @Mock
  private PlotRepository plotRepository;

  @Mock
  private PlotMapper plotMapper;

 @Mock
 private PlotIrrigationDetailsRepository irrigationDetailsRepository;

  private PlotService plotService;

  @Before
  public void setUp() {
    plotService = new PlotServiceImpl(plotRepository, plotMapper, irrigationDetailsRepository);
  }

//  @Test
//  public void givenMissingCourse_whenCreate_throwIllegalArgumentException() {
//    // Given
//    final AddPlotRequest addPlotRequest = new AddPlotRequest();
//
//    // When
//    assertThatThrownBy(() -> plotService.create(addPlotRequest))
//            // Then
//            .isInstanceOf(IllegalArgumentException.class)
//            .hasMessage("Empty Course title");
//  }

//  @Test
//  public void givenMissingSubject_whenCreate_throwIllegalArgumentException() {
//    // Given
//    final AddPlotRequest addPlotRequest = new AddPlotRequest();
//    addPlotRequest.setCourseName(COURSE_NAME);
//
//    // When
//    assertThatThrownBy(() -> plotService.create(addPlotRequest))
//        // Then
//        .isInstanceOf(IllegalArgumentException.class)
//        .hasMessage("At-least 1 subject should be present in the course.");
//  }
//
//  @Test
//  public void givenDuplicateCourse_whenCreate_throwIllegalArgumentException() {
//    // Given
//    final String subject = "hindi";
//    final AddPlotRequest addPlotRequest = new AddPlotRequest();
//    addPlotRequest.setCourseName(COURSE_NAME);
//    addPlotRequest.setSubjects(Set.of(subject));
//
//    when(plotRepository.findAllActiveByCourse(any())).thenReturn(plot);
//
//    // When
//    assertThatThrownBy(() -> plotService.create(addPlotRequest))
//        // Then
//        .isInstanceOf(IllegalArgumentException.class)
//        .hasMessage("Duplicate course code");
//  }
//
//  @Test
//  public void givenInvalidSubject_whenCreate_throwIllegalArgumentException() {
//    // Given
//    final String subject = "hindi";
//    final AddPlotRequest addPlotRequest = new AddPlotRequest();
//    addPlotRequest.setCourseName(COURSE_NAME);
//    addPlotRequest.setSubjects(Set.of(subject));
//
//    when(subjectRepository.findBySubjectName(any())).thenReturn(null);
//
//    // When
//    assertThatThrownBy(() -> plotService.create(addPlotRequest))
//        // Then
//        .isInstanceOf(NotFoundException.class)
//        .hasMessage("Invalid Subject: " + subject);
//  }

  @Test
  public void givenInvalidCourse_whenUpdate_throwNotFoundException() {
    // Given
    final String courseName = "GCP";
//
//
//    // When
//    assertThatThrownBy(() -> plotService.update(courseRequest, courseName))
//        // Then
//        .isInstanceOf(NotFoundException.class)
//        .hasMessage("Course not found: " + courseName);
//  }
//
//  @Test
//  public void givenMissingSubject_whenUpdate_throwNotFoundException() {
//    // Given
//    final String courseName = "GCP";
//    final CoursesUpsertRequest courseRequest = new AddPlotRequest();
//
//    when(plotRepository.findAllActiveByCourse(any())).thenReturn(plot);
//
//    // When
//    assertThatThrownBy(() -> plotService.update(courseRequest, courseName))
//        // Then
//        .isInstanceOf(IllegalArgumentException.class)
//        .hasMessage("At-least 1 subject should be present in the course.");
//  }
//
//  @Test
//  public void givenInvalidSubject_whenUpdate_throwNotFoundException() {
//    // Given
//    final String courseName = "GCP";
//    final String subjectName = "hindi";
//    final CoursesUpsertRequest courseRequest = new AddPlotRequest();
//    courseRequest.setSubjects(Set.of(subjectName));
//
//    when(plotRepository.findAllActiveByCourse(any())).thenReturn(plot);
//    when(subjectRepository.findBySubjectName(any())).thenReturn(null);
//
//    // When
//    assertThatThrownBy(() -> plotService.update(courseRequest, courseName))
//        // Then
//        .isInstanceOf(NotFoundException.class)
//        .hasMessage("Invalid Subject: " + subjectName);
//  }
//
//  @Test
//  public void givenValidCourse_whenDelete_returnSuccess() {
//    // Given
//    final String courseName = "GCP";
//
//    // When
//    when(plotRepository.findAllActiveByCourse(any())).thenReturn(plot);
//
//    // Then
//    plotService.delete(courseName);
//  }
//
//  @Test
//  public void givenInvalidCourse_whenUpdateCourseSubjects_throwNotFoundException() {
//    // Given
//    final String courseName = "GCP";
//    final CoursesUpsertRequest courseRequest = new AddPlotRequest();
//
//    // When
//    assertThatThrownBy(() -> plotService.updateCourseSubjects(courseRequest, courseName))
//        // Then
//        .isInstanceOf(NotFoundException.class)
//        .hasMessage("Course not found: " + courseName);
//  }
//
//  @Test
//  public void givenMissingSubject_whenUpdateCourseSubjects_throwNotFoundException() {
//    // Given
//    final String courseName = "GCP";
//    final CoursesUpsertRequest courseRequest = new AddPlotRequest();
//
//    when(plotRepository.findAllActiveByCourse(any())).thenReturn(plot);
//
//    // When
//    assertThatThrownBy(() -> plotService.update(courseRequest, courseName))
//        // Then
//        .isInstanceOf(IllegalArgumentException.class)
//        .hasMessage("At-least 1 subject should be present in the course.");
//  }
  }
}
