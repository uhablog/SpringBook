package com.uhablog.form;

import lombok.Data;

@Data
public class BookForm {
    /**
     * 本のタイトルを保持する
     */
    private String title;
	
    /**
     * 本の値段を保持する
     */
    private Integer price;

}
