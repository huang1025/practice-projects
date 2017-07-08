package com.huang.mockito.test;

import org.junit.Before;
import org.mockito.MockitoAnnotations;

/**
 * Created by huang on 2017/7/8.
 */
public class BaseMockito {
    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
    }
}
