package com.svartvalp.devdbprac3;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document
public class Student {
    @Id
    @Field(name = "std_id")
    private String stdId;
    @Field(name = "std_fullname")
    private String stdFullName;
    @Field(name = "std_login")
    private String stdLogin;
    @Field(name = "std_pswd")
    private String stdPswd;
}
