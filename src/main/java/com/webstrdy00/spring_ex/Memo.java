package com.webstrdy00.spring_ex;

import lombok.*;
@Getter   // get 메서드 자동으로 추가
@Setter   // set 메서드 자동으로 추가
//@AllArgsConstructor   // 모든 값을 가지는 생성자를 자동으로 생성
//@NoArgsConstructor  // 아무 값도 안가지는 생성자를 자동으로 생성
@RequiredArgsConstructor   // 필수로 가져야하는 값만 설정해서 생성자를 생성(final로 설정)
public class Memo {
    private final String username;
    private String contents;
}
