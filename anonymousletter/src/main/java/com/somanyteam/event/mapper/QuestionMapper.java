package com.somanyteam.event.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.somanyteam.event.dto.result.question.VariousQuestionsListResult;
import com.somanyteam.event.entity.Question;

import java.util.List;

public interface QuestionMapper extends BaseMapper<Question> {

//    int deleteByPrimaryKey(Long id);
//
//    int insert(Question record);
//
//    Question selectByPrimaryKey(Long id);
//
//    List<Question> selectAll();
//
//    int updateByPrimaryKey(Question record);

    List<VariousQuestionsListResult> getUnansweredQuestion(String userId);


    /**
     * 获取已回答列表：获取父问题以及子问题都回答的父问题列表
     * @param userId 用户id
     * @return
     */
    List<Question> getAllAnsweredParentQuestion(String userId);

    /**
     * 获取已回答列表：获取父问题下存在未回答子问题的父问题列表
     * @param userId 用户id
     * @return
     */
    List<Question> getNotAllAnsweredParentQuestion(String userId);

    int deleteQuestion(String userId,String id);

    List<VariousQuestionsListResult> getPublicQuestions(String userId);

}