package com.oktaapi.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SecurityQuestionFactorProfile  {
  
  @ApiModelProperty(value = "")
  private String answer = null;

  @ApiModelProperty(value = "")
  private String question = null;

  @ApiModelProperty(value = "")
  private String questionText = null;
 /**
   * Get answer
   * @return answer
  **/
  @JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public SecurityQuestionFactorProfile answer(String answer) {
    this.answer = answer;
    return this;
  }

 /**
   * Get question
   * @return question
  **/
  @JsonProperty("question")
  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public SecurityQuestionFactorProfile question(String question) {
    this.question = question;
    return this;
  }

 /**
   * Get questionText
   * @return questionText
  **/
  @JsonProperty("questionText")
  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  public SecurityQuestionFactorProfile questionText(String questionText) {
    this.questionText = questionText;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityQuestionFactorProfile {\n");
    
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    questionText: ").append(toIndentedString(questionText)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

