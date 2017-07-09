package com.huang.mockito.test;

import com.huang.mockito.model.AbstractEmployeeService;
import com.huang.mockito.model.IEmployeeService;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.List;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

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

    /**
     * mock 对象返回期望值；
     */
    @Test
    public void whenTest() {

        /** 当有多个 when 同时调用同一个 mock 对象的，同一个方法时，最后一个会覆盖前面的； */
        /** 以下全部输出 2 */
        IEmployeeService employeeService1 = mock(IEmployeeService.class);
        when(employeeService1.getAge()).thenReturn(1);
        when(employeeService1.getAge()).thenReturn(2);
        System.out.println(this.employeeService.getAge());
        System.out.println(this.employeeService.getAge());
        System.out.println(this.employeeService.getAge());
        System.out.println(this.employeeService.getAge());
        System.out.println("==========");

        /** 当使用链式调用时，链式的最后一个将成为后面调用的值； */
        IEmployeeService employeeService2 = mock(IEmployeeService.class);
        when(employeeService2.getAge()).thenReturn(1).thenReturn(2);
        System.out.println(employeeService2.getAge());//1
        System.out.println(employeeService2.getAge());//2
        System.out.println(employeeService2.getAge());//2
        System.out.println(employeeService2.getAge());//2
        System.out.println("==========");

        IEmployeeService employeeService3 = mock(IEmployeeService.class);
        when(employeeService3.getAge()).thenReturn(1, 2);
        System.out.println(employeeService3.getAge());//1
        System.out.println(employeeService3.getAge());//2
        System.out.println(employeeService3.getAge());//2
        System.out.println(employeeService3.getAge());//2
        System.out.println("==========");


        /** 使用 doReutrn-when 的方式，也能实现，定制返回值的目的； */
        IEmployeeService employeeService4 = mock(IEmployeeService.class);
        doReturn(12).when(employeeService4).getAge();
        System.out.println(employeeService4.getAge());
    }

    /**
     * mock 对象调用真实方法；
     */
    @Test
    public void callRealMethod() {

        /** mock 的实现类，调用真实方法； */
        EmployeeServiceImpl mockImpl = mock(EmployeeServiceImpl.class);
        when(mockImpl.getAge()).thenCallRealMethod();
        System.out.println(mockImpl.getAge());//17

        /** mock 的抽象类，可以真实调用已经实现的方法，但是不能真实调用抽象方法； */
        AbstractEmployeeService mockAbstract = mock(AbstractEmployeeService.class);
        when(mockAbstract.getAge()).thenCallRealMethod();
        System.out.println(mockAbstract.getAge());
        //when(mockAbstract.getSalaryDate()).thenCallRealMethod();
        //System.out.println(mockAbstract.getSalaryDate());

        /** mock 的接口类，完全不能调用真实方法； */
        //IEmployeeService mockInterface = mock(IEmployeeService.class);
        //when(mockInterface.getAge()).thenCallRealMethod();
        //System.out.println(mockInterface.getAge());
    }


    /**
     * mock 对象未设置期望值，返回默认值；
     */
    @Test
    public void answerTest() {
        IEmployeeService mock = mock(IEmployeeService.class, new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
                return 999;
            }
        });
        System.out.println(mock.getAge());

        /** 当设置了默认返回值，那么默认返回值会被强转成调用方法的返回值类型，如果不能强转，则会报错； */
        //System.out.println(mock.getSalaryDate());
    }

    /**
     * verify 测试；
     */
    @Test
    public void verifyTest() {

        /** 验证方法被调用的次数； */
        List mockList = mock(List.class);
        mockList.add(1);
        verify(mockList, times(1)).add(1);
        mockList.add(1);
        verify(mockList, times(2)).add(1);

        /** 验证方法调用的参数； */
        List mockList2 = mock(List.class);
        mockList2.add("hehe");
        verify(mockList2).add(eq("hehe"));

        /** 验证执行顺序； */
        List mockList3 = mock(List.class);
        List mockList4 = mock(List.class);
        List mockList5 = mock(List.class);
        InOrder inOrder = inOrder(mockList3, mockList4, mockList5);
        mockList4.add(1);
        mockList3.add(1);
        mockList5.add(1);
        inOrder.verify(mockList4).add(any());
        inOrder.verify(mockList3).add(any());
        inOrder.verify(mockList5).add(any());
    }

    /**
     * spy 真实对象；
     */

    /** 使用 spy（）方法时，由于要接受对象，所以一定是对象； */
    /**
     * 如果使用 @spy 标签，那么即使没有给字段赋值，mockito 也会 new 一个值，给这个字段；
     */
    @Spy
    private EmployeeServiceImpl spyEmployeeService;

    /** 接口是不能 spy 的； */
    //@Spy
    //private IEmployeeService spyInterface;

    /**
     * 抽象类是可以 spy 的，已实现的方法会真实调用，为实现的方法给默认空值；
     */
    @Spy
    private AbstractEmployeeService spyAbstract;

    @Test
    public void spyTest() {
        System.out.println(spyEmployeeService.getAge());

        System.out.println(spyAbstract.getSalaryDate());//未实现的方法，给默认空值；
        System.out.println(spyAbstract.getAge());//已实现的方法，真实调用；
        System.out.println("============");

        /** spy 对象，返回给定值，使用 when-thenReutrn 或者 doReturn-when 都是可以的； */
        when(spyEmployeeService.getAge()).thenReturn(14);
        System.out.println(spyEmployeeService.getAge());

        doReturn(15).when(spyEmployeeService).getAge();
        System.out.println(spyEmployeeService.getAge());

        /** 直接报空指针异常； */
        //IEmployeeService employeeService=null;
        // IEmployeeService spy = spy(employeeService);
        //System.out.println(spy.getAge());
    }

    /**
     * 重置 mock 对象；
     */
    @Test
    public void resetTest() {
        EmployeeServiceImpl mock = mock(EmployeeServiceImpl.class);
        when(mock.getAge()).thenReturn(11);
        System.out.println(mock.getAge());//11

        /** 重置指的是，将 mock 对象上所有预设的东西清除，但该对象，还是一个 mock 对象； */
        reset(mock);
        System.out.println(mock.getAge());//o
    }
}


















