package com.echounion.mc.test;

import com.echounion.mc.common.test.TestSupport;
import com.echounion.mc.common.utils.kit.ShiroKit;
import org.junit.Test;

/**
 * Created by phuang on 2016/2/10.
 */
public class ShiroKitTest  extends TestSupport {

    @Test
    public void getpassord(){
        //d3c59d25033dbf980d29554025c23a75

        //a66abb5684c45962d887564f08346e8d
        String password = ShiroKit.md5("123456","admin");
        System.out.println(password);

    }
}
