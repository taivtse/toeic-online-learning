package vn.myclass.core.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import vn.myclass.core.dao.ListenGuidelineDao;
import vn.myclass.core.daoimpl.ListenGuidelineDaoImpl;
import vn.myclass.core.service.util.SingletonDaoUtil;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ListenGuidelineTest {
    ListenGuidelineDao listenGuidelineDao;
//    @BeforeTest
    public void initData(){
        listenGuidelineDao = new ListenGuidelineDaoImpl();
    }

//    @Test
    public void testFindByProperties(){
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put("title", "Bai huong dan 1");
        properties.put("content", "Noi dung bai huong dan 1");
        Object[] list = listenGuidelineDao.findExactlyByProperties(properties, null, null, null, null);
    }

//    @Test
    public void testFindByID(){
        SingletonDaoUtil.getListenGuidelineDaoInstance().findById(100);
    }
}
