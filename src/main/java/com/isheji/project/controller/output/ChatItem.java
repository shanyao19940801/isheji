package com.isheji.project.controller.output;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ChatItem {
    private String name;
    private String content;
    private String timestamp;
}
