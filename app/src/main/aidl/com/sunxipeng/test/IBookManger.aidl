// IBookManger.aidl
package com.sunxipeng.test;

/**
* aidl的所有包名都需要手动写代码实现类的导入
*
*/
import com.sunxipeng.test.Book;

// Declare any non-default types here with import statements

interface IBookManger {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */

          void addBook();

          List<Book> getBookList();
}
