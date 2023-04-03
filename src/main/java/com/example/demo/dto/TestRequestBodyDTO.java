package com.example.demo.dto;

import lombok.Data;

@Data // 에러가 발새하는 경우 Ctrl + 1 키를 누른 후 맨 위에 나오는 import를 선택한다.
public class TestRequestBodyDTO {
	private int id;
	private String message;
}
