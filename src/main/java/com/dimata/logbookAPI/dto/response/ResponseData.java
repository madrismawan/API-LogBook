package com.dimata.logbookAPI.dto.response;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ResponseData <T> {
    private boolean status;
    private List<String> message = new ArrayList<>();
    private T payload;

}
