package com.huang.mockito.test;

import com.huang.mockito.model.AbstractEmployeeService;
import com.huang.mockito.model.IEmployeeService;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;

/**
 * Created by huang on 2017/7/8.
 */
public class MockitoTest extends BaseMockito {

    @Mock
    private IEmployeeService employeeService;

    @Mock
    private EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

    @Mock
    private AbstractEmployeeService abstractEmployeeService;

    /**
     * 直接 mock 接口，接口中所有的方法都会被 mock ，并且返回初始零值；
     */
    @Test
    public void mockitoInterface() {
        System.out.println(employeeService.getAge());
        System.out.println(employeeService.getSalaryDate());
    }

    /**
     * 直接 mock 一个实现类，类中所有的 能访问到的方法 都会被 mock，跟这个对象是否 new，没有关系；
     */
    @Test
    public void mockitoImpl() {
        EmployeeServiceImpl mock = mock(EmployeeServiceImpl.class);
        System.out.println(mock.getAge());
        System.out.println(mock.getSalaryDate());
        System.out.println(mock.getName());

        System.out.println(employeeServiceImpl.getAge());
        System.out.println(employeeServiceImpl.getSalaryDate());
        System.out.println(employeeServiceImpl.getName());
    }

    /**
     * 可以直接 mock 一个抽象类，类中所有 可以见方法都会被 mock；
     */
    @Test
    public void mockitoAbstract() {
        System.out.println(abstractEmployeeService.getAge());
        System.out.println(abstractEmployeeService.getSalaryDate());
    }
}
