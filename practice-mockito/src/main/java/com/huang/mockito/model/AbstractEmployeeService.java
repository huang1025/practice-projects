package com.huang.mockito.model;

/**
 * Created by huang on 2017/7/8.
 */
public abstract class AbstractEmployeeService implements IEmployeeService {

    @Override
    public int getAge() {
        return 17;
    }
}
