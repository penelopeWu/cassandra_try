package com.example.cassandra_try;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Data
@Table("users")
public class User {
    @PrimaryKey
    private int userid;
    private String fname;
    private String lname;
}
