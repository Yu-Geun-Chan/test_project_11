package com.koreait.surl_project_11;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class Surl {
    private Long id;
    @Builder.Default
    private LocalDateTime createDate = LocalDateTime.now();
    @Builder.Default
    private LocalDateTime modifyDate = LocalDateTime.now();
    private String body;
    private String url;


}
