package com.example.demo.dto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class Questions {

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private  Long id;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String question;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String option1;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String option2;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String option3;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String option4;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String correctanswer;

    @NotNull(message = "is required")
    @Size(min = 1,message = "is required")
    private String useranswer;

    public Questions(){

    }
    public Questions(Long id, String question, String option1, String option2, String option3, String option4, String correctanswer) {
        this.id=id;
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.correctanswer = correctanswer;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", option1='" + option1 + '\'' +
                ", option2='" + option2 + '\'' +
                ", option3='" + option3 + '\'' +
                ", option4='" + option4 + '\'' +
                ", correctanswer='" + correctanswer + '\'' +
                ", useranswer='" + useranswer + '\'' +
                '}';
    }
}
