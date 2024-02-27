package com.doan.elearning.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.doan.elearning.dto.ExamDto;
import com.doan.elearning.entity.Exam;
import com.doan.elearning.entity.Lesson;
import com.doan.elearning.repository.ExamRepository;
import com.doan.elearning.repository.LessonRepository;
import com.doan.elearning.service.ExamService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ExamServiceImple implements ExamService {
 private final ExamRepository examRepository;
    @Override
    public List<Exam> findAll() {
        return examRepository.findAll();
    }

    @Override
    public Exam findExam(Long id) {
      return examRepository.findExam(id);
    }

    @Override
    public List<Exam> findExamByClass(Long id) {
        
        return examRepository.findExamByClass(id);
    }

    @Override
    public Exam save(ExamDto examDto) {
           Exam exam= new Exam();
           exam.setName(examDto.getName());
           exam.setLink(examDto.getLink());
           exam.setDateExam(examDto.getDateExam());
           exam.setStartExam(examDto.getStartExam());
           exam.setEndExam(examDto.getEndExam());
           exam.setEclass(examDto.getEclass());
           exam.setIdTopic(examDto.getIdTopic()); 
        return examRepository.save(exam);
    }
    
}
