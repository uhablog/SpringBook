package com.uhablog.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class EditBookForm {
	
    /**
     * 本のIDを保持する
     * チェック内容：Nullでないこと
     */
    @NotNull(message="IDがNullになっています")
    private Integer id;
	
    /**
     * 本のタイトルを保持する
     * チェック内容：未入力でないこと
     */
    @NotBlank(message="タイトルを入力してください")
    private String title;
	
    /**
     * 本の値段を保持する
     * チェック内容：Nullでないこと、プラスであること
     */
    @NotNull(message="値段を入力してください")
    @Positive(message="値段はプラスの値を入力してください")
    private Integer price;
}