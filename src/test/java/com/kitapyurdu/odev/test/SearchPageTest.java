package com.kitapyurdu.odev.test;

import com.kitapyurdu.odev.driver.BaseTest;
import com.kitapyurdu.odev.page.SearchPage;
import org.junit.Test;

public class SearchPageTest extends BaseTest {
    @Test
    public void productPage(){
    SearchPage searchPage=new SearchPage();
    searchPage.scrollToSeventh();
    }
}
