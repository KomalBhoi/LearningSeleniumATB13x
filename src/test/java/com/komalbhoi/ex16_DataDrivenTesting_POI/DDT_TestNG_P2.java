package com.komalbhoi.ex16_DataDrivenTesting_POI;

import com.komalbhoi.util.commonToAll;
import com.komalbhoi.util.readExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_TestNG_P2 extends commonToAll {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String username,String password){
        System.out.println("Running..");
        System.out.println(username + "-" + password);
        System.out.println();
    }

    @DataProvider(name = "getData")
    public Object[][] getData() {
        return readExcel.getTextDataFromExcel("sheet1");
    }
}
