package com.uhablog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uhablog.form.BookForm;
import com.uhablog.form.EditBookForm;
import com.uhablog.model.Book;
import com.uhablog.repository.BookRepository;

@Service
@Transactional
public class BookService {
	
    @Autowired
    BookRepository repository;
	
    /**
     * データベースから本の一覧を取得する
     * @return
     */
    public List<Book> findAll() {
        return repository.findAll();
    }
	
    /**
     * データベースにデータを登録する
     * @return
     */
    public void insert(BookForm bookForm) {
        // データベースに登録する値を保持するインスタンス
        Book book = new Book();
        // 画面から受け取った値をデータベースに保存するインスタンスに渡す
        book.setTitle(bookForm.getTitle());
        book.setPrice(bookForm.getPrice());
        // データベースに登録する
        repository.save(book);
    }
    
    /**
     * idからデータを取得する
     * @param id
     * @return
     */
    public EditBookForm getOneBook(Integer id) {

        // idを指定して本の情報を取得する
        Book book = repository.findById(id).orElseThrow();

        // 画面返却用のFormに値を設定する
        EditBookForm editBook = new EditBookForm();
        editBook.setId(book.getId());
        editBook.setTitle(book.getTitle());
        editBook.setPrice(book.getPrice());

        return editBook;
    }
    
    /**
     * 本の情報を更新する
     * @param editBook
     */
    public void update(EditBookForm editBook) {

        // データベースに登録する値を保持するインスタンスの作成
        Book book = new Book();

        // 画面から受け取った値を設定する
        book.setId(editBook.getId());
        book.setTitle(editBook.getTitle());
        book.setPrice(editBook.getPrice());

        // データベースを更新する
        repository.save(book);
    }
    
    /**
     * 本を削除する
     * @param id
     */
    public void delete(Integer id) {

        // idを指定して、データベースからデータを削除する
        repository.deleteById(id);
    }
}