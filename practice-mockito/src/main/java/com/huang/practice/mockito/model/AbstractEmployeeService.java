package com.huang.practice.mockito.model;

/**
 * Created by huang on 2017/7/8.
 */
public abstract class AbstractEmployeeService implements IEmployeeService {

    @Override
    public int getAge() {
        return 17;
    }
}
