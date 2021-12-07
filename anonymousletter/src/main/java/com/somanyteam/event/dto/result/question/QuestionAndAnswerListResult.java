package com.somanyteam.event.dto.result.question;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @program: somanyteams
 * @description: 获取问题和答案结果集
 * @author: 周华娟
 * @create: 2021-11-21 22:56
 **/
@Data
@ApiModel("获取问题和答案结果集")
public class QuestionAndAnswerListResult {

//    @ApiModelProperty(value = "所有问题", required = true)
//    private List<QuestionResult> allQuestion;
//
//    @ApiModelProperty(value = "所有答案", required = true)
//    private List<AnswerResult> allAnswer;

    @ApiModelProperty(value = "一个问题一个答案集合", required = true)
    private List<QuestionAndAnswerResult> resultList;

    @ApiModelProperty(value = "提问者id")
    private String qUsername;

    @ApiModelProperty(value = "回答者id")
    private String aUsername;
}
